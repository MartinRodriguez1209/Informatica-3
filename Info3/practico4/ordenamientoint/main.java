package ordenamientoint;

import java.util.Random;

public class main {

	public static void main(String[] args) {
		Random rand = new Random(System.currentTimeMillis());
		int[] arreglo = new int[10000000];
		int[] arreglo2 = new int[10000000];
		int[] arreglo3 = new int[10000000];
		int auxr;
		long a;
		long b;
		for (int aux = 0; aux < 100; aux++) {
			auxr = rand.nextInt(100);
			arreglo[aux] = auxr;
			arreglo2[aux] = auxr;
			arreglo3[aux] = auxr;
		}
		metodos metodo = new metodos();
		a = System.currentTimeMillis();
		metodo.insertionSort(arreglo);
		b = System.currentTimeMillis();
		System.out.println("Metodo insertionSort");
		System.out.println("Tiempo: " + (b - a));
		

		a = System.currentTimeMillis();
		metodo.quicksort(arreglo2, 0, arreglo2.length - 1);
		b = System.currentTimeMillis();
		System.out.println("Ordenamiento quicksort");
		System.out.println("Tiempo: " + (b - a));
		
		
		a = System.currentTimeMillis();
		metodo.shell(arreglo3, arreglo3.length - 1);
		b = System.currentTimeMillis();
		System.out.println("Ordenamiento shell");
		System.out.println("Tiempo: " + (b - a));

	}

	private static void mostrarArreglo(int[] arreglo) {
		for (int i = 0; i < 100; i++) {
			System.out.print(arreglo[i] + " ");

		}
		System.out.println();

	}
}
