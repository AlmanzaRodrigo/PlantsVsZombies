package juego;


import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego {
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	
	// Variables y métodos propios de cada grupo
	// ...
	private Board board;
	private PeaShooter[] plantas;
	private ProyectilNormal[] proyectiles;
	private ZombieGrinch[] zombies;
	
	Juego()
	{
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Plantas vs Zombies", 800, 600);

		
		// Inicializa otros objetos
		this.board = new Board();
		this.proyectiles = new ProyectilNormal[30];
		this.plantas = new PeaShooter[45];
		this.zombies = new ZombieGrinch[60];
		
		
		// se cargan manualmente las plantas y los zombies. Solo
		// durante el desarrollo. Borrar para produccion
		this.plantas[0] = new PeaShooter(90, 133 + 87 * 0, 100);
		this.plantas[1] = new PeaShooter(90, 133 + 87 * 1, 100);
		this.plantas[2] = new PeaShooter(90 + 70, 133 + 87 * 2, 100);
		this.plantas[3] = new PeaShooter(90, 133 + 87 * 3, 100);
		this.plantas[4] = new PeaShooter(90 + 70, 133 + 87 * 4, 100);
		this.zombies[0] = new ZombieGrinch(700, 110 + 87 * 0);
		this.zombies[1] = new ZombieGrinch(760, 110 + 87 * 1);
		this.zombies[2] = new ZombieGrinch(600, 110 + 87 * 2);
		
		
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
		this.board.setEstadoDelTablero(this.board.PANTALLA_JUEGO);
		
		
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
			this.controlarColisionProyectiles();
			this.dibujarProyectiles();
			
			this.dispararPlantas();
			this.dibujarPlantas();
			
			this.moverZombies();
			this.eliminarZombies();
			this.dibujarZombies();
			
			
			this.dispararPlantas();
			this.dibujarPlantas();
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
	
	public void dispararPlantas() {
		// TODO: Implementar la logica de disparo de las
		// plantas incluidas en la lista plantas[]. Si un 
		// elemenento es null, el metodo no hace nada.
	}
	
	public void dibujarPlantas(){
		// TODO: Utilizando el metodo dibujar() de cada
		// planta en plantas[]. Debe dibujar cada una de ellas
	}
	
	public void plantarDefensa() {
		// TODO: Implementar la logica de arrastra y soltar
		// las plantas en el tablero. Utilizar los metodos
		// entorno.estaPresionado(), entorno.seLevantoBoton()
	}
	
	public void controlarColisionProyectiles() {
		// TODO: implementar la logica que verifica si algun
		// proyectil esta en colision con un zombie o con el
		// borde de la pantalla. Elimina de la lista proyectiles[]
		// aquellos que estan en colision, almacenando un null.
	}
	
	public void moverZombies() {
		// TODO: Implementar la logica que mueve cada uno de
		// los zombies de la lista zombies[]. Si se encuentra
		// un null en la lista, el metodo no hace nada.
	}
	
	public void eliminarZombies() {
		// TODO: Implementar la logica que elimina aquellos
		// zombies que no tienen vida, de la lista zombies[].
		// Almacenando en esa posicion de la lista, un null
	}
	
	public void dibujarZombies() {
		// TODO: Implementar la logica que dibuja en la pantalla
		// cada uno de los zombies de la lista zombies[]
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Juego juego = new Juego();
	}
}
