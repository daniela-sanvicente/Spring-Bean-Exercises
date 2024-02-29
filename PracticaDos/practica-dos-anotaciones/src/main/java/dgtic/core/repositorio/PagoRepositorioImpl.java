package dgtic.core.repositorio;

import dgtic.core.modelo.Pago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PagoRepositorioImpl implements PagoRepositorio{
    @Autowired
    public BaseDeDatosDAO baseDeDatosDAO;

    @Override
    public List<Pago> findAll() {
        return baseDeDatosDAO.getPagos();
    }

    @Override
    public Pago findById(Long id) {
        return baseDeDatosDAO.getPago(id);
    }

    @Override
    public void save(Pago pago) {
        baseDeDatosDAO.getPagos().add(pago);
    }
}
