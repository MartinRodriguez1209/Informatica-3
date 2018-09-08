package ordenamientostring;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readTxt {

	public static String[] read() throws FileNotFoundException {
		Scanner f = new Scanner(new File("/home/mrodriguez/Descargas/es.txt"));
		String aux = f.useDelimiter("\\A").next();
		String[] a = aux.split("\n");
		return a;
	}
}
