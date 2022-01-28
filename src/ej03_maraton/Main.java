package ej03_maraton;

public class Main {

	public static void main(String[] args) {

		MarcaMaraton marca = new MarcaMaraton(7, 59, 59);
		MarcaMaraton marca2 = new MarcaMaraton(7, 59, 59);

		marca.printMarca();
		System.out.println(marca.convertASegundos());

		marca.addSecond();

		marca.printMarca();
		System.out.println(marca.convertASegundos());

		System.out.println(marca.isEqualTo(marca2));
		System.out.println(marca.greaterThan(marca2));
		System.out.println(marca.lessThan(marca2));
	}

}
