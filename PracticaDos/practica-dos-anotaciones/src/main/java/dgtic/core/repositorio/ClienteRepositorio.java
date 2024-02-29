package dgtic.core.repositorio;

import dgtic.core.modelo.Cliente;

import java.util.List;

public interface ClienteRepositorio {
    List<Cliente> findAll();
    Cliente findById(Long id);
    void save(Cliente cliente);

}
