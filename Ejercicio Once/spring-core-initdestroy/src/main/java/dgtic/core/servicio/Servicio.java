package dgtic.core.servicio;

import dgtic.core.modelo.Persona;

public class Servicio {
    private  static Servicio servicio=new Servicio();

private Persona persona;

    private Servicio(){

    }
    public static Servicio getInstance(){
        return servicio;
    }


    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public  void iniciar(){
        System.out.println("Iniciar servicio");
    }

    public  void destruir(){
        System.out.println("Destruir servicio");
    }
}
