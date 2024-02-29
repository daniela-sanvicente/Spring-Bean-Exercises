package dgtic.core.servicio;

import dgtic.core.modelo.Pago;
import dgtic.core.repositorio.ClienteRepositorio;
import dgtic.core.repositorio.MetodoPagoRepositorio;
import dgtic.core.repositorio.PagoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioPagoImpl implements Servicio<Pago>{
    @Autowired
    @Qualifier("pagoRepositorioImpl")
    public PagoRepositorio pagoRepositorio;

    @Autowired
    @Qualifier("clienteRepositorioImpl")
    public ClienteRepositorio clienteRepositorio;

    @Autowired
    @Qualifier("metodoPagoRepositorioImpl")
    public MetodoPagoRepositorio metodoPagoRepositorio;

    @Override
    public List<Pago> findAll() {
        return pagoRepositorio.findAll();
    }

    @Override
    public Pago findById(Long id) {
        return pagoRepositorio.findById(id);
    }

    @Override
    public void create(Pago entity) {
        pagoRepositorio.save(entity);
    }
}
