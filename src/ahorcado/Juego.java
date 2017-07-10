package ahorcado;

public class Juego {
private int dificultad=0,nivel,estado;
private int vidas;

private String palabra;
private String palabraOculta;
private String[] palabras=new String[10];
private Jugador jugador;

	public Juego(){

}
	
	public Jugador getJugador() {
	return jugador;
}
	public void setJugador(Jugador jugador) {
	this.jugador = jugador;
}	
	public int getVidas() {
		return this.vidas;
	}
	public void setVidas() {
		this.vidas = jugador.getVidas();
	}	
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(){
		
		if(dificultad==1){
			this.palabras[0]="calor";
			this.palabras[1]="dulce";
			this.palabras[2]="suerte";
			this.palabras[3]="amarillo";
			this.palabras[4]="gorila";
			this.palabras[5]="brasil";
			this.palabras[6]="tren";
			this.palabras[7]="norte";
			this.palabras[8]="canguro";
			this.palabras[9]="cordero";
		}else if (dificultad==2){
			this.palabras[0]="pienso luego existo";
			this.palabras[1]="todo hombre tiene derecho a decidir su propio destino";
			this.palabras[2]="a un loco se le conoce por sus actos, a un sabio tambien";
			this.palabras[3]="estudia el pasado si quieres predecir el futuro";
			this.palabras[4]="la confianza en si mismo es el primer secreto del exito";
			this.palabras[5]="un amigo es una persona con la que se puede pensar en voz alta";
			this.palabras[6]="lo que no me mata, me hace mas fuerte";
			this.palabras[7]="la realidad deja mucho a la imaginacion";
			this.palabras[8]="la simplicidad es la ultima sofisticacion";
			this.palabras[9]="siempre parece imposible hasta que se realiza";
		}
		this.palabra=palabras[this.nivel-1];	//establece la palabra por el nivel.
		String palabraOculta="";
		for(int i=0;i<this.palabra.length();i++) {
			if(this.palabra.charAt(i)==' ') {
				palabraOculta=palabraOculta+" ";
			}else {
				palabraOculta=palabraOculta+"*";
			}
			
		}
	this.palabraOculta=palabraOculta;

	}
	public String getPalabraOculta() {
		return this.palabraOculta;
	}
	public int getDificultad() {
		return this.dificultad;
	}
	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;

	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public boolean checkLetra(char letra){
		//convertir string a array
		char[] acumPalabra=new char[this.palabra.length()];
		char[] acumPalabraOculta=new char[this.palabraOculta.length()];
		for(int i=0;i<this.palabra.length();i++){
			acumPalabra[i]=this.palabra.charAt(i);
			acumPalabraOculta[i]=this.palabraOculta.charAt(i);
			}
		//---------------------------------
		//revisa si acum tiene una letra cubierta.. y si la tiene compara con la letra ingresada
		boolean acierto=false;
		for(int i=0;i<this.palabra.length();i++){
			if(acumPalabraOculta[i]=='*'){
				if(letra==acumPalabra[i]){
					acumPalabraOculta[i]=acumPalabra[i];
					acierto=true;
					}
			}
		}
		if(acierto) {
			String palabraOculta="";
			for(int i=0;i<this.palabraOculta.length();i++) {
				palabraOculta=palabraOculta+acumPalabraOculta[i];
			}
			this.palabraOculta=palabraOculta;
		}
		//---------------------------------
		//devuelve true o false si acerto la letra
		return acierto;
	
	}
	public boolean checkEstadoPalabra() {
		boolean palabraCompleta=true;

		for(int i=0;i<this.palabraOculta.length();i++) {
			if(this.palabraOculta.charAt(i)=='*'){
				palabraCompleta=false;	
			}
		}
		return palabraCompleta;
		
	}
	
}
