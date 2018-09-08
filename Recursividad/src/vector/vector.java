package vector;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arreglo = { 5000, 800, 9, 4, 11, 11110 };
		int a = ordenar(arreglo, 5);
		System.out.println(a);
	}

	static int ordenar(int[] arreglo, int tam) {
		if (tam == 0) {
			return arreglo[tam];
		}
		int aux=ordenar(arreglo, tam - 1);
		if (arreglo[tam] > aux)
			return arreglo[tam];
		else {
			return aux;
		}
	}
}
