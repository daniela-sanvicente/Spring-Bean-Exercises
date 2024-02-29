package dgtic.core.inicio;


import dgtic.core.modelo.Direccion;
import dgtic.core.modelo.Persona;
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
        System.out.println(persona);
        Persona personaDos=context.getBean("persona", Persona.class);
        System.out.println(personaDos);
        System.out.println("------------------------");
        persona.setNombre("Rebeca");
        persona.setEdad(40);
        persona.getDireccion().setCalle("Demo");
        persona.getDireccion().setNumero("34");

        System.out.println(persona);
        System.out.println(personaDos);



        ((ClassPathXmlApplicationContext) context).close();


    }
}