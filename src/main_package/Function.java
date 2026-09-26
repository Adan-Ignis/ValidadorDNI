package main_package;

public class Function {
	private static final String dniLetra = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	public static boolean esDNIValido (String numberStr, char letter) {
		if (!numberStr.matches("\\d{8}")) {
			System.out.println("Error: el numero solo debe tener 8 dígitos");
			return false;
		}
		
		int number = Integer.parseInt(numberStr);
		
		char correctLetter = dniLetra.charAt(number % 23);
		return Character.toUpperCase(letter) == correctLetter;
	}

}
