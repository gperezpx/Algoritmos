package com.cadenabalanceada;

import java.util.Scanner;

public class CadenaBalanceada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String oracion;
		int contadorX = 0;
		int contadorY = 0;
		
		System.out.println("Ingresa una oracion con 'X' y 'Y'");
		oracion = entrada.nextLine();
		oracion = oracion.toUpperCase();
		
		for(int i = 0; i < oracion.length(); i++) {
			if(oracion.charAt(i) == 'X')
				contadorX++;
			if(oracion.charAt(i) == 'Y')
				contadorY++;
		}
		
		System.out.println("Numero de Y: "+contadorY);
		System.out.println("Numero de X: "+contadorX);
		
		if(contadorX == contadorY)
			System.out.println("La cadena esta balanceada");
		else
			System.out.println("La candea no esta balanceada");
	}

}
