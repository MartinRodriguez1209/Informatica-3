package ordenamientodouble;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readTxt {

	public static String[] read() throws FileNotFoundException {

		Scanner f = new Scanner(new File("es.tst"));
		String aux = f.useDelimiter("\\A").next();
		String[] a = aux.split("\n");
		return a;
	}
}
