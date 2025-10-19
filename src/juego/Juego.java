package juego;


import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego
{
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	
	// Variables y métodos propios de cada grupo
	// ...
	private Board board;
	private Object[] plantas;
	private PeaShooter peaShooter1;
	private ProyectilNormal[] proyectiles;
	
	Juego()
	{
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Plantas vs Zombies", 800, 600);

		
		// Inicializa otros objetos
		this.board = new Board();
		this.proyectiles = new ProyectilNormal[30];
		this.plantas = new Object[45];
		
		this.peaShooter1 = new PeaShooter(77, 133, 100);
		
		
		// Inicia el juego!
		this.entorno.iniciar();
	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y 
	 * por lo tanto es el método más importante de esta clase. Aquí se debe 
	 * actualizar el estado interno del juego para simular el paso del tiempo 
	 * (ver el enunciado del TP para mayor detalle).
	 */
	public void tick()
	{
		// Procesamiento de un instante de tiempo
		// ...


		// Dibuja el entorno segun el estado en el
		// que se encuentre el juego. Estados:
		// pantallaInicial, pantallaJuego,
		// pantallaFinal, pantallaHasPerdido.
		this.board.dibujar(this.entorno);
		
		// Permite cambiar el estado del tablero para facilitar el 
		// desarrollo del juego.
		this.board.setEstadoDelTablero(this.board.PANTALLA_HAS_PERDIDO);
		
		
		// ********** Logica aplicada cuando el juego esta **********
		// ********** en la pantalla de inicio			   **********
		
		if(this.board.getEstadoDelTablero() == this.board.PANTALLA_INICIAL) {
			// TODO: Implementar la logica cuando el usuario esta en la
			// pantalla de inicio. Cambiar el estado del tablero en la
			// linea 55
		}
		

		// ********** Logica aplicada cuando el juego esta **********
		// ********** iniciado							   **********
		
		if(this.board.getEstadoDelTablero() == this.board.PANTALLA_JUEGO) {
			this.moverProyectiles();
			this.dibujarProyectiles();
			
			
			this.plantasDisparar();
			this.peaShooter1.dibujar(this.entorno);
		}
		
		// ********** Logica aplicada cuando el juego esta **********
		// ********** en la pantalla final				   **********
		
		if(this.board.getEstadoDelTablero() == this.board.PANTALLA_FINAL) {
			// TODO: Implementar la logica para cuando el usuario esta
			// en la pantalla final del juego. Cambiar el estado del tablero
			// en la linea 55
		}
		
		// ********** Logica aplicada cuando el juego esta **********
		// ********** en la pantalla has perdido		   **********
		
		if(this.board.getEstadoDelTablero() == this.board.PANTALLA_HAS_PERDIDO) {
			// TODO: implementar la logica para cuando el usuario esta
			// en la pantalla has perdido del juego. Cambiar el estado del
			// tablero en la linea 55
		}
		
		
	}
	
	public void moverProyectiles() {
		for(int i = 0; i < this.proyectiles.length; i++) {
			if(this.proyectiles[i] != null) {
				this.proyectiles[i].mover(this.entorno.tiempo());
			}
		}
	}
	
	public void dibujarProyectiles() {
		for(int i = 0; i < this.proyectiles.length; i++) {
			if(this.proyectiles[i] != null) {
				this.proyectiles[i].dibujar(this.entorno);
			}
		}
	}
	
	public void plantasDisparar() {
		// TODO: Implementar la logica de disparo de las
		// plantas incluidas en array de plantas.
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Juego juego = new Juego();
	}
}
