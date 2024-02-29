package dgtic.core.modelo;

public class MetodoPago {
    private Integer id;
    private String metodo;

    public MetodoPago() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    @Override
    public String toString() {
        return "MetodoPago{" +
                "id=" + id +
                ", metodo='" + metodo + '\'' +
                '}';
    }
}
