package dgtic.core.inicio;



import dgtic.core.modelo.Estudiante;

import dgtic.core.servicio.ConfiguracionServicio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Inicio {
    public static void main(String[] args) {
        /*ConfigurableApplicationContext context=
                new AnnotationConfigApplicationContext(ConfiguracionServicio.class);*/
        /*ApplicationContext context=new AnnotationConfigApplicationContext("dgtic.core");*/
        ConfigurableApplicationContext context=
                new AnnotationConfigApplicationContext(ConfiguracionServicio.class);
        Estudiante estudiante=context.getBean("estudiante",Estudiante.class);
        Estudiante estudianteDos=context.getBean("estudiante",Estudiante.class);
        System.out.println(estudiante);
        System.out.println(estudianteDos);
        estudiante.setNombre("Raul");
        System.out.println(estudiante);
        System.out.println(estudianteDos);
        Estudiante estudianteTres=context.getBean("estudianteDos",Estudiante.class);
        System.out.println(estudianteTres);
        Estudiante estudianteCuatro=context.getBean("estudianteTres",Estudiante.class);
        System.out.println(estudianteCuatro);
        //context.close();
        ((AnnotationConfigApplicationContext)context).close();





    }
}