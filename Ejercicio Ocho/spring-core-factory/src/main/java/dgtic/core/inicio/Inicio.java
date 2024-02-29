package dgtic.core.inicio;


import dgtic.core.modelo.Persona;
import dgtic.core.modelo.TipoCarro;
import dgtic.core.servicio.Deportivo;
import dgtic.core.servicio.TodoTerreno;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Inicio {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{
                        "bean_configuration.xml", "bean_services.xml"
                }
        );
        Persona persona = (Persona) context.getBean("persona");
        System.out.println(persona);
        Deportivo dep=(Deportivo)persona.getCoches().getModeloCoche(TipoCarro.DEPORTIVO);
        dep.setColor("Rojo");
        dep.crear();
        TodoTerreno tod=(TodoTerreno) persona.getCoches().getModeloCoche(TipoCarro.TODOTERRENO);
        tod.crear();
        Persona personaDos= (Persona) context.getBean("persona");
        System.out.println(personaDos);
        ((ClassPathXmlApplicationContext) context).close();


    }
}