package juego;

import java.awt.Image;

import entorno.Entorno;
import entorno.Herramientas;

public class PeaShooter {
	private double x;
	private double y;
	private int alto = 80;
	private int ancho = 80;
	private int salud;
	private Image imagen = Herramientas.cargarImagen("recursos/ceydsulp.png");
	
	public PeaShooter(double x, double y, int salud) {
		this.x = x;
		this.y = y;
		this.salud = salud;
	}
	
	public void dibujar(Entorno entorno) {
//		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, Color.PINK);
		entorno.dibujarImagen(this.imagen, this.x, this.y, 0, 0.5);
	}
	
	public void mover(Entorno entorno, Object[] objetos) {
		System.out.println("RoseBlade se movió");
	}
	
	public void disparar(Entorno entorno) {
		System.out.println("RoseBlade disparó");
	}
	
	public void recibirDanio(int danio) {
		this.salud -= danio;
		System.out.println("RoseBlade recibió daño");
		if(this.salud <= 0) {
			System.out.println("RoseBlade eliminado");
		}
	}
}
