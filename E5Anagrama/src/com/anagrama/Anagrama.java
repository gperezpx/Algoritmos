package com.anagrama;

import java.util.Scanner;

public class Anagrama {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palabra1;
		String palabra2;
		
		System.out.println("Ingresa la primer palabra");
		palabra1 = entrada.nextLine();
		System.out.println("Ïngresa la segunda palabra");
		palabra2 = entrada.nextLine();
		
		if(isAnagrama(palabra1, palabra2)) {
			System.out.println("Es un anagrama");
		}
		else {
			System.out.println("No es un anagrama");
		}
	}
	public static boolean isAnagrama(String palabra1, String palabra2) {
		boolean anagrama = false;
		int suma1 = 0, suma2 = 0;
		
		if(palabra1.length() == palabra2.length()) {
			/*for(int i = 0; i < palabra1.length(); i++) {
				suma1 += palabra1.codePointAt(i);
				suma2 += palabra2.codePointAt(i);
			}*/
			palabra1 = palabra1.toUpperCase();
			palabra2 = palabra2.toUpperCase();
			suma1 = palabra1.codePointCount(0, palabra1.length()-1);
			suma2 = palabra2.codePointCount(0, palabra2.length()-1);
			
			if(suma1 == suma2)
				anagrama = true;
		}
		return anagrama;
	}

}
