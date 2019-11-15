package com.pseudoaleatorios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class NumerosPseudoAleatoriosIterator {

	public static void main(String[] args) {
		final int NUMEROS_ALEATORIOS = 100;
		final int NUMERO_MAXIMO = 1000;
		
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		Random pseudoaleatorios = new Random(System.nanoTime());
		
		for(int i = 0; i < NUMEROS_ALEATORIOS; i++) {
			listaNumeros.add(pseudoaleatorios.nextInt(NUMERO_MAXIMO));
		}
		
		Iterator<Integer> iterador = listaNumeros.iterator();
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
	}

}
