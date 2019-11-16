package com.factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;

		System.out.println("Calcular el factorial de: ");
		numero = entrada.nextInt();
		
		for(int i = numero-1; i > 0; i--) {
			System.out.print(i+"x");
			numero *= i;
		}
		System.out.println(" = "+numero);

	}

}
