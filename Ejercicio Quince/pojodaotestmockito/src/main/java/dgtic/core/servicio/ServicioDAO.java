package dgtic.core.servicio;

import dgtic.core.repositorio.BaseDeDatosDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class ServicioDAO {
    //@Autowired //inyeccion directa
    //@Qualifier("baseDeDatosDAOExtra")
    private BaseDeDatosDAO baseDeDatosDAO;

    /*@Autowired (required = true)//inyeccion a través del constructor
    public ServicioDAO(BaseDeDatosDAO baseDeDatosDAO){
        this.baseDeDatosDAO=baseDeDatosDAO;
    }*/

    /*@Autowired
    public ServicioDAO(@Qualifier("baseDeDatosDAOExtra")BaseDeDatosDAO baseDeDatosDAO){
        this.baseDeDatosDAO=baseDeDatosDAO;
    }*/

    //Inversion de control, inyeccion de dependencia

    @Autowired
    public void setBaseDeDatosDAO(@Qualifier("baseDeDatosDAOExtra")BaseDeDatosDAO baseDeDatosDAO) {
        this.baseDeDatosDAO = baseDeDatosDAO;
    }

    public String archivoCSV(String carrera){
        return baseDeDatosDAO.getEstudiantes(carrera).stream()
                .map(alm->alm.getMatricula()+";"+
                        (alm.getMaterias().stream()
                                .map(mat->(mat.getNombre()+";"+mat.getCreditos()))
                                .collect(Collectors.joining(";")))+";"+alm.getNombre())
                .collect(Collectors.joining("\n"));
    }
}
