package dgtic.core.inicio;


import dgtic.core.modelo.Actividades;
import dgtic.core.modelo.Persona;
import dgtic.core.modelo.PersonaM;
import dgtic.core.modelo.PersonaP;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;


public class Inicio {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{
                        "bean_configuration.xml"
                }
        );
        Persona persona = (Persona) context.getBean("persona");
        System.out.println(persona);
        for (Actividades actividades : persona.getActividades()) {
            actividades.realiza();
        }

        System.out.println("-----------------");
        Persona personaDos = (Persona) context.getBean("personaDos");
        System.out.println(personaDos);
        for (Actividades actividades : personaDos.getActividades()) {
            actividades.realiza();
        }

        System.out.println("-----------------");
        PersonaM personaTres = (PersonaM) context.getBean("personaTres");
        System.out.println(personaTres);
        for (String llave : personaTres.getActividades().keySet()) {
            System.out.println("Llave: " + llave);
            personaTres.getActividades().get(llave).realiza();
        }

        System.out.println("-----------------");
        PersonaP personaCuatro = (PersonaP) context.getBean("personaCuatro");
        System.out.println(personaCuatro);
        for (Iterator<Object> iter = personaCuatro.getActividades().keySet().iterator(); iter.hasNext(); ) {
            String llave = (String) iter.next();
            System.out.println("Llave: " + llave);
            System.out.println(personaCuatro.getActividades().get(llave));
            ((ClassPathXmlApplicationContext) context).close();

        }
    }
}