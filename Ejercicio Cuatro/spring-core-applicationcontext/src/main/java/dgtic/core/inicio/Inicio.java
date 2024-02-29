package dgtic.core.inicio;

import dgtic.core.servicio.Servicio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Inicio {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext(
                new String[]{
                        "bean_configuration.xml", "bean_services.xml"

                }

        );
        Servicio servicio=(Servicio) context.getBean("servicio");
        System.out.println(servicio);
        ((ClassPathXmlApplicationContext)context).close();

    }
}
