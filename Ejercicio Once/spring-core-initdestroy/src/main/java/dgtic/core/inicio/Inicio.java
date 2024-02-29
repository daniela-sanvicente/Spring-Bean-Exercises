package dgtic.core.inicio;


import dgtic.core.modelo.Direccion;
import dgtic.core.modelo.Persona;
import dgtic.core.servicio.Servicio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Inicio {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{
                        "bean_configuration.xml", "bean_services.xml"
                }
        );

        Persona persona=context.getBean("persona", Persona.class);
        System.out.println(persona.getNombre());

        persona.limpiar();
        System.out.println("*********");
        Servicio servicio=(Servicio)context.getBean("servicio");
        //servicio.destruir();



        ((ClassPathXmlApplicationContext) context).close();


    }
}