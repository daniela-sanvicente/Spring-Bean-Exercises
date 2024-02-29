package dgtic.core.inicio;


import dgtic.core.modelo.Persona;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Inicio {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{
                        "bean_configuration.xml"
                }
        );
        Persona persona = (Persona) context.getBean("persona");
        System.out.println(persona);
        persona.getActividades().realiza();
        ((ClassPathXmlApplicationContext) context).close();


    }
}