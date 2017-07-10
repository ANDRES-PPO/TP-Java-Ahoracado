package ahorcado;

import java.util.Scanner;

public class Entradas {
	Scanner teclado=new Scanner(System.in);
	

	public Entradas() {
		
		
	}
	
	
public String leerNombre() {
	String nombre=teclado.next();
	
	return nombre;
	
}
public int leerDificultad() {
	
	int dificultad=0;
	boolean reiniciar=false;
	
	do{
		reiniciar=false;
		System.out.println("Elije la dificultad:\n 1.- Facil (Una palabra)\n 2.- Dificil (Una frase)");
		String dif=teclado.next();
		if(verificarEntero(dif)) {
			dificultad=Integer.parseInt(dif);
		}else if(!verificarEntero(dif)){
			reiniciar=true;
		}

		
	
	}while(reiniciar || dificultad<1 || dificultad>2) ;
	return dificultad;
}
public void pausa() {
	try{System.in.read();}
	catch(Exception e){}
}
public char leerLetra() {
	String in;
	do{
		System.out.println("Ingrese una letra (Solo una letra):");
		in=teclado.next();
	}while(in.length()!=1);
	char letra=in.charAt(0);
	return letra;
}
public boolean verificarEntero(String entrada) {
	boolean verificar=true;
	if (entrada.length()>1) {
		verificar=false;
	}
	if(verificar ){
		try {
		Integer.parseInt(entrada);
		}catch(NumberFormatException e) {
			verificar=false;
		}
		return verificar;
	}
	
	return false;
	
}
	
}