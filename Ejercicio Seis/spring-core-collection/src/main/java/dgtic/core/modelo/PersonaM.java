package dgtic.core.modelo;

import java.util.Collection;
import java.util.Map;

public class PersonaM {

    private String nombre;

    private Integer edad;

    private Map<String, Actividades> actividades;

    public PersonaM() {
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

    public Map<String, Actividades> getActividades() {
        return actividades;
    }

    public void setActividades(Map<String, Actividades> actividades) {
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
