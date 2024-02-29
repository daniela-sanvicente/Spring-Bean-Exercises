package dgtic.core.servicio;

import dgtic.core.modelo.Estudiante;
import org.springframework.context.annotation.*;

@Configuration
@ImportResource(locations = {"classpath:bean_configuration.xml"})
@ComponentScan(basePackages ="dgtic.core")
public class ConfiguracionServicio {
    @Bean(name="estudiante")
    @Scope("prototype")
    public Estudiante servicioEstudiante(){
        Estudiante estudiante=new Estudiante();
        estudiante.setNombre("Miguel");
        estudiante.setEdad(46);
        return estudiante;
    }
}
