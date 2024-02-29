package dgtic.core.modelo;

import java.util.Collection;
import java.util.Properties;

public class PersonaP {

    private String nombre;

    private Integer edad;

    private Properties actividades;

    public PersonaP() {
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

    public Properties getActividades() {
        return actividades;
    }

    public void setActividades(Properties actividades) {
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
