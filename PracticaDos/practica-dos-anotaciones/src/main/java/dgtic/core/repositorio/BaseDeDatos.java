package dgtic.core.repositorio;

import dgtic.core.modelo.Cliente;
import dgtic.core.modelo.MetodoPago;
import dgtic.core.modelo.Orden;
import dgtic.core.modelo.Pago;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    public static final List<MetodoPago> metodosPagos = new ArrayList<>();
    public static final List<Pago> pagos = new ArrayList<>();
    public static final List<Cliente> clientes = new ArrayList<>();
    public static final List<Orden> ordenes = new ArrayList<>();

    static {
        Cliente cliente=new Cliente(
                1L,
                "Petro",
                "Lionel",
                "petro@gmail.com",
                "5556911167",
                "5514204601",
                "Calle 20 de nov. Mz.47 Lt. 27",
                "petro2009",
                "revendedor"
        );


        MetodoPago metodoPago=new MetodoPago(
                1L,
                "TDC"
        );

        Pago pago=new Pago(
                1L,
                cliente,
                metodoPago,
                "Visa",
                "0127 3681 7262 6273",
                "04/28",
                "012"
        );

        Orden orden=new Orden(
                1L,
                cliente,
                pago,
                "mixto",
                "realizado",
                "Calle 20 de nov. Mz.47 Lt. 27",
                2000.00,
                LocalDateTime.of(2024,1,20,9,56),
                LocalDateTime.of(2024,1,20,9,56).plus(7,ChronoUnit.DAYS),
                0.00,
                4000.00
        );

        clientes.add(cliente);
        metodosPagos.add(metodoPago);
        pagos.add(pago);
        ordenes.add(orden);
    }
}
