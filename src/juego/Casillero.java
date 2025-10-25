package juego;


public class Casillero {
    private int fila;
    private int columna;
    private double x;
    private double y;
    private boolean ocupado;

    public Casillero(int fila, int columna, double x, double y) {
        this.fila = fila;
        this.columna = columna;
        this.x = x;
        this.y = y;
        this.ocupado = false;
    }

    
    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean estaOcupado() {
        return ocupado;
    }

    
    public void ocupar() {
        this.ocupado = true;
    }

    public void liberar() {
        this.ocupado = false;
    }

  
}