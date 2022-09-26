package poo;

/**
 *
 * @author oliver
 */
public class Automovil {
    // Aqui podremos definir
    // ATRIBUTOS O CARACTERISTICAS
    // METODOS O FUNCINALIDADES
    
    
    //Atributos de Automovil
    /*
    Estos son atributos que tienen todos los automoviles
    y asi podremos crear distintos "OBJETOS" 
    */
    String fabricante;
    String modelo;
    String color;
    double cilindrada;
            
    //Creando Métodos
    
    public void detalle(){
        // nombre de la instancia es This, hace refernecia a si mismo
         System.out.println("auto = " + this.fabricante);
    }
}
