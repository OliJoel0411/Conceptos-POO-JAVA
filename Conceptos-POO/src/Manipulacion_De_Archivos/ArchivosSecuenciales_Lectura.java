package Manipulacion_De_Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author oliver
 */
public class ArchivosSecuenciales_Lectura {
    public static void main(String[] args) {
        
        try{
            
            File archivo = new File("archivo.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String mensaje;
            int i=0;
            while((mensaje=br.readLine())!=null){
                
                System.out.println("El valor que almacena lo que lei es: " + mensaje+ "en la linea "+ i);
                i++;
            }
            
            System.out.println("El valor que almacena lo que lei es: " + mensaje+" en la linea " + i);
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
             e.printStackTrace();
        }
           
    }
}
