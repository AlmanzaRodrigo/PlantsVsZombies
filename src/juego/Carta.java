package juego;

import entorno.Entorno;

public class Carta {
	private double x;
	private double y;
	private double ancho;
	private double alto;
	private int enfriamiento;
	private int tiempoAnterior;
	
	public String PEA_SHOOTER = "peaShooter";

	public Carta(double x, double y, double ancho, double alto) {
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
		this.enfriamiento = 0;
		this.tiempoAnterior = 0;
	}
	
	public void dibujar(Entorno entorno) {
		entorno.dibujarRectangulo(x, y, ancho, alto, 0, null);
	}
	
	public boolean estaDentro(double x, double y) {
		if(x < this.x + this.ancho / 2 && x > this.x - this.ancho / 2) {
			if(y < this.y + this.alto / 2 && y > this.y - this.alto / 2) {
				return true;
			}
		}
		return false;
	}
	
	public boolean estaDisponible() {
		if(this.enfriamiento == 100) {
			this.enfriamiento = 0;
			return true;
		}
		return false;
	}
	
	public void actualizarEnfriamiento(int tiempoActual) {
		if(tiempoActual - this.tiempoAnterior > 90) {
			this.enfriamiento = Math.min(100, this.enfriamiento + 1);
			this.tiempoAnterior = tiempoActual;
		}
	}
}
