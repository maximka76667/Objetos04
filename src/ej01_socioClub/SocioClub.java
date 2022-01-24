package ej01_socioClub;

public class SocioClub {

	// Atributes
	private String dni, nombre, apellidos;
	private double cuotaMensual;

	// Constructors
	public SocioClub(String dni) {
		this(dni, null, null);
	}

	public SocioClub(String dni, String nombre, String apellidos) {
		this(dni, nombre, apellidos, 0);
	}

	public SocioClub(String dni, String nombre, String apellidos, double cuotaMensual) {
		setDni(dni);
		this.nombre = nombre;
		this.apellidos = apellidos;
		setCuotaMensual(cuotaMensual);
	}

	// Getters and setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if (dni.length() != 9)
			System.out.println("Error. Dni debe contener 9 caracteres.");
		else
			this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getCuotaMensual() {
		return cuotaMensual;
	}

	public void setCuotaMensual(double cuotaMensual) {
		if (cuotaMensual < 0)
			System.out.println("Error. Cuota Mensual no puede ser inferior a 0.");
		else
			this.cuotaMensual = cuotaMensual;
	}

	// Print info
	public void printInfo() {
		System.out.println("DNI: " + this.dni);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellidos: " + this.apellidos);
		System.out.println("Cuota Mensual: " + this.cuotaMensual);
		System.out.println();
	}
}
