package ahorcado;

public class Jugador {
	private	String nombre;
	private	int puntaje;
	private	int vidas;

public Jugador(){
	
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getPuntaje() {
	return puntaje;
}
public void setPuntaje(int puntaje) {
	this.puntaje = puntaje;
}
public int getVidas() {
	return vidas;
}
public void setVidas(int vidas) {
	this.vidas = vidas;
}

}