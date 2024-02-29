package dgtic.core.modelo;


import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class Estudiante {
    private String matricula;
    private String nombre;
    private int edad;
    private List<Materia> materias=new ArrayList<>();

    public Estudiante(String matricula, String nombre, int edad) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
    }


    public void setMaterias(Materia... materias) {
        this.materias.addAll(Arrays.asList(materias));
    }
}
