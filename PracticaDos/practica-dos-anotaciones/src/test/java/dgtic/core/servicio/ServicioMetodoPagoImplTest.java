package dgtic.core.servicio;

import dgtic.core.modelo.MetodoPago;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@SpringBootTest
class ServicioMetodoPagoImplTest {
    @Autowired
    @Qualifier("servicioMetodoPagoImpl")
    private ServicioMetodoPagoImpl servicioMetodoPago;

    @Test
    void verificarInstancia() {
        assertTrue(servicioMetodoPago instanceof ServicioMetodoPagoImpl, "El objeto debe ser una instancia de ServicioMetodoPagoImpl");
    }

    @Test
    void verificarCreacion() {
        MetodoPago metodoPago=new MetodoPago(
                2L,
                "TDB"
        );

        servicioMetodoPago.create(metodoPago);
        
        assertTrue(servicioMetodoPago.findAll().contains(metodoPago), "El metodoPago debió ser añadido al ArrayList");
    }

    @Test
    void verificarExistencia() {
        MetodoPago metodoPago=new MetodoPago(
                3L,
                "Depósito"
        );

        servicioMetodoPago.create(metodoPago);
        
        String esperado="Depósito";
        
        assertTrue(servicioMetodoPago.findAll().stream().anyMatch(mp -> mp.getMetodo().equals(esperado)),
                "Se espera que exista un metodoPago de nombre 'Depósito'.");
    }

    @Test
    void verificarCantidad() {
        servicioMetodoPago.create(new MetodoPago(
            2L,
            "TDB"
        ));

        int esperado = servicioMetodoPago.findAll().size();

        List<MetodoPago> metodosPagos = servicioMetodoPago.findAll();

        assertEquals(esperado, metodosPagos.size());
    }

    @Test
    void verificarVacio() {
        String campo = "método";

        servicioMetodoPago.create(new MetodoPago(
            2L,
            "TDB"
        ));

        List<MetodoPago> metodosPagos = servicioMetodoPago.findAll();

        for (MetodoPago metodoPago: metodosPagos) {
            String valor = metodoPago.getMetodo();
            assertFalse(valor.isEmpty(), "El campo " + campo + " no puede ser una cadena vacía.");
        }
    }
}
