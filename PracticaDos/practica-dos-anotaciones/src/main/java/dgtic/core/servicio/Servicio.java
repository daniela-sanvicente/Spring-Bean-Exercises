package dgtic.core.servicio;

import java.util.List;

public interface Servicio <TipoEnviado>{
    List<TipoEnviado> findAll();

    TipoEnviado findById(Long id);

    void create(TipoEnviado entity);
}
