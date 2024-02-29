package dgtic.core.servicio;

import dgtic.core.modelo.Cliente;
import dgtic.core.modelo.MetodoPago;
import dgtic.core.modelo.Pago;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@SpringBootTest
class ServicioPagoImplTest {
    @Autowired
    @Qualifier("servicioPagoImpl")
    private ServicioPagoImpl servicioPago;

    @Test
    void verificarInstancia() {
        assertTrue(servicioPago instanceof ServicioPagoImpl, "El objeto debe ser una instancia de ServicioPagoImpl");
    }

    @Test
    void verificarCreacion() {
        Pago pago = new Pago(
                2L,
                new Cliente(),
                new MetodoPago(),
                "Visa",
                "0127 3681 7262 6273",
                "04/28",
                "012"
        );

        servicioPago.create(pago);

        assertTrue(servicioPago.findAll().contains(pago), "El pago debió ser añadido al ArrayList");
    }

    @Test
    void verificarExistencia() {
        Pago pago=new Pago(
                2L,
                new Cliente(),
                new MetodoPago(),
                "Visa",
                "0123 4567 7891 0112",
                "04/28",
                "012"
        );

        servicioPago.create(pago);

        String esperado="0123 4567 7891 0112";

        assertTrue(servicioPago.findAll().stream().anyMatch(pg -> pg.getNumeroCuenta().equals(esperado)),
                "Se espera que exista un pago de número de cuenta '0123 4567 7891 0112'.");
    }

    @Test
    void verificarCantidad() {
        servicioPago.create(new Pago(
            2L,
            new Cliente(),
            new MetodoPago(),
            "Visa",
            "0127 3681 7262 6273",
            "04/28",
            "012"
        ));

        int esperado = servicioPago.findAll().size();

        List<Pago> pagos = servicioPago.findAll();

        assertEquals(esperado, pagos.size());
    }

    @Test
    void verificarVacio() {
        String campo = "cvv";

        servicioPago.create(new Pago(
            2L,
            new Cliente(),
            new MetodoPago(),
            "Visa",
            "0127 3681 7262 6273",
            "04/28",
            "012"
        ));

        List<Pago> pagos = servicioPago.findAll();

        for (Pago pago: pagos) {
            String valor = pago.getCvv();
            assertFalse(valor.isEmpty(), "El campo " + campo + " no puede ser una cadena vacía.");
        }
    }
}
