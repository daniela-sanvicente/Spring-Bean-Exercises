package dgtic.core.modelo;

import java.util.Collection;

public class Persona {

    private String nombre;

    private Integer edad;

    private Actividades actividades;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(Actividades actividadess) {
        this.actividades = actividadess;
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

    public Actividades getActividades() {
        return actividades;
    }

    public void setActividades(Actividades actividades) {
        this.actividades = actividades;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
