package main_package;

public class Function {
	private static final String dniLetra = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	public static boolean esDNIValido (int number, char letter) {
		int rest = number % 23;
		char correctLetter = dniLetra.charAt(rest);
		return Character.toUpperCase(letter) == correctLetter;
	}

}
