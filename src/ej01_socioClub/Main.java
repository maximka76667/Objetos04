package ej01_socioClub;

public class Main {

	public static void main(String[] args) {

		SocioClub club1 = new SocioClub("12345678Y");
		club1.printInfo();

		SocioClub club2 = new SocioClub("9875432Y", "Maxim", "Grivennyy");
		club2.printInfo();

		SocioClub club3 = new SocioClub("56768654Y", "Maxim", "Grivennyy", -5);
		club3.printInfo();

	}

}
