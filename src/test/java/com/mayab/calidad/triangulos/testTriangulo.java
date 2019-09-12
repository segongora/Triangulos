package com.mayab.calidad.triangulos;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class testTriangulo {

	public static Triangulo triangulo;
	
	@BeforeClass
	public static void beforClass() {
		triangulo = new Triangulo();
	}
	
	@Before
	public void before() throws Exception {
		
	}
	
	@After
	public void after() throws Exception {
		
	}
	
	/*@Test
	public void valoresNegativos() {
		
	}
	
	@Test
	public void valorCero() {
		
	}*/
	
	@Test
	public void trianguloEquilatero() {
		//assertThat(triangulo.tipoTriangulo(), is("Equilatero"));
	}
	
	
	@Test
	public void trianguloIsoceles() {
		//assertThat(triangulo.tipoTriangulo(), is("Isoceles"));
	}
	
	@Test
	public void trianguloEscaleno() {
		assertThat(triangulo.tipoTriangulo(1, 2, 3), is("Escaleno"));
	}
}
