package ejercicio2;

public class StackArrInts {
	private int tope;
	private int[] datos;

	public StackArrInts() {
		tope = -1;
		datos = new int[10];
	}

	public StackArrInts(int c) {
		tope = -1;
		datos = new int[c];
	}

	public void push(int d) throws Exception {
		if (tope + 1 >= datos.length)
			throw new Exception("Pila Llena");

		tope++;
		datos[tope] = d;
	}

	public int pop() throws Exception {
		if (tope < 0)
			throw new Exception("Pila vacia");

		return datos[tope--];
	}

	public boolean estaVacia() {
		return tope == -1;
	}

	public int tam() {
		return tope;
	}
}