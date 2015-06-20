package Concadenar;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Concadenacion {
	public static void main(String[] args) {
		File cancion=new File("C:\\cancion.txt");
		File datos=new File("C:\\datos.txt");
		try {
			FileWriter concadena=new FileWriter(cancion);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
