package dgtic.core.servicio;

import dgtic.core.modelo.MetodoPago;
import dgtic.core.repositorio.MetodoPagoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioMetodoPagoImpl implements Servicio<MetodoPago> {
    @Autowired
    @Qualifier("metodoPagoRepositorioImpl")
    public MetodoPagoRepositorio metodoPagoRepositorio;

    @Override
    public List<MetodoPago> findAll() {
        return metodoPagoRepositorio.findAll();
    }

    @Override
    public MetodoPago findById(Long id) {
        return metodoPagoRepositorio.findById(id);
    }

    @Override
    public void create(MetodoPago entity) {
        metodoPagoRepositorio.save(entity);
    }
}
