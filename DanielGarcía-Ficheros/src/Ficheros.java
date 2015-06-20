import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Ficheros {
	  public static void main(String[] args) {
		  File cancion=new File("C:\\cancion.txt");
		  File salida=new File("C:\\salida.txt");
		try {
			BufferedReader cantando = new BufferedReader(new FileReader(cancion));
			BufferedWriter copia=new BufferedWriter(new FileWriter(salida));
			int perry=cantando.read();
			/*visualizo el fichero por pantalla*/
			int cont=0;
			do{
				System.out.print((char)perry);
				copia.write((char)perry);
				if(perry>='a'&&perry<='z'||perry>='A'&&perry<='Z'){
					cont++;
				}else if(perry==10){
					System.out.println(cont);
					cont=0;
				}
				perry=cantando.read();
			}while(perry!=-1);
			System.out.println("¿Existe?"+cancion.exists());
			System.out.println("¿Es fichero?"+cancion.isFile());
			System.out.println("¿Es directorio?"+cancion.isDirectory());
			System.out.println("¿Se puede ejecutar?"+cancion.canExecute());
			System.out.println("¿Se puede escribir?"+cancion.canWrite());
			System.out.println("¿Se puede leer?"+cancion.canRead());
			System.out.println("¿Está oculto?"+cancion.isHidden());
			System.out.println(new File("C:/Users/Daniel/workspace/dani.txt").exists());
			cantando.close();
			copia.close();
		    File archivo = new File("C:/Users/Daniel/workspace/dani.txt");
		    if(archivo.exists()==false){
		    try{	
		    	archivo.createNewFile();
		    }catch(IOException ex){
		    	
		    }
		    }
		    BufferedWriter existe= new BufferedWriter(new FileWriter(archivo));
		    existe.write("Esta creado");
			existe.close();
		    BufferedReader creando = new BufferedReader(new FileReader(archivo));
			int nemo=creando.read();
			do{
				System.out.print((char)nemo);
				nemo=creando.read();
			}while(nemo!=-1);
            creando.close();
            System.out.println(new File("C:/Users/Daniel/workspace/dani.txt").exists());
            archivo.delete();
            System.out.println(new File("C:/Users/Daniel/workspace/dani.txt").exists());
			
		} catch (IOException e) {
			e.getMessage();
		} 
	  }
}