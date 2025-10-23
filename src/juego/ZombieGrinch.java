package juego;

import java.awt.Image;
import entorno.Entorno;
import entorno.Herramientas;

public class ZombieGrinch {
    private double x;
    private double y;
    private int ancho;
    private int alto;
    private int velocidad;
    private int salud;
    private int filaObjetivo;
    private Image imagen;

    public ZombieGrinch(double xInicial, int fila) {
        this.x = xInicial;
        this.filaObjetivo = fila;
        this.y = -50; 
        this.ancho = 40;
        this.alto = 60;
        this.velocidad = 2;
        this.salud = 2;
        this.imagen = Herramientas.cargarImagen("recursos/zombiegrinch.png");
    }

    public void dibujar(Entorno entorno) {
        entorno.dibujarImagen(imagen, x, y, 0, 0.5);
    }

    public void mover() {
        if (y < filaObjetivo) {
            y += velocidad;
        } else {
            x -= velocidad;
        }
    }

    public void recibirDisparo() {
        this.salud -= 1;
    }

    public boolean estaMuerto() {
        return this.salud <= 0;
    }

    public boolean llegoARegalo() {
        return this.x < 100;
    }

    
}