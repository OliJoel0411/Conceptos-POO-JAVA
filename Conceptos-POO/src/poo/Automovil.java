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
    
   // public void detalle(){   *modificado 01*
        // nombre de la instancia es This, hace refernecia a si mismo
      //   System.out.println("auto = " + this.fabricante);  *modificado 01*
      
    public String verDetalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nFabricante: ").append(this.fabricante);
        sb.append("\nModelo: ").append( this.modelo);
        return sb.toString();
      
        }
    
    // Agregando el metodo Acelerar
    // Metodo que recibe argumentos
    public String acelerar(int rpm){
        return "el auto " + this.fabricante + " acelerando a " + rpm + " rpm";   
        }
    // Agregando el metodo Frenar
    public String frenar(){
        return this.fabricante + " " + this.modelo + "Frenando!!!";
        }
    }

