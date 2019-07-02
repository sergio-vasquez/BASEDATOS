package duoc.basedatos.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BaseDatosAgregar.class, BaseDatosEliminar.class, BaseDatosListar.class, BaseDatosModificar.class })
public class AllTests {

}
