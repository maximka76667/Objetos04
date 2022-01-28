package ej04_linea;

public class Main {

	public static void main(String[] args) {

		Linea linea = new Linea();

		linea.printInfo();

		linea.moveRight(3);
		linea.moveLeft(4);
		linea.moveUp(5);
		linea.moveDown(-1);

		linea.printInfo();

	}

}
