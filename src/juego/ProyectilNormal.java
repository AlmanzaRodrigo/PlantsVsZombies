package juego;

import java.awt.Color;
import java.awt.Image;

import entorno.Entorno;
import entorno.Herramientas;

public class ProyectilNormal {
	private double x;
	private double y;
	private int velocidad = 20;
	private Image imagen = Herramientas.cargarImagen("recursos/balaverde.png");
	
	public ProyectilNormal(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void dibujar(Entorno entorno) {
		entorno.dibujarImagen(imagen, x, y, 0, 0.25);;
	}
	
	public void mover() {
		this.x += velocidad;
	}
	
	public void colisiona() {
//		TODO: implemetar la logica de colision con los zombies
	}
}
