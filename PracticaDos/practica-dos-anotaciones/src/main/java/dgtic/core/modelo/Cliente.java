package dgtic.core.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente{
    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefonoCasa;
    private String whatsApp;
    private String direccion;
    private String contrasena;
    private String tipo;
}
