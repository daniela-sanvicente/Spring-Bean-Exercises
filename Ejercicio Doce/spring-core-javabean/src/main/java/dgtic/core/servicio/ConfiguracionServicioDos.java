package dgtic.core.servicio;

import dgtic.core.modelo.Estudiante;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfiguracionServicioDos {
    @Bean(name="estudianteTres")
    @Scope("prototype")
    public Estudiante servicioEstudiante(){
        Estudiante estudiante=new Estudiante();
        estudiante.setNombre("Miguel");
        estudiante.setEdad(46);
        return estudiante;
    }
}
