package dgtic.core.repositorio;

import dgtic.core.modelo.Orden;

import java.util.List;

public interface OrdenRepositorio {

    List<Orden> findAll();
    Orden findById(Long id);
    void save(Orden orden);

}
