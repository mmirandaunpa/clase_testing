package ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RectanguloTest {
	
	static int area, perimetro;

	@BeforeAll
	static void init() {
		System.out.println("Antes de ejecutar la prueba");
		area = 10;
		perimetro = 20;
	}

	@AfterAll
	static void after() {
		System.out.println("Después de ejecutar la prueba");
	}
	
	@Test
	@DisplayName("Prueba en Junit")
	void test() {
		Rectangulo r = new Rectangulo(3,4);
		assertAll(
			() -> assertEquals(area, r.area()),
			() -> assertEquals(perimetro, r.perimetro())
		);
	}
	
	@Test
	@DisplayName("Prueba unitaria")
	void testUnit() {
		Rectangulo r = new Rectangulo(3,4);
		assertEquals(12, r.area());
	}
}
