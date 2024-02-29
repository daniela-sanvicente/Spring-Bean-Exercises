package dgtic.core.inicio;


import dgtic.core.modelo.Cliente;
import dgtic.core.modelo.Dulces;
import dgtic.core.modelo.MetodoPago;
import dgtic.core.modelo.Pago;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Inicio {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{
                        "bean_configuration.xml"
                }
        );

        Cliente cliente=context.getBean("Cliente", Cliente.class);
        MetodoPago metodoPago=context.getBean("MetodoPago", MetodoPago.class);
        Pago pago=context.getBean("pago", Pago.class); //el primer argumento de getBean es el id del bean en bean_configuration.xml
        Dulces dulces=context.getBean("dulces", Dulces.class);

        System.out.println(cliente+"\n"+ metodoPago+"\n"+ pago+"\n"+ dulces);


        System.out.println("------------------------");
        cliente.setNombre("Angelino");
        metodoPago.setMetodo("TDB");
        dulces.setTiempoElaboracion("15 dias");
        pago.setEmisor("Visa");

        System.out.println(cliente+"\n"+ metodoPago+"\n"+ pago+"\n"+ dulces);



        ((ClassPathXmlApplicationContext) context).close();


    }
}