package ejercicio4;

import java.text.Normalizer;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una frase.");
		String frase = scan.nextLine();
		if (isPalindromo(frase) == true) {
			System.out.println("La frase es un palindromo");
		} else {
			System.out.println("La frase no es un palindromo");
		}

	}

	public static boolean isPalindromo(String frase) throws Exception {
		QueueEnlazado cola = new QueueEnlazado();
		StackEnlazado pila = new StackEnlazado();
		char[] array;
		frase = frase.replaceAll("\\s+", "");
		frase = frase.toLowerCase();
		frase = Normalizer.normalize(frase, Normalizer.Form.NFD);
		frase = frase.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
		array = frase.toCharArray();
		for (int i = 0; i < array.length; i++) {
			cola.encolar(array[i]);
		}
		for (int i = 0; i < array.length; i++) {
			pila.push(array[i]);
		}
		do {
			for(int i=0;i<array.length;i++)
			{
				if(cola.desencolar()!=pila.pop())
					return false;
			}
		} while (!cola.esVacia() && !!pila.esVacia());
		return true;
	}
}
