package ordenamientostring;

import java.io.FileNotFoundException;
import java.util.Random;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		long a;
		long b;
		String[] palabras = readTxt.read();
		metodos metodo = new metodos();
		a = System.currentTimeMillis();
		a = System.currentTimeMillis();
		metodos.quicksort(palabras, 0, palabras.length - 1);
		b = System.currentTimeMillis();
		System.out.println("Ordenamiento quicksort");
		System.out.println("Tiempo: " + (b - a));
		System.out.println();
		

		String[] palabras2 = readTxt.read();
		int tam = palabras2.length;
		a = System.currentTimeMillis();
		metodos.shell(palabras2, tam);
		b = System.currentTimeMillis();
		System.out.println("Ordenamiento shell");
		System.out.println("Tiempo: " + (b - a));
		System.out.println();

		String[] palabras3 = readTxt.read();
		a = System.currentTimeMillis();
		metodos.insertionSort(palabras3);
		b = System.currentTimeMillis();
		System.out.println("Ordenamiento insertion");
		System.out.println("Tiempo: " + (b - a));
		mostrarArreglo(palabras3);

		/*
		 * 
		 * metodo.insertionSort(arreglo); b = System.currentTimeMillis();
		 * System.out.println("Metodo insertionSort"); System.out.println("Tiempo: " +
		 * (b - a));
		 * 
		 * 
		 * 
		 * 
		 * a = System.currentTimeMillis(); metodo.shell(arreglo3, arreglo3.length - 1);
		 * b = System.currentTimeMillis(); System.out.println("Ordenamiento shell");
		 * System.out.println("Tiempo: " + (b - a));
		 */
	}

	private static void mostrarArreglo(String[] arreglo) {
		for (int i = 0; i < 1000; i++) {
			System.out.print(arreglo[i] + " ");

		}
		System.out.println();

	}
}
