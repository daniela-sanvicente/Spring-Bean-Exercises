package dgtic.core.inicio;


import dgtic.core.modelo.Persona;
import dgtic.core.modelo.PlanificacionProyectos;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Inicio {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{
                        "bean_configuration.xml"
                }
        );
        Persona persona=(Persona)context.getBean("persona");
        System.out.println(persona);
        if(persona.getActividades()!=null){
            persona.getActividades().realiza();
        }else{
            PlanificacionProyectos proyectos=new PlanificacionProyectos();
            persona.setActividades(proyectos);
            persona.getActividades().realiza();
        }

        ((ClassPathXmlApplicationContext)context).close();

    }
}
