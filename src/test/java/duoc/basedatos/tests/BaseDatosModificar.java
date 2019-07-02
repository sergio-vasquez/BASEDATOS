package duoc.basedatos.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import duoc.basedatos.base.BaseDeDatos;
import duoc.basedatos.modelo.Dato;





public class BaseDatosModificar {

	
	private BaseDeDatos base;

	@Before
	public void setUp() throws Exception {
		
		base = new BaseDeDatos();

		base.agregar(new Dato("a01", "elemento 01"));
		base.agregar(new Dato("a02", "elemento 02"));
		base.agregar(new Dato("a03", "elemento 03"));
		base.agregar(new Dato("a04", "elemento 04"));
		base.agregar(new Dato("a05", "elemento 05"));
	}

	
	//cuandoInsertaEntoncesRetornaTrue()

	@Test
	public void cuandoModifica1EntoncesRetornaTrue() {
		
		Dato dato = new Dato("a02", "okokokokokokoko");
		boolean res = this.base.modificar(dato);
		
		
		assertTrue(res);
		
	}
	
	@Test
	public void cuandoNoModificaEntoncesFalso() {
		
		Dato dato = new Dato("a06", "okokokokokokoko");
		boolean res = this.base.modificar(dato);
		
		
		assertFalse(res);
		
	}

	

}
