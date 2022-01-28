package ej04_linea;

import ej02_punto.Punto;

public class Linea {

	Punto puntoInicial, puntoFinal;

	public Linea() {

		this(new Punto(0, 0, "A"), new Punto(0, 0, "B"));
	}

	public Punto getPuntoInicial() {
		return puntoInicial;
	}

	public void setPuntoInicial(Punto puntoInicial) {
		this.puntoInicial = puntoInicial;
	}

	public Punto getPuntoFinal() {
		return puntoFinal;
	}

	public void setPuntoFinal(Punto puntoFinal) {
		this.puntoFinal = puntoFinal;
	}

	public Linea(Punto puntoInicial, Punto puntoFinal) {
		this.puntoInicial = puntoInicial;
		this.puntoFinal = puntoFinal;
	}

	public void moveRight(int cantidad) {
		this.puntoInicial.moveX(cantidad);
		this.puntoFinal.moveX(cantidad);
	}

	public void moveLeft(int cantidad) {
		this.puntoInicial.moveX(-cantidad);
		this.puntoFinal.moveX(-cantidad);
	}

	public void moveUp(int cantidad) {
		this.puntoInicial.moveY(cantidad);
		this.puntoFinal.moveY(cantidad);
	}

	public void moveDown(int cantidad) {
		this.puntoInicial.moveY(-cantidad);
		this.puntoFinal.moveY(-cantidad);
	}

	public void printInfo() {
		this.puntoInicial.printInfo();
		System.out.print(" y ");
		this.puntoFinal.printInfo();
		System.out.println();
	}

}
