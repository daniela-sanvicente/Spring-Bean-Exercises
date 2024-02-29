package dgtic.core.repositorio;

import dgtic.core.modelo.MetodoPago;

import java.util.List;

public interface MetodoPagoRepositorio {
    List<MetodoPago> findAll();
    MetodoPago findById(Long id);
    void save(MetodoPago metodoPago);

}
