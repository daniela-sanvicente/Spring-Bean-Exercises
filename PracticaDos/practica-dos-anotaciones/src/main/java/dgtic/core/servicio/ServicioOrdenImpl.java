package dgtic.core.servicio;

import dgtic.core.modelo.Orden;

import dgtic.core.repositorio.ClienteRepositorio;
import dgtic.core.repositorio.OrdenRepositorio;
import dgtic.core.repositorio.PagoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioOrdenImpl implements Servicio<Orden>{
    @Autowired
    @Qualifier("ordenRepositorioImpl")
    public OrdenRepositorio ordenRepositorio;
    
    @Autowired
    @Qualifier("clienteRepositorioImpl")
    public ClienteRepositorio clienteRepositorio;
    
    @Autowired
    @Qualifier("pagoRepositorioImpl")
    public PagoRepositorio pagoRepositorio;

    @Override
    public List<Orden> findAll() {
        return ordenRepositorio.findAll();
    }

    @Override
    public Orden findById(Long id) {
        return ordenRepositorio.findById(id);
    }

    @Override
    public void create(Orden entity) {
        ordenRepositorio.save(entity);
    }
}
