package dgtic.core.servicio;

import dgtic.core.modelo.Cliente;

import dgtic.core.repositorio.ClienteRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioClienteImpl implements Servicio<Cliente> {
    @Autowired
    @Qualifier("clienteRepositorioImpl")
    public ClienteRepositorio clienteRepositorio;

    @Override
    public List<Cliente> findAll() {
        return clienteRepositorio.findAll();
    }

    @Override
    public Cliente findById(Long id) {
        return clienteRepositorio.findById(id);
    }

    @Override
    public void create(Cliente entity) {
        clienteRepositorio.save(entity);
    }


}
