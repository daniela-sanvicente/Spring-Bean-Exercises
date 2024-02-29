package dgtic.core.modelo;

import java.util.Collection;

public class Persona {

    private String nombre;

    private Integer edad;

    private Collection<Actividades> actividades;

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

    public Collection<Actividades> getActividades() {
        return actividades;
    }

    public void setActividades(Collection<Actividades> actividades) {
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
