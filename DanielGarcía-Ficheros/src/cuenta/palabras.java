package cuenta;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class palabras {
	  public static void main(String[] args) {
		  File cancion=new File("C:\\cancion.txt");
		try {
			BufferedReader cantando = new BufferedReader(new FileReader(cancion));
			int perry=cantando.read();
			int cont=0;
			int aux=0;
			File archivo = new File("C:/Users/Daniel/workspace/dani.txt");
		    if(archivo.exists()==false){
		    try{	
		    	archivo.createNewFile();
		    }catch(IOException ex){
		    	System.out.println("no se puede acceder a esa ruta");
		    }
		    }
		    System.out.println(archivo.exists());
			FileWriter copia=new FileWriter(archivo);
			do{
				System.out.print((char)perry);
				if(perry>='a'&&perry<='z'){
					copia.write((char)(perry-32));
				}else{
					copia.write((char)perry);
				}
				perry=cantando.read();
				if(perry==' '&&aux==0||perry==10&&aux==0){
					cont++;
					aux=1;
				}else if(perry>='a'&&perry<='z'||perry>='A'&&perry<='Z'){
					aux=0;
				}
				if(perry==10){
					System.out.println(cont);
					cont=0;
				}
			}while(perry!=-1);
			copia.close();
			cantando.close();
		}catch(FileNotFoundException juan){
			
		}catch(IOException mimi){
			
		}
	  }
}
