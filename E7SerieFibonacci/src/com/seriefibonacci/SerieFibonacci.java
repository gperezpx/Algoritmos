package com.seriefibonacci;

import java.util.Scanner;

public class SerieFibonacci {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int limite;
		int anterior = 0;
		int actual = 1;
		int serie = 0;
		
		System.out.println("Ingresa el limite de la serie: ");
		limite = entrada.nextInt();
		
		for(int i = 0; i < limite; i++) {
			System.out.print(serie+" ");
			serie = anterior + actual;
			anterior = actual;
			actual = serie;
		}
	}

}
