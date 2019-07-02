package duoc.basedatos.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import duoc.basedatos.base.BaseDeDatos;
import duoc.basedatos.modelo.Dato;



public class BaseDatosAgregar {

	private BaseDeDatos base;
	
	
	@Before
	public void setUp() throws Exception {
		base = new BaseDeDatos();
	}

	
	
	@Test
	public void CuandoAgrega1EntoncesTrue() {
		
		boolean res = this.base.agregar(new Dato("a11","datos  11111"));
		
		assertTrue(res);
		
	}
	
	
	@Test
	public void CuandoAgrega1EntoncesListaSizeEs1() {
		
		this.base.agregar(new Dato("a11","datos  11111"));
		
		int largo = this.base.listar().size();
		
		assertTrue("El size de la lista deberia ser 1", largo==1);
		
		
	}
	
	

}
