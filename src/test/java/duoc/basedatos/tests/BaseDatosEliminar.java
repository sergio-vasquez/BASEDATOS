package duoc.basedatos.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import duoc.basedatos.base.BaseDeDatos;
import duoc.basedatos.modelo.Dato;


public class BaseDatosEliminar {

	
	
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
	public void cuandoElimina1EntoncesRetornaTrue() {

		boolean res = base.eliminar("a03");

		assertTrue("deberia hebr eliminado el dato: a03", res);

	}
	
	@Test
	public void cuandoElimina1EntoncesSize_4() {

		 this.base.eliminar("a02");
		 
		 int largo = this.base.listar().size();
		 
		 int num = 5;

		assertTrue("el largo debiera ser 4 pero es: "+num, largo==4);

	}
	
	@Test
	public void cuandoNoElimina1Entoncesfalse() {

		 boolean res = this.base.eliminar("a0");
		 
		

		assertFalse(res);

	}

}
