package dgtic.core.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pago {
    private Long id;
    private Cliente cliente;
    private MetodoPago metodoPago;
    private String emisor;
    private String numeroCuenta;
    private String fechaExpiracion;
    private String cvv;
}
