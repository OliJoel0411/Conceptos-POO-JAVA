package EjerciciosPropuestos;
/**
 *
 * @author Oliver
 */
public class Principal {
    public static void main(String[] args) {
        // Crear o instanciar Objeto cuadrado
        Cuadrado ob1 = new Cuadrado(2.5f,2.5f);
        // Crear o instanciar Objeto Triangulo
        Triangulo obj1 = new Triangulo(2.0f,2.0f,2.0f);
        
        
        // Llamamos primero al metodo a ejecutar
        // Perimetro Cuadrado
        // nombreObjeto.metodo
        ob1.calcularPerimetro();
        // Area del cuadrado
        ob1.calcularArea();
        
        // Perimetro Triangulo
        obj1.calcularPerimetro();
        // Area Triangulo
        obj1.calcularArea();
        
        
        System.out.println(ob1.mostrarDatos());
        System.out.println(" ");
        System.out.println(obj1.mostrarDatos());
    }
}
