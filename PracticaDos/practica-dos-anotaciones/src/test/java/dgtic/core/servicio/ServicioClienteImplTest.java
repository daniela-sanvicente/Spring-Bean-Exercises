package dgtic.core.servicio;

import dgtic.core.modelo.Cliente;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@SpringBootTest
class ServicioClienteImplTest {
    @Autowired
    @Qualifier("servicioClienteImpl")
    private ServicioClienteImpl servicioCliente;

    @Test
    void verificarInstancia() {
        assertTrue(servicioCliente instanceof ServicioClienteImpl, "El objeto debe ser una instancia de ServicioClienteImpl");
    }

    @Test
    void verificarCreacion() {
        Cliente cliente=new Cliente(
                2L,
                "Amuro",
                "Ray",
                "amuro@gmail.com",
                "5556911167",
                "5514204601",
                "Calle 20 de nov. Mz.47 Lt. 27",
                "amuro2009",
                "revendedor"
        );

        this.servicioCliente.create(cliente);

        assertTrue(servicioCliente.findAll().contains(cliente), "El cliente debió ser añadido al ArrayList");
    }

    @Test
    void verificarExistencia() {
        Cliente cliente=new Cliente(
                3L,
                "Audrey",
                "Hepburn",
                "audrey@gmail.com",
                "5556911167",
                "5514204601",
                "Calle 20 de nov. Mz.47 Lt. 27",
                "audrey2009",
                "revendedor"
        );

        this.servicioCliente.create(cliente);

        String esperado="Audrey";

        assertTrue(servicioCliente.findAll().stream().anyMatch(cl -> cl.getNombre().equals(esperado)),
                "Se espera que exista un cliente de nombre 'Audrey'.");
    }

    @Test
    void verificarCantidad() {
        servicioCliente.create(new Cliente(
            2L,
            "Amuro",
            "Ray",
            "amuro@gmail.com",
            "5556911167",
            "5514204601",
            "Calle 20 de nov. Mz.47 Lt. 27",
            "amuro2009",
            "revendedor"
        ));

        int esperado = servicioCliente.findAll().size();

        List<Cliente> clientes = servicioCliente.findAll();

        assertEquals(esperado, clientes.size());
    }

    @Test
    void verificarVacio() {
        String campo = "nombre";

        servicioCliente.create(new Cliente(
            2L,
            "Amuro",
            "Ray",
            "amuro@gmail.com",
            "5556911167",
            "5514204601",
            "Calle 20 de nov. Mz.47 Lt. 27",
            "amuro2009",
            "revendedor"
        ));

        List<Cliente> clientes = servicioCliente.findAll();

        for (Cliente cliente: clientes) {
            String valor = cliente.getNombre();
            assertFalse(valor.isEmpty(), "El campo " + campo + " no puede ser una cadena vacía.");
        }
    }
}
