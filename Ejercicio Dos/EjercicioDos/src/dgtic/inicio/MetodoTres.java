package dgtic.inicio;

import dgtic.modelo.*;

public class MetodoTres {
    public static void main(String[] args){
        Profesor profesor= new Profesor();
        profesor.setNombre("Raul");
        ExplicarClases explicarClases=new ExplicarClases();
        Calificar calificar=new Calificar();
        Reportes reportes=new Reportes();
        profesor.getResponsabilidades().add(explicarClases);
        profesor.getResponsabilidades().add(calificar);
        profesor.getResponsabilidades().add(reportes);
        for (Responsabilidades resp: profesor.getResponsabilidades()){
            resp.realizar();
        }

    }
}
