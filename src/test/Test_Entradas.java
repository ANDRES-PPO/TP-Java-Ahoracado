package test;
import ahorcado.Entradas;

public class Test_Entradas {
	Entradas entradas=new Entradas();
	
	public Test_Entradas() {
		
	}
	
public String test_leerNombre() {
	
	String estado;
	String esperado="Juan";
	System.out.println("Test_leerNombre (Ingrese un nombre : (Esperado: "+esperado+" )");
	String obtenido = entradas.leerNombre();
	
	if(obtenido.equals(esperado)) {
		estado="test_leerNombre: OK";
	}else{
		estado="test_leerNombre: ERROR";
	}
	
	return estado;
	
	
}
	

}
