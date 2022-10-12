package manipulacionDeArchivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author oliver
 */
public class ArchivosSecuenciales_Escritura {
    public static void main(String[] args) {
        
        // Escritura en un archivo secuencial
        
        
        // Creamos la instancia de tipo File
   try{ 
            File archivo = new File("archivo.txt");
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < 10; i++) {
                bw.write("Escritura en archivo #" + i);
                bw.newLine();
           
       }
                // cerramos BuffereWriter
                bw.close();
    }
    catch(FileNotFoundException e){
        e.printStackTrace();
    }
    catch(IOException e){
    e.printStackTrace();
    
}
    }
}
