package ClaseString;

/**
 *
 * @author oliver
 */
public class ClaseString {
    public static void main(String[] args) {
        // Creando un objeto de la Clase String
        String cadena = "Hola mun";
        String cadena2 = "Hola mund";
        
        if(cadena.compareTo(cadena2) == 0){
            System.out.println("son iguales");
        }else if(cadena.compareTo(cadena2) <0) {
            System.out.println("la primera es menor");
        }else if(cadena.compareTo(cadena2)>0){
            System.out.println("la primera es mayor");
        }
        
        String cadena3 = new String();
        
        System.out.println(cadena3);
        char [] oli ={'1', '2','3' };
        String cadena4 = new String(oli);
        System.out.println(cadena4.charAt(1));
        
        
        
        
        
        
    }
}
