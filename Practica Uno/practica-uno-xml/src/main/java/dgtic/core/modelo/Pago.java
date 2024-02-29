package dgtic.core.modelo;

public class Pago {

    private Integer id;
    private Cliente cliente;
    private MetodoPago metodoPago;
    private String emisor;
    private String numeroCuenta;
    private String fechaExpiracion;
    private String cvv;

    public Pago() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", metodoPago=" + metodoPago +
                ", emisor='" + emisor + '\'' +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", fechaExpiracion='" + fechaExpiracion + '\'' +
                ", cvv='" + cvv + '\'' +
                '}';
    }
}
