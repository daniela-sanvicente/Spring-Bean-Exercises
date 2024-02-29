package dgtic.core.repositorio;

import dgtic.core.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
//Cuando una clase tiene las anotaciones de @Component, @Service, @Repository, o @Controller, se convierte en un Spring Bean, y el nombre default es el nombre de la clase con letra primera letra miniscula
@Repository
public class ClienteRepositorioImpl implements  ClienteRepositorio{
    @Autowired
    public BaseDeDatosDAO baseDeDatosDAO;

    @Override
    public List<Cliente> findAll() {
        return baseDeDatosDAO.getClientes();
    }

    @Override
    public Cliente findById(Long id) {
        return baseDeDatosDAO.getCliente(id);
    }

    @Override
    public void save(Cliente cliente) {
        baseDeDatosDAO.getClientes().add(cliente);
    }
}
