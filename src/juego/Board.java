package juego;

import entorno.Entorno;
import entorno.Herramientas;
import java.awt.Image;
import javax.sound.sampled.Clip;

public class Board {
	
	public String PANTALLA_INICIAL = "pantallaInicial";
	public String PANTALLA_JUEGO = "pantallaJuego";
	public String PANTALLA_HAS_PERDIDO = "pantallaHasPerdido";
	public String PANTALLA_FINAL = "pantallaFinal";
	
	private int filas;
	private int columnas;
	private int anchoCasilla;
	private int altoCasilla;
	private String estadoDelTablero = this.PANTALLA_INICIAL;
	private boolean musicaSonando = false;
	private Image imagenFondo = Herramientas.cargarImagen("recursos/base.png");
	private Image imagenInicial = Herramientas.cargarImagen("recursos/intro.png");
	private Clip musica;
	
	public Board() {
		this.filas = 5;
		this.columnas = 9;
	}
	
	public void dibujar(Entorno entorno) {
		if(this.getEstadoDelTablero() == this.PANTALLA_INICIAL) {
			entorno.dibujarImagen(
					imagenInicial, entorno.ancho() / 2,
					entorno.alto() / 2, 0, 1
			);
		} else if(this.getEstadoDelTablero() == this.PANTALLA_JUEGO) {
			entorno.dibujarImagen(
					this.imagenFondo, entorno.ancho() / 2,
					entorno.alto() / 2, 0, 0.55
					);			
		}
		// TODO: Implemetar pantallaFinal y pantallaHasPerdido.
	}
	
	public void reproducirMusica() {
		// TODO: implementar musica de fondo para cada
		// pantalla del juego
	}
	
	public String getEstadoDelTablero() {
		return this.estadoDelTablero;
	}
	
	public void setEstadoDelTablero(String estado) {
		this.estadoDelTablero = estado;
	}
}
