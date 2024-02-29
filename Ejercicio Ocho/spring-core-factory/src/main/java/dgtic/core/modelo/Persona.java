package dgtic.core.modelo;

import dgtic.core.servicio.FabricaCoches;

import java.util.Collection;

public class Persona {

    private String nombre;

    private Integer edad;

    private FabricaCoches coches;

    public Persona() {
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public FabricaCoches getCoches() {
        return coches;
    }

    public void setCoches(FabricaCoches coches) {
        this.coches = coches;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
