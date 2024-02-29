package dgtic.core.repositorio;

import dgtic.core.modelo.Cliente;
import dgtic.core.modelo.MetodoPago;
import dgtic.core.modelo.Orden;
import dgtic.core.modelo.Pago;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("baseDeDatosDAO")
public class BaseDeDatosDAOImpl implements BaseDeDatosDAO {
    @Override
    public List<Cliente> getClientes() {
        return BaseDeDatos.clientes;
    }

    @Override
    public Cliente getCliente(Long id) {
        return BaseDeDatos.clientes.get(Math.toIntExact(id - 1));
    }

    @Override
    public List<MetodoPago> getMetodosPagos() {
        return BaseDeDatos.metodosPagos;
    }

    @Override
    public MetodoPago getMetodoPago(Long id) {
        return BaseDeDatos.metodosPagos.get(Math.toIntExact(id - 1));
    }

    @Override
    public List<Pago> getPagos() {
        return BaseDeDatos.pagos;
    }

    @Override
    public Pago getPago(Long id) {
        return BaseDeDatos.pagos.get(Math.toIntExact(id - 1));
    }

    @Override
    public List<Orden> getOrdenes() {
        return BaseDeDatos.ordenes;
    }

    @Override
    public Orden getOrden(Long id) {
        return BaseDeDatos.ordenes.get(Math.toIntExact(id - 1));
    }
}
