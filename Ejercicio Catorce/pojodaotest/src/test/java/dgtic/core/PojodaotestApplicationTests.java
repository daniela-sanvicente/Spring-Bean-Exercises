package dgtic.core;

import dgtic.core.excepciones.CreditosMenores;
import dgtic.core.modelo.Estudiante;
import dgtic.core.modelo.Materia;
import dgtic.core.repositorio.BaseDeDatosDAO;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class PojodaotestApplicationTests {

	@Autowired
	@Qualifier("baseDeDatosDAOExtra")
	BaseDeDatosDAO baseDeDatosDAO;

	/*@BeforeEach
	public void inicio(){
		System.out.println("Antes de cada prueba");
	}

	@AfterEach
	public void despues(){
		System.out.println("Deespues de cada prueba");
	}*/

	@BeforeAll
	public static void inicio() {
		System.out.println("Una sola vez");
	}

	@AfterAll
	public static void despues() {
		System.out.println("Cuando se ejecuto todas las pruebas");
	}

	@Test
	public void testUno() {
		String esperado = "String";
		String actual = "spring";
		//assertEquals(esperado, actual,"Cadenas no iguales");
		Estudiante estudiante = baseDeDatosDAO.getEstudiante("ico", "123");
		assertEquals(estudiante.getNombre(), "Ros", "No son iguales");

	}

	@Test
	public void testTres() {
		Estudiante est = null;
		assertNull(est);
		est = new Estudiante("3445", "Fer", 34);
		assertNotNull(est);
		Estudiante estudiante = baseDeDatosDAO.getEstudiante("ico", "666");
		assertNull(estudiante);
		if (estudiante == null) {
			System.out.println("No existe el estudiante");
		}

	}

	@Test
	public void testCuatro() {
		Estudiante valorActual = new Estudiante("111", "Raul", 28);
		Estudiante valorEsperado = new Estudiante("222", "Pedro", 23);
		Estudiante valorEsperadoTmp = valorEsperado;
		//dos variables se refieren al mismo objeto (verifica que tengan la misma direccion en memoria)
		//assertSame(valorEsperado, valorActual);
		//assertSame(valorEsperado, valorEsperadoTmp);

		//dos variables no se refieren al mismo objeto
		//assertNotSame(valorEsperado, valorActual);

		//si son iguales (comparar propiedad por propiedad)
		assertEquals(valorEsperado, valorActual);

	}


	@Test
	public void testCinco(){
		Estudiante est=baseDeDatosDAO.getEstudiante("ico", "123");
		String esperado="Lógica";
		assertEquals(esperado,est.getMaterias().stream()
				.filter(materia->materia.getNombre().equals("Lógica"))
				.findFirst().get().getNombre(), "Primero");
		assertTrue(est.getMaterias().stream()
				.anyMatch(materia->materia.getNombre().equals("Lógica")));
		assertFalse(est.getMaterias().stream()
				.anyMatch(materia->materia.getNombre().equals("Lógica")));
	}

	@Test
	public void seisTest(){
		Estudiante est = baseDeDatosDAO.getEstudiante("ico", "123");
		String esperado="Lógica";
		//assertAll(()->{},()->{},()->{});
		assertAll(()->{assertEquals(esperado, est.getMaterias().stream()
						.filter(dato->dato.getNombre().equals("Lógica"))
						.findFirst().get().getNombre());},
				()->{assertTrue(est.getMaterias().stream()
						.filter(dato->dato.getNombre().equals("Lógica"))
						.findFirst().isPresent());},
				()->{assertTrue(est.getMaterias().stream()
						.anyMatch(dato->dato.getNombre().equals("Lógica")));}
		);
	}

	@Test
	@DisplayName("PruebaException")
	public void sieteTest(){
		Materia materia = new Materia("Algebra", 23);
		Exception exp = assertThrows(CreditosMenores.class, () -> {
			materia.setCreditos(-20);
		});
		String actual = exp.getMessage();
		String esperado = "No creditos negativos";
		// verdadero, se prueba el error
		assertEquals(esperado, actual);
	}

	@Test
	public void ochoTest(){
		Estudiante estUno = baseDeDatosDAO.getEstudiante("ico", "123");
		Estudiante estDos = baseDeDatosDAO.getEstudiante("ico", "124");
		//Sin implementar equals en Materia
		//assertIterableEquals(estUno.getMaterias(), estDos.getMaterias());

		//sin implementar equals en Materia
		estDos.getMaterias().add(0, new Materia("Cálculo",9));
		assertIterableEquals(estUno.getMaterias(), estDos.getMaterias());

		//implementado equals
		//estDos.getMaterias().add(0, new Materia("Cálculo",9));
		//assertIterableEquals(estUno.getMaterias(), estDos.getMaterias());
	}

	@Test
	public void nueveTest(){
		assertTimeout(java.time.Duration.ofSeconds(2), ()->{
			Thread.sleep(1000);
		});
	}



}
