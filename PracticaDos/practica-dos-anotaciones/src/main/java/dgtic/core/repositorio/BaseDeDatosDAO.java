package dgtic.core.repositorio;

import dgtic.core.modelo.Cliente;
import dgtic.core.modelo.MetodoPago;
import dgtic.core.modelo.Orden;
import dgtic.core.modelo.Pago;

import java.util.List;

public interface BaseDeDatosDAO {

    List<Cliente> getClientes();
    Cliente getCliente(Long id);

    List<MetodoPago> getMetodosPagos();
    MetodoPago getMetodoPago(Long id);

    List<Pago> getPagos();
    Pago getPago(Long id);

    List<Orden> getOrdenes();
    Orden getOrden(Long id);
}
