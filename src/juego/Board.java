package juego;

import entorno.Entorno;
import entorno.Herramientas;
import java.awt.Image;

public class Board {
	private int filas;
	private int columnas;
	private int anchoCasilla;
	private int altoCasilla;
	private Image imagenFondo = Herramientas.cargarImagen("recursos/base.png");
	
	
	public Board() {
		this.filas = 5;
		this.columnas = 9;
	}
	
	public void dibujar(Entorno entorno) {
		entorno.dibujarImagen(
				this.imagenFondo, entorno.ancho() / 2,
				entorno.alto() / 2, 0, 0.83
		);
	}
}
