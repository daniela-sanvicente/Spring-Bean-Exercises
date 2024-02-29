package dgtic.core.repositorio;

import dgtic.core.modelo.Pago;

import java.util.List;

public interface PagoRepositorio {
    List<Pago> findAll();
    Pago findById(Long id);
    void save(Pago pago);

}
