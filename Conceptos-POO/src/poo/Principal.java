// Sintaxis para definir el paquete en el que estamos trabajando 
package poo;

/**
 *
 * @author oliver
 */
// Sintaxis para definir la clase principal
public class Principal {
    // En la clase principal se ejercutara el main que sera el encargado de ejercutar el programa
    public static void main(String[] args) {
        // Desde aquí podremos crear " OBJETOS  "  
        // Instanciar un objeto
        
        Automovil auto = new Automovil();
        System.out.println("auto = " + auto.fabricante);
    }
}
