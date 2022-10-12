package archivosSerializables;
//Librerias
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Vector;
/**
 *
 * @author oliver
 */
public class LecturaArchivosSerializables {
    
        
    public static void main(String[] args) {
    Persona2 p;
    Vector v = new Vector();
            p = new Persona2(1, "Oliver", "Locon", "oliverloconlopez@gmail.com");
            v.add(p);
            p = new Persona2(2, "Joel", "Iquite", "joeliquite@gmail.com");
            v.add(p);
            p = new Persona2(3, "Willy", "Morales", "WilliMorales@gmail.com");
            v.add(p);
    
    try{
             // Creamos un archivo
            File archivo = new File("archivo2.txt");
            FileOutputStream fos = new FileOutputStream(archivo);
            // escribe tipos de datos primitivos y gráficos de objetos Java en un OutputStream
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // Creamos la instancia de nuestro objeto Persona
            
            //Escribimos en el archivo
            oos.writeObject(v);
            
        // El archivo2 es quien contiene los objetos dentro del archivo de texto
        FileInputStream fis = new FileInputStream(archivo);
        ObjectInputStream ois = new ObjectInputStream(fis);
        v=(Vector)ois.readObject();
        
    }catch (FileNotFoundException e) {
          e.printStackTrace();
    } catch (IOException e) {
          e.printStackTrace();
    } catch (ClassNotFoundException e) {
          e.printStackTrace();
    }
        // Mostrando en la pantalla 
        
        Iterator iterator = v.iterator();
        while(iterator.hasNext()){
        p=(Persona2)iterator.next();
        System.out.println(p.toString());
        }
        
    }
    }
        // Creando la clase persona, la cual es serializable
class Persona2 implements Serializable{
    // Atributos
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    
    // Método Constructor
    public Persona2(int id, String nombre, String apellido,
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

