package dgtic.core.modelo;

import dgtic.core.excepciones.CreditosMenores;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Materia {


    private Long id;
    private String nombre;
    private Integer creditos;


    public void setCreditos(Integer creditos) {
        if(creditos<0) {
            throw new CreditosMenores("No creditos negativos");
        }else {
            this.creditos = creditos;
        }
    }
}
