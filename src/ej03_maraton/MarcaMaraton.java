package ej03_maraton;

public class MarcaMaraton {

	private int horas, minutos, segundos;

	public MarcaMaraton() {
		this(0, 0, 0);
	}

	public MarcaMaraton(int horas, int minutos, int segundos) {
		setHoras(horas);
		setMinutos(minutos);
		setSegundos(segundos);
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		if (horas < 0)
			return;
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		if (minutos < 0)
			return;
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		if (segundos < 0)
			return;
		this.segundos = segundos;
	}

	public void printMarca() {
		System.out.println(this.horas + ":" + this.minutos + ":" + this.segundos);
	}

	public int convertASegundos() {
		return this.horas * 3600 + this.minutos * 60 + this.segundos;
	}

	public void addSecond() {
		if (this.segundos >= 59) {
			this.segundos = 0;
			addMinute();
		} else
			this.segundos++;
	}

	public void addMinute() {
		if (this.minutos >= 59) {
			this.minutos = 0;
			addHour();
		} else
			this.minutos++;
	}

	public void addHour() {
		this.horas++;
	}

	public boolean isEqualTo(MarcaMaraton marca) {
		return this.convertASegundos() == marca.convertASegundos();
	}

	public boolean greaterThan(MarcaMaraton marca) {
		return this.convertASegundos() > marca.convertASegundos();
	}

	public boolean lessThan(MarcaMaraton marca) {
		return this.convertASegundos() < marca.convertASegundos();
	}
}
