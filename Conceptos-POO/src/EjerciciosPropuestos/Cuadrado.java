package EjerciciosPropuestos;
/**
 *
 * @author Oliver
 */
public class Cuadrado {
    // Atributos
    private float lado1;
    private float lado2;
    //Constructor
    public Cuadrado(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    // Metodo consultor
    public float getLado1() {
        return lado1;
    }
    // Metodo modificador
    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }
    // Metodo consultor
    public float getLado2() {
        return lado2;
    }
    // Metodo modificador
    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
    
    // Metodo Analizador
    
    // Perimetro - Area
    
    // Perimetro
    
    public float calcularPerimetro(){
        float perimetro = (this.lado1 + this.lado2) * 2;
        return perimetro;
    }
    // Area
    public float calcularArea(){
        float area = (this.lado1*this.lado1);
        return area;
    }
    // Mostrar los datos procesados
    public String mostrarDatos(){
        return "Area = " + calcularArea() + "\nPerimetro = " + calcularPerimetro();  
    }
}
