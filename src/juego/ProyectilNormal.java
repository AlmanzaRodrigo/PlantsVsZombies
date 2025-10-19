package juego;

import java.awt.Color;
import java.awt.Image;

import entorno.Entorno;
import entorno.Herramientas;

public class ProyectilNormal {
	private double x;
	private double y;
	private int velocidadMovimiento = 10;
	private Image imagen = Herramientas.cargarImagen("recursos/balaverde.png");
	private int tiempoAnterior = 0;
	
	public ProyectilNormal(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void dibujar(Entorno entorno) {
		entorno.dibujarImagen(imagen, x, y, 0, 0.25);
	}
	
	public void mover(int tiempoActual) {
		if(tiempoActual - this.tiempoAnterior > 20) {
			this.x += velocidadMovimiento;
			this.tiempoAnterior = tiempoActual;
		}
	}
	
	public boolean colisiona(Entorno entorno, int[] Zombies) {
		// TODO: implemetar la logica de colision con los zombies
		// y paredes.
		return false;
	}
}
