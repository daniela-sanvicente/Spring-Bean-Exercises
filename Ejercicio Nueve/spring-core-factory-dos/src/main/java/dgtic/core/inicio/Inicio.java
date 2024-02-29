package dgtic.core.inicio;


import dgtic.core.servicio.EmpleadoServicio;
import dgtic.core.servicio.PredeterminadoServicio;
import dgtic.core.servicio.ReporteEmpleadoServicio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Inicio {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{
                        "bean_configuration.xml", "bean_services.xml"
                }
        );

        EmpleadoServicio servicioUno=(EmpleadoServicio)context.getBean("empleadoServicio");
        servicioUno.servicioEmpleado();
        ReporteEmpleadoServicio reporteEmpleadoServicio=(ReporteEmpleadoServicio) context.getBean("empleadoServicioReporte");
        reporteEmpleadoServicio.reporteDiario();
        System.out.println("-----------------");

        PredeterminadoServicio predeterminadoServicio=context.getBean("servicioLocal", PredeterminadoServicio.class) ;
        predeterminadoServicio.getEmpleadoServicio().servicioEmpleado();
        predeterminadoServicio.getReporteEmpleadoServicio().reporteDiario();

       ((ClassPathXmlApplicationContext) context).close();


    }
}