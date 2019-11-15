package com.conteovocales;

import java.util.Scanner;

public class ConteoVocales {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String palabra;
		int numeroVocales = 0;
		char[] vocales = {'a','e','i','o','u','A','E','I','O','U'};
		
		System.out.println("Ingresa una palabra para contar sus vocales");
		palabra = entrada.nextLine();

		for(int i = 0; i < palabra.length(); i++) {
			for(int j = 0; j < vocales.length; j++) {
				if(palabra.charAt(i) == vocales[j]) {
					numeroVocales++;
					break;
				}
			}
		}
		System.out.println("El numero de vocales que contiene es: "+numeroVocales);
	}

}
