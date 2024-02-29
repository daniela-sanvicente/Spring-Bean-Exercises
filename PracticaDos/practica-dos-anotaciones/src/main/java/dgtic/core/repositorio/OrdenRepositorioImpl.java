package dgtic.core.repositorio;

import dgtic.core.modelo.Orden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrdenRepositorioImpl implements OrdenRepositorio{
    @Autowired
    public BaseDeDatosDAO baseDeDatosDAO;

    @Override
    public List<Orden> findAll() {
        return baseDeDatosDAO.getOrdenes();
    }

    @Override
    public Orden findById(Long id) {
        return baseDeDatosDAO.getOrden(id);
    }

    @Override
    public void save(Orden orden) {
        baseDeDatosDAO.getOrdenes().add(orden);
    }
}
