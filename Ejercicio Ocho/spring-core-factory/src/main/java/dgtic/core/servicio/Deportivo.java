package dgtic.core.servicio;

public class Deportivo implements ModeloCoche{

    private String color;

    @Override
    public void crear() {
        System.out.println("Deportivo");

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
