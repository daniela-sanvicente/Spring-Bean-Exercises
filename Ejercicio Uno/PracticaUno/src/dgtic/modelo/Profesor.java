package dgtic.modelo;

public class Profesor {

    private String nombre;

    private Responsabilidades responsabilidades;

    public Profesor() {
        responsabilidades= new Responsabilidades();
    }

    public Profesor(Responsabilidades responsabilidades) {
        this.responsabilidades = responsabilidades;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Responsabilidades getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(Responsabilidades responsabilidades) {
        this.responsabilidades = responsabilidades;
    }


}
