package main_package;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number;
		char letter;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Pon el numero de tu DNI: ");
		number = scanner.next();
		scanner.nextLine(); //Limpiar el bufer (Consume el "\n" remanente)
		System.out.print("Pon la letra de tu DNI: ");
		letter = scanner.next().charAt(0);
		scanner.close();
		
		boolean esValido = Function.esDNIValido(number, letter);
		if (esValido) {
			System.out.println("El DNI es correcto");
		} else {
			//System.out.println("El DNI es incorrecto");
		}
	}

}
