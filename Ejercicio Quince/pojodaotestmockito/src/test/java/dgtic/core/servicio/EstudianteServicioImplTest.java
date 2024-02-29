package dgtic.core.servicio;

import dgtic.core.repositorio.BaseDeDatos;
import dgtic.core.repositorio.EstudianteRepositorio;
import dgtic.core.repositorio.MateriaRepositorio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = {EstudianteServicioImplTest.class})
@ComponentScan(basePackages="dgtic.core")
class EstudianteServicioImplTest {
    @Mock
    private EstudianteRepositorio estudianteRepositorio;
    private MateriaRepositorio materiaRepositorio;
    private EstudianteServicio estudianteServicio;


    @BeforeEach
    public void inicio() {
        //estudianteRepositorio =mock(EstudianteRepositorio.class);
        materiaRepositorio=mock(MateriaRepositorio.class);
        estudianteServicio=new EstudianteServicioImpl(estudianteRepositorio, materiaRepositorio);
    }

    @Test
    void testUno() {
        when(estudianteRepositorio.findAll()).thenReturn(BaseDeDatos.estudiantes);
        when(estudianteRepositorio.findById(anyString())).thenReturn(BaseDeDatos.estudiantes.stream()
                .filter(e->e.getMatricula().equals("123"))
                .findFirst()
                .get());
        assertEquals(4, estudianteServicio.findAll().size());
        assertEquals(3, estudianteRepositorio.findById("123").getMaterias().size());
        assertEquals("Rosa", estudianteServicio.findById("123").getNombre());
        assertEquals("123;1;Cálculo;9;2;Programación;10;3;Lógica;10;Rosa;20",
                estudianteServicio.archivoCSV("123"));
        assertEquals(29, estudianteServicio.creditos("123"));

    }

}