package dgtic.core.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orden {
    private Long id;
    private Cliente cliente;
    private Pago pago;
    private String tipoOrden;
    private String estatus;
    private String direccionEntrega;
    private double anticipo;
    private LocalDateTime momentoPedido;
    private LocalDateTime momentoEntrega;
    private double descuento;
    private double precioTotal;
}
