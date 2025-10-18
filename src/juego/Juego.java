package juego;


import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego
{
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	
	// Variables y métodos propios de cada grupo
	// ...
	private PeaShooter peaShooter1;
	private Board board;
	private ProyectilNormal proyectil1;
	
	Juego()
	{
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Plantas vs Zombies", 800, 600);

		// Inicializa otros objetos
		this.board = new Board();
		
		this.proyectil1 = new ProyectilNormal(77 + 25, 133 - 15);
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
		// pantallaInicial, tableroDeJuego,
		// PantallaFinal, PantallaHasPerdido.
		this.board.dibujar(entorno);
		
		
		
		if(this.board.estaIniciadoElJuego()) {
			this.proyectil1.dibujar(entorno);
			moverProyectiles();
			this.peaShooter1.dibujar(entorno);			
		}
		
	}
	
	public void moverProyectiles() {
		
	}
	

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Juego juego = new Juego();
	}
}
