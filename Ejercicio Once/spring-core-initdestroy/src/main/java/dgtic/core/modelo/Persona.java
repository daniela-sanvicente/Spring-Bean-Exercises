package dgtic.core.modelo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;



public class Persona  implements InitializingBean{
    private String nombre;
    private Integer edad;
    private Direccion direccion;
    private List<Persona> contactos= new ArrayList<>();
    private Computadora computadora;

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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}'+ " "+direccion + " "+computadora;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Iniciando Persona...");

    }

    public void limpiar(){
        System.out.println("Liberar recursos Persona");
    }
}
