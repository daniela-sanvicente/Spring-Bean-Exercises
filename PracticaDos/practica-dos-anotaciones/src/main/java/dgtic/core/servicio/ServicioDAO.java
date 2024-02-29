package dgtic.core.servicio;

import dgtic.core.repositorio.BaseDeDatosDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

//Autowired es para inyectar estos objetos en clases que los necesiten (que dependan de ellos, por eso el nombre de inyeccion de una dependencia).
@Service
public class ServicioDAO {
    @Autowired
    @Qualifier("baseDeDatosDAO")
    private BaseDeDatosDAO baseDeDatosDAO;

    @Bean(name = "metodoPago")
    @Scope("prototype")
    public ServicioMetodoPagoImpl servicioMetodoPago() {
        return new ServicioMetodoPagoImpl();
    }

    @Bean(name = "orden")
    @Scope("prototype")
    public ServicioOrdenImpl servicioOrden() {
        return new ServicioOrdenImpl();
    }

    @Bean(name = "pago")
    @Scope("prototype")
    public ServicioPagoImpl servicioPago() {
        return new ServicioPagoImpl();
    }

    @Bean(name = "cliente")
    @Scope("prototype")
    public ServicioClienteImpl servicioCliente() {
        return new ServicioClienteImpl();
    }
}
