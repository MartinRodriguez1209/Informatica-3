package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		String dato;
		int numero = 0;
		Scanner scan = new Scanner(System.in);
		StackArrInts pila = new StackArrInts(20);

		System.out.println("Ingrese los numeros con los que desea operar(ingrese 0 para salir)");
		do {
			dato = scan.nextLine();
			try {
				numero = Integer.parseInt(dato);
				pila.push(numero);
			} catch (NumberFormatException e) {
				calcu(dato, pila);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (numero != 0);
		System.out.println("Fin");
	}

	private static void calcu(String dato, StackArrInts pila) {
		int resultado, aux;
		try {
			if (pila.tam() >= 1) {
				System.out.print("Resultado:");
				switch (dato) {
				case "+":
					resultado = pila.pop() + pila.pop();
					pila.push(resultado);
					System.out.println(resultado);
					break;
				case "-":
					aux = pila.pop();
					resultado = pila.pop() - aux;
					pila.push(resultado);
					System.out.println(resultado);
					break;
				case "*":
					resultado = pila.pop() * pila.pop();
					pila.push(resultado);
					System.out.println(resultado);
					break;
				case "/":
					resultado = pila.pop() / pila.pop();
					pila.push(resultado);
					System.out.println(resultado);
					break;
				default:
					System.out.println("Operacion no valida.");

					break;
				}
			} else {
				System.out.println("Cantidad de numeros insuficientes, ingrese otra vez.");
			}
		} catch (Exception e1) {
			System.out.println("cantidad de numeros insuficientes, ingrese otra vez");
		}
	}

}
