package com.palindromo;

import java.util.Scanner;

public class ArregloEspejo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String oracion;
		boolean isPalindromo = true;
		
		System.out.println("Ingresa una oracion: ");
		oracion = entrada.nextLine();
		
		for(int i = 0, j = oracion.length()-1; i == j; i++,j--) {
			if(oracion.charAt(i) != oracion.charAt(j)) {
				isPalindromo = false;
				break;
			}
		}
		if(isPalindromo)
			System.out.println("La oracion es un palindromo");
		else
			System.out.println("La oracion no es un palindromo");
	}

}
