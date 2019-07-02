package duoc.basedatos.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import duoc.basedatos.base.BaseDeDatos;
import duoc.basedatos.modelo.Dato;



public class BaseDatosListar {

private BaseDeDatos base;
	
	
	@Before
	public void setUp() throws Exception {
		
		base = new BaseDeDatos();
	}

	@Test
	public void CuandoListaVaciaEntoncesSize_0() {
		
		int largo = this.base.listar().size();
		
		assertTrue("el largo debiera ser 0", largo==0);
		
	}
	
	@Test
	public void CuandoLista1EntoncesSize_1() {
		
		base.agregar(new Dato("a01", "ojojojojoj"));
		
		int largo = this.base.listar().size();
		
		assertTrue("el largo debiera ser 1", largo==1);
		
	}
	
	@Test
	public void CuandoLista5EntoncesSize_5() {
		
		base.agregar(new Dato("a01", "ojojojojoj"));
		base.agregar(new Dato("a02", "jajajjaja"));
		base.agregar(new Dato("a03", "jejejeje"));
		base.agregar(new Dato("a05", "ijijijijj"));
		base.agregar(new Dato("a06", "uujuju"));
		
		int largo = this.base.listar().size();
		
		assertTrue("el largo debiera ser 5", largo==5);
		
	}


}
