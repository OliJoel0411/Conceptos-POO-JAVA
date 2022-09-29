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
        
      Automovil mazda = new Automovil();
      mazda.fabricante = "Mazda";
      mazda.modelo = "2020";
      mazda.cilindrada = 2.0;
      mazda.color = "Azul";
      
      Automovil subaru = new Automovil();
      subaru.fabricante = "Mazda";
      subaru.modelo = "2020";
      subaru.cilindrada = 2.0;
      subaru.color = "Azul";
      
  /*   System.out.println("auto = " + auto.fabricante); *modificado 01 **/
       // System.out.println(mazda.verDetalle());
       
       
       // llamando metodos desde el main
        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerar(1000));
        System.out.println(mazda.frenar());
        
        System.out.println("\n"+subaru.verDetalle());
        System.out.println(subaru.acelerar(1500));
        System.out.println(subaru.frenar());
        
        // llamando al metodo para calcular la gasolina consumida por litro
        
        System.out.println("Kilometro por litro: " + subaru.calcularConsumo(300, 0.75f));
        System.out.println("Kilometro por litro: " + mazda.calcularConsumo(250, 0.75f));
        
        System.out.println("Kilometro por litro: " + subaru.calcularConsumo(300, 75));
        System.out.println("Kilometro por litro: " + mazda.calcularConsumo(250, 75));
      
    }
}
