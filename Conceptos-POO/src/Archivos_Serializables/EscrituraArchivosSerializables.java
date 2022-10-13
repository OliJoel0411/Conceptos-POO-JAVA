package Archivos_Serializables;

import java.io.Serializable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author oliver
 */
public class EscrituraArchivosSerializables {
    
    public static void main(String[] args) {
        //Escritura de Archivo Serializable
        // Se puede automatizar usando la clase vector. 
        
        //Creando el objeto persona
        Persona p;
        try{
            // Creamos un archivo
            File archivo = new File("archivo2.txt");
            // creamos  un flujo de salida para escribir datos
            FileOutputStream fos = new FileOutputStream(archivo);
            // escribe tipos de datos primitivos y gráficos de objetos Java en un OutputStream
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // Creamos la instancia de nuestro objeto Persona
            p = new Persona(1, "Oliver", "Locon", "oliverloconlopez@gmail.com");
            p = new Persona(2, "Joel", "Iquite", "joeliquite@gmail.com");
            p = new Persona(3, "Willy", "Morales", "WilliMorales@gmail.com");
            //Escribimos en el archivo
            oos.writeObject(p);
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
     }
    
}


// Creando la clase persona, la cual es serializable
class Persona implements Serializable{
    // Atributos
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    
    // Método Constructor
    public Persona(int id, String nombre, String apellido,
    String correo) {
                this.id = id;
                this.nombre = nombre;
                this.apellido = apellido;
                this.correo = correo;
    }
    
    
    // Métodos Gett and Sett
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    // Método
    public String toString(){
        return "Id: " + this.id + "\nNombre: " +this.nombre + "\nApellido: "+ this.apellido+ "\nCorreo: "+ this.correo;
    }
    
}
