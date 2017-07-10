package test;

import ahorcado.Juego;
import ahorcado.Jugador;

public class TestJuego {

	
	public TestJuego() {
			
	}

public void test_gettersysetters(){
	Jugador jugador=new Jugador();
	Jugador jugador2=new Jugador();
	Juego juego=new Juego();
	
	juego.setJugador(jugador);
	
	if(juego.getJugador()==jugador) {
		System.out.println("Test set/getJugador : OK");
	}else {
		System.out.println("Test set/getJugador : ERROR");
	}
	//=============================
	int setDificultad=1;
	int dificultadEsperada=1;		
	juego.setDificultad(setDificultad);

	if(juego.getDificultad()==dificultadEsperada) {
		System.out.println("Test set/getDificultad: OK");
	}else {
		System.out.println("Test set/getDificultad: ERROR");
	}
	//=============================
	int nivel=1;
	int nivelEsperado=1;
	 juego.setNivel(nivel);
	 
	 if(juego.getNivel()==nivelEsperado) {
		 System.out.println("Test set/getNivel: OK");
	 }else {
		 System.out.println("Test set/getNivel: ERROR");
	 }
	int vidas=7;
	int vidasEsperadas=7;
	jugador.setVidas(vidas);
	juego.setVidas();
	
	if(juego.getVidas()==vidasEsperadas) {
		System.out.println("Test set/getVidas: OK "+jugador.getVidas()+" / "+juego.getVidas()+" / "+vidasEsperadas);
	}else {
		System.out.println("Test set/getVidas: Error "+jugador.getVidas()+" / "+juego.getVidas()+" / "+vidasEsperadas);
	}	
	
}

public void test_OcultarPalabra() {
	
}
public void test_checkLetra(){
	Juego juego=new Juego();
	
	char letraEnviada='e';
	char letraEnviada2='P';
	juego.setDificultad(2);
	juego.setNivel(1);
	juego.setPalabra();
	System.out.println("test_checkLetra");
	System.out.println("dif: "+juego.getDificultad()+"; Nivel: "+juego.getNivel()+"; Palabra: "+juego.getPalabra()+"; Palabra Oculta: "+juego.getPalabraOculta());

	boolean recibido = juego.checkLetra(letraEnviada);

	if (recibido) {
		System.out.println("SI : letra "+letraEnviada+" encontrada en la Palabra "+juego.getPalabra());
	}else {
		System.out.println("NO : letra "+letraEnviada+" NO encontrada en la Palabra "+juego.getPalabra());
	}
	System.out.println("dif: "+juego.getDificultad()+"; Nivel: "+juego.getNivel()+"; Palabra: "+juego.getPalabra()+"; Palabra Oculta: "+juego.getPalabraOculta());
	
	//------PASO 2------------------
	recibido = juego.checkLetra(letraEnviada2);

	if (recibido) {
		System.out.println("SI : letra "+letraEnviada2+" encontrada en la Palabra "+juego.getPalabra());
	}else {
		System.out.println("NO : letra "+letraEnviada2+" NO encontrada en la Palabra "+juego.getPalabra());
	}
	System.out.println("dif: "+juego.getDificultad()+"; Nivel: "+juego.getNivel()+"; Palabra: "+juego.getPalabra()+"; Palabra Oculta: "+juego.getPalabraOculta());
	
	
	
	
}

public void test_checkEstadoPalabra() {
	Juego juego=new Juego();
	
	char letraEnviada='c';
	char letraEnviada2='a';
	char letraEnviada3='l';
	char letraEnviada4='o';
	char letraEnviada5='r';
	juego.setDificultad(1);
	juego.setNivel(1);
	juego.setPalabra();
	System.out.println("==============================================");
	System.out.println("test_checkEstadoPalabra");
	System.out.println("dif: "+juego.getDificultad()+"; Nivel: "+juego.getNivel()+"; Palabra: "+juego.getPalabra()+"; Palabra Oculta: "+juego.getPalabraOculta());
	juego.checkLetra(letraEnviada);
	juego.checkLetra(letraEnviada2);
	juego.checkLetra(letraEnviada3);
	juego.checkLetra(letraEnviada4);
	juego.checkLetra(letraEnviada5);
	System.out.println("test_checkEstadoPalabra");
	System.out.println("dif: "+juego.getDificultad()+"; Nivel: "+juego.getNivel()+"; Palabra: "+juego.getPalabra()+"; Palabra Oculta: "+juego.getPalabraOculta());
	
	boolean estado=juego.checkEstadoPalabra();
	if(estado){
		System.out.println("Estado: Palabra Completa");
	}else if(!estado){
		System.out.println("Estado: Palabra NO COMPLETA");
	}
	
	
	
}

	
}
