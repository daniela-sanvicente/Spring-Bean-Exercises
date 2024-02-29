package dgtic.core.modelo;
//Patrón Singleton
public class Computadora {
    private static Computadora computadora=new Computadora();

    private Computadora() {
    }

    public static Computadora getInstance(){
        return computadora;
    }
}
