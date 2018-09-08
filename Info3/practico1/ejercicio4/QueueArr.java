package ejercicio4;

public class QueueArr {

	private int entrada;
	private int salida;

	private char[] datos;
	private int cantidad;

	public QueueArr() {
		entrada = 0;
		salida = 0;
		datos = new char[10];
		cantidad = 0;
	}

	public QueueArr(int t) {
		entrada = 0;
		salida = 0;
		datos = new char[t];
		cantidad = 0;
	}

	public void encolar(char d) throws Exception {
		if (estaLlena())
			throw new Exception("Cola llena: " + d);

		cantidad++;
		datos[entrada] = d;
		entrada = incrementar(entrada);
	}

	public char desencolar() throws Exception {
		if (estaVacia())
			throw new Exception("Cola vacia");

		cantidad--;
		char d = datos[salida];
		salida = incrementar(salida);
		return d;
	}

	public boolean estaVacia() {
		return entrada == salida && cantidad == 0;
	}

	public boolean estaLlena() {

		return entrada == salida && cantidad > 0;
	}

	public int mostrarSalida() {
		return datos[incrementar(salida)];
	}

	private int incrementar(int x) {
		return (x + 1) % datos.length;
	}

}