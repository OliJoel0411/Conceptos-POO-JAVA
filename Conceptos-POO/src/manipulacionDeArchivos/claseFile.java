package manipulacionDeArchivos;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author oliver
 */
public class claseFile {
    public static void main(String[] args) {
        // Uso de la clase File
    
    File archivo = new File("archivo.txt"); // dentro de los parentesis ponemos el nombre del archivo que queremos crear
    // Métodos disponibles para la clase File
    
    // Método para conocer el nombre del archivo.
    System.out.println("El nombre del archivo es: " + archivo.getName());
    
    // Método para conocer la ruta absoluta. 
    System.out.println("La ruta absoluta es: " + archivo.getAbsoluteFile().toString());
    
    
    // Método para saber si un archivo fue creado
    try{
        // corrobora si el archivo fue creado.
        if(archivo.createNewFile()){
            System.out.println("Archivo creado exitosamente");
        }else{
            System.out.println("El archivo no fue creado");
        }
    }
    catch(IOException e){
        e.printStackTrace();
    }
    
        // Método para averiguar el directorio
        System.out.println("Es directorio? " +archivo.isDirectory());
        // Método para saber si es un archivo
        System.out.println("Es archivo? " + archivo.isFile());
        System.out.println("Fecha de modificación: " + archivo.lastModified());
        Date fecha = new Date(archivo.lastModified());
        System.out.println("Fecha de modificación: " + fecha.toString());
        System.out.println("Tamanio del archivo " + archivo.length());
    
                                
            
                
     }
        
}
