package juego;

import entorno.Entorno;
import entorno.Herramientas;
import java.awt.Image;
import javax.sound.sampled.Clip;

public class Board {
	private int filas;
	private int columnas;
	private int anchoCasilla;
	private int altoCasilla;
	private boolean pantallaInicial = true;
	private boolean pantallaFinal = false;
	private boolean musicaSonando = false;
	private Image imagenFondo = Herramientas.cargarImagen("recursos/base.png");
	private Image imagenInicial = Herramientas.cargarImagen("recursos/intro.png");
	private Clip musica;
	
	public Board() {
		this.filas = 5;
		this.columnas = 9;
		this.pantallaInicial = true;
	}
	
	public void dibujar(Entorno entorno) {
		if(pantallaInicial) {
			entorno.dibujarImagen(
					imagenInicial, entorno.ancho() / 2,
					entorno.alto() / 2, 0, 1
			);
		} else if(!pantallaInicial && !pantallaFinal) {
			entorno.dibujarImagen(
					this.imagenFondo, entorno.ancho() / 2,
					entorno.alto() / 2, 0, 0.83
					);			
		}
		// TODO: Implemetar pantallaFinal y pantallaHasPerdido.
	}
	
	public void reproducirMusica() {
		// TODO: implementar musica de fondo para cada
		// pantalla del juego
	}
	
	public boolean estaIniciadoElJuego() {
		return !this.pantallaInicial && !this.pantallaFinal;
	}
}
