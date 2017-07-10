package ahorcado;



import gfx.Pantalla;
import test.*;



public class Main {
	

	public static void main(String[] args) {
		//char[] acum=new char[juego.getPalabra().length()];//acumula las palabras ocultas
		int test=0;
		int jugar=1;
		
		
		
		
		
		
		if(test==1) {
			TestCompleto testCompleto=new TestCompleto();
			testCompleto.full_Test();
		}
		
		if(jugar==1) {
			Pantalla pantalla=new Pantalla();
			Entradas entrada=new Entradas();
			Juego juego=new Juego();
			Jugador jugador=new Jugador();
			
			System.out.println("Juego");
			
			
			pantalla.cartel(0);
			entrada.pausa();
			
				System.out.println("Ingrese Su Nombre: ");
			jugador.setNombre(entrada.leerNombre());
			juego.setDificultad(entrada.leerDificultad());
			
			//inicio deljuego
			juego.setJugador(jugador);
			jugador.setVidas(6);
			
			juego.setVidas();
			juego.setNivel(1);
			
			int vidas=jugador.getVidas();
			int nivel=juego.getNivel();
			
			juego.setPalabra();
			pantalla.Nivel(nivel);
			entrada.pausa();
			
			
			do {
			int estado=0;
			//entrada.pausa();
			
			pantalla.colgado(vidas);

				System.out.println("Palabra:      "+juego.getPalabraOculta()
						+"\nLetras: "+juego.getPalabraOculta().length()
						+"\nNivel: "+nivel
						+"\nVidas Restantes: "+vidas);
			
				
				
			boolean x=juego.checkLetra(entrada.leerLetra());
					if(!x) {
						vidas--;
						jugador.setVidas(vidas);
						juego.setVidas();
						pantalla.cartel(3);//cartel NO ACERTASTE
						entrada.pausa();
						
						
					}else { //si acerto hacer esto(chequar si se completo la palabra)
						if (juego.checkEstadoPalabra()) {//"si palabra esta completa : hacer esto"
							if (nivel<10) {
								estado=1;
								
							}else if(nivel==10) {
								estado=2;
							
							}
							}
						}
					
			
				
				
				//estado=0 ; normal
				//estado=1 ; sube nivel y reiniciael juego;
				//estado=2 ; todos los niveles superado: - termina el juego;
				if(estado==1) {
					nivel++;
					jugador.setVidas(6);
					juego.setVidas();
					juego.setNivel(nivel);
					
					vidas=jugador.getVidas();
					nivel=juego.getNivel();
					
					juego.setPalabra();
					pantalla.Nivel(nivel);
					entrada.pausa();
					System.out.println("nivel:       "+nivel);
					System.out.println("vidas juego: "+vidas);
					System.out.println("vidas jugad: "+jugador.getVidas());
					
				}else if(estado==2) {
					nivel++;
					pantalla.cartel(1);
					System.out.println("Felicidades "+juego.getJugador().getNombre()+" Terminaste todos los niveles");
					entrada.pausa();
					break;
					
				}
				
				
				if(vidas==0){
						entrada.pausa();
					pantalla.colgado(0);
						entrada.pausa();
					pantalla.cartel(2);
						entrada.pausa();
					jugador.setVidas(vidas);
					juego.setVidas();
					vidas=jugador.getVidas();
					
				}

				
				
				
				
			}while(juego.getVidas()!=0 && nivel<10);
			
			
			System.out.println("                    Fin del juego                       ");
			System.out.println("             < Precione Enter Para Salir >            \n");
			entrada.pausa();
			
				
		}
		
	}
}
			