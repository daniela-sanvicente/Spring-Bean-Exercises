package dgtic.core.servicio;

import dgtic.core.modelo.Cliente;
import dgtic.core.modelo.Orden;
import dgtic.core.modelo.Pago;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ServicioOrdenImplTest {
    @Autowired
    @Qualifier("servicioOrdenImpl")
    private ServicioOrdenImpl servicioOrden;

    @Test
    void verificarInstancia() {
        assertTrue(servicioOrden instanceof ServicioOrdenImpl, "El objeto debe ser una instancia de ServicioOrdenImpl");
    }

    @Test
    void verificarCreacion() {
        Orden orden=new Orden(
                2L,
                new Cliente(),
                new Pago(),
                "mixto",
                "realizado",
                "Calle 20 de nov. Mz.47 Lt. 27",
                2000.00,
                LocalDateTime.of(2024,1,20,9,56),
                LocalDateTime.of(2024,1,20,9,56).plus(7, ChronoUnit.DAYS),
                0.00,
                4000.00
        );

        servicioOrden.create(orden);

        assertTrue(servicioOrden.findAll().contains(orden), "El orden debió ser añadido al ArrayList");
    }

    @Test
    void verificarExistencia() {
        Orden orden=new Orden(
                2L,
                new Cliente(),
                new Pago(),
                "mayoreo",
                "realizado",
                "Calle 20 de nov. Mz.47 Lt. 27",
                2000.00,
                LocalDateTime.of(2024,1,20,9,56),
                LocalDateTime.of(2024,1,20,9,56).plus(7,ChronoUnit.DAYS),
                0.00,
                4000.00
        );

        servicioOrden.create(orden);
        
        String esperado="mayoreo";
        
        assertTrue(servicioOrden.findAll().stream().anyMatch(od -> od.getTipoOrden().equals(esperado)),
                "Se espera que exista un tipo de orden de tipo 'mayoreo'.");
    }

    @Test
    void verificarCantidad() {
        servicioOrden.create(new Orden(
            2L,
            new Cliente(),
            new Pago(),
            "mixto",
            "realizado",
            "Calle 20 de nov. Mz.47 Lt. 27",
            2000.00,
            LocalDateTime.of(2024,1,20,9,56),
            LocalDateTime.of(2024,1,20,9,56).plus(7, ChronoUnit.DAYS),
            0.00,
            4000.00
        ));

        int esperado = servicioOrden.findAll().size();

        List<Orden> ordenes = servicioOrden.findAll();

        assertEquals(esperado, ordenes.size());
    }

    @Test
    void verificarVacio() {
        String campo = "estatus";

        servicioOrden.create(new Orden(
            2L,
            new Cliente(),
            new Pago(),
            "mixto",
            "realizado",
            "Calle 20 de nov. Mz.47 Lt. 27",
            2000.00,
            LocalDateTime.of(2024,1,20,9,56),
            LocalDateTime.of(2024,1,20,9,56).plus(7, ChronoUnit.DAYS),
            0.00,
            4000.00
        ));

        List<Orden> ordenes = servicioOrden.findAll();

        for (Orden orden: ordenes) {
            String valor = orden.getEstatus();
            assertFalse(valor.isEmpty(), "El campo " + campo + " no puede ser una cadena vacía.");
        }
    }
}