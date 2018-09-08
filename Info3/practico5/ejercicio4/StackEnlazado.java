package ejercicio4;

public class StackEnlazado {
	private Nodo tope;

	StackEnlazado() {
		tope = null;
	}

	void push(char d) {
		Nodo aux = new Nodo(d, tope);
		tope = aux;
		// tope = new Nodo(d, tope);
	}

	char pop() throws Exception {
		if (tope == null)
			throw new Exception("stack vacio");
		char res = tope.getDato();
		tope = tope.getNext();
		return res;
	}

	boolean esVacia() {
		return tope == null;
	}

	void vaciar() {
		tope = null;
	}
}