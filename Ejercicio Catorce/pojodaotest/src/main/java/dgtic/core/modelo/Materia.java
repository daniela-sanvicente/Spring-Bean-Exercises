package dgtic.core.modelo;

import dgtic.core.excepciones.CreditosMenores;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Materia {

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
