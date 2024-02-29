package dgtic.core.modelo;

public class Dulces {
    private Integer id;
    private String nombreDulce;
    private Double precio;
    private String tema;
    private String tipo;
    private Integer stock;
    private String imagen;
    private String tiempoElaboracion;

    public Dulces() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreDulce() {
        return nombreDulce;
    }

    public void setNombreDulce(String nombreDulce) {
        this.nombreDulce = nombreDulce;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTiempoElaboracion() {
        return tiempoElaboracion;
    }

    public void setTiempoElaboracion(String tiempoElaboracion) {
        this.tiempoElaboracion = tiempoElaboracion;
    }

    @Override
    public String toString() {
        return "Dulces{" +
                "id=" + id +
                ", nombreDulce='" + nombreDulce + '\'' +
                ", precio=" + precio +
                ", tema='" + tema + '\'' +
                ", tipo='" + tipo + '\'' +
                ", stock=" + stock +
                ", imagen='" + imagen + '\'' +
                ", tiempoElaboracion='" + tiempoElaboracion + '\'' +
                '}';
    }
}
