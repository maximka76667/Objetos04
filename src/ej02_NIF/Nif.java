package ej02_NIF;

public class Nif {

	// Attributes
	private String dni, letra;

	public Nif(String dni) {
		setDni(dni);
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		if (String.valueOf(dni).length() != 8) {
			System.out.println("Error");
		} else {
			this.dni = dni;
			this.letra = calcularLetra();
		}
	}

	public String getLetra() {
		return this.letra;
	}

	private String calcularLetra() {
		String[] letras = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
				"H", "L", "C", "K", "E" };

		return letras[Integer.parseInt(this.dni) % 23];
	}

	public void printNif() {
		System.out.println("NIF: " + this.dni + "-" + this.letra);
	}

}
