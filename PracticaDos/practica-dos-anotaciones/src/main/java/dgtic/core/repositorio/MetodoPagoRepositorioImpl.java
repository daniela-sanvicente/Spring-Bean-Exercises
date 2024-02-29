package dgtic.core.repositorio;

import dgtic.core.modelo.MetodoPago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MetodoPagoRepositorioImpl implements MetodoPagoRepositorio{
    @Autowired
    public BaseDeDatosDAO baseDeDatosDAO;

    @Override
    public List<MetodoPago> findAll() {
        return baseDeDatosDAO.getMetodosPagos();
    }

    @Override
    public MetodoPago findById(Long id) {
        return baseDeDatosDAO.getMetodoPago(id);
    }

    @Override
    public void save(MetodoPago metodoPago) {
        baseDeDatosDAO.getMetodosPagos().add(metodoPago);
    }
}
