package dgtic.core.servicio;

import dgtic.core.modelo.Cliente;
import dgtic.core.modelo.MetodoPago;
import dgtic.core.modelo.Orden;
import dgtic.core.modelo.Pago;
import dgtic.core.repositorio.BaseDeDatosDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ServicioDAOTest {
    @Autowired
    BaseDeDatosDAO baseDeDatosDAO;

    @Autowired
    ServicioDAO servicioDAO;

    @Autowired
    @Qualifier("cliente")
    ServicioClienteImpl beanCliente;

    @Autowired
    @Qualifier("metodoPago")
    ServicioMetodoPagoImpl beanMetodoPago;

    @Autowired
    @Qualifier("pago")
    ServicioPagoImpl beanPago;

    @Autowired
    @Qualifier("orden")
    ServicioOrdenImpl beanOrden;

    @Test
    void verificarNombreCliente() {
        Cliente cliente = baseDeDatosDAO.getCliente(1L);
        
        assertEquals("Petro", cliente.getNombre(), "No son iguales");
    }

    @Test
    void verificarMetodoPago() {
        MetodoPago metodoPago = baseDeDatosDAO.getMetodoPago(1L);

        assertNotEquals("TDB", metodoPago.getMetodo(), "No es distinto");
    }

    @Test
    void verificarClienteDePago() {
        Pago pago = baseDeDatosDAO.getPago(1L);

        assertEquals("Lionel", pago.getCliente().getApellido(), "No son iguales");
    }

    @Test
    void verificarAsociacionOrden() {
        Orden orden = baseDeDatosDAO.getOrden(1L);

        assertEquals("0127 3681 7262 6273", orden.getPago().getNumeroCuenta(), "No son iguales");
        assertEquals("5556911167", orden.getCliente().getTelefonoCasa(), "No son iguales");
    }

    @Test
    void verificarInstanciacionDAO() {
        var servicioCliente = servicioDAO.servicioCliente();
        var servicioMetodoPago = servicioDAO.servicioMetodoPago();
        var servicioOrden = servicioDAO.servicioOrden();
        var servicioPago = servicioDAO.servicioPago();

        assertTrue(servicioCliente instanceof ServicioClienteImpl, "El objeto debe ser una instancia de ServicioClienteImpl");
        assertTrue(servicioMetodoPago instanceof ServicioMetodoPagoImpl, "El objeto debe ser una instancia de ServicioMetodoPagoImpl");
        assertTrue(servicioPago instanceof ServicioPagoImpl, "El objeto debe ser una instancia de ServicioPagoImpl");
        assertTrue(servicioOrden instanceof ServicioOrdenImpl, "El objeto debe ser una instancia de ServicioOrdenImpl");
    }

    @Test
    void verificarBeansDAO() {
        assertTrue(beanCliente instanceof ServicioClienteImpl, "El objeto debe ser una instancia de ServicioClienteImpl");
        assertTrue(beanMetodoPago instanceof ServicioMetodoPagoImpl, "El objeto debe ser una instancia de ServicioMetodoPagoImpl");
        assertTrue(beanPago instanceof ServicioPagoImpl, "El objeto debe ser una instancia de ServicioPagoImpl");
        assertTrue(beanOrden instanceof ServicioOrdenImpl, "El objeto debe ser una instancia de ServicioOrdenImpl");
    }
}
