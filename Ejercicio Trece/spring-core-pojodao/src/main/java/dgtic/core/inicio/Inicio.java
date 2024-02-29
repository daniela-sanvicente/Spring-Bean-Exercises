package dgtic.core.inicio;



import dgtic.core.modelo.Estudiante;

import dgtic.core.repositorio.BaseDeDatosDAO;
import dgtic.core.repositorio.BaseDeDatosDAOImpl;
import dgtic.core.servicio.ServicioDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Inicio {
    public static void main(String[] args) {
        /*ConfigurableApplicationContext context=
                new AnnotationConfigApplicationContext(BaseDeDatosDAOImpl.class);*/
        ConfigurableApplicationContext context=
                new AnnotationConfigApplicationContext("dgtic.core");

        BaseDeDatosDAO baseDeDatosDAO=context.getBean("baseDeDatosDAOUno", BaseDeDatosDAOImpl.class);
        System.out.println(baseDeDatosDAO.getEstudiantes("ico"));
        Estudiante estudiante=baseDeDatosDAO.getEstudiante("ico", "124");
        System.out.println(estudiante);
        System.out.println("************************");
        ServicioDAO csv=context.getBean(ServicioDAO.class);
        System.out.println(csv.archivoCSV("ico"));

        ((AnnotationConfigApplicationContext)context).close();




    }
}