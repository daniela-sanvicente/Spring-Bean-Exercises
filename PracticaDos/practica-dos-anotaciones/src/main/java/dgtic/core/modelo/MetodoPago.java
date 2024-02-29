package dgtic.core.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MetodoPago {
    private Long id;
    private String metodo;
}
