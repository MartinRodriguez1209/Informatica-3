package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		String expresion;
		char[] arrayexp;

		System.out.println("Ingrese una expresion matematica");
		expresion = scan.nextLine();
		arrayexp = expresion.toCharArray();
		QueueArr pila = new QueueArr(arrayexp.length);

		for (int i = 0; i < arrayexp.length; i++) {
			pila.encolar(arrayexp[i]);
		}
		for (int i = 0; i < arrayexp.length; i++) {
			System.out.print(pila.desencolar());
		}

	}

}