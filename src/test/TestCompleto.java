package test;


public class TestCompleto {

	
	
	
	public TestCompleto() {
		
	}

public void full_Test() {
	Test_Entradas testEntradas=new Test_Entradas();
	TestJuego testJuego=new TestJuego();
	
	
	System.out.println(testEntradas.test_leerNombre());
	testJuego.test_gettersysetters();
	
	testJuego.test_checkLetra();
	testJuego.test_checkEstadoPalabra();

}
	
}
