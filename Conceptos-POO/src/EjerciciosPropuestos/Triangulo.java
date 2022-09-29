package EjerciciosPropuestos;
/**
 *
 * @author Oliver
 */
public class Triangulo {
    //Atributos
    private float lado1;
    private float lado2;
    private float lado3;
    /*
    base = lado1;
    altura = double resultado = (Math.sqrt(3)*lado1)/2;
    */

    public Triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    // Metodos consultores
    public float getLado1() {
        return lado1;
    }
    // Metodo modificador
    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }
    // Metodos consultores
    public float getLado2() {
        return lado2;
    }
    // Metodo modificador
    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
    // Metodos consultores
    public float getLado3() {
        return lado3;
    }
    // Metodo modificador
    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }
    
    // Metodos Analizadores
    // Area - Perimetro
    
    // Metodo para perimetro
    /*
    suma de sus tres lados
    */
    public float calcularPerimetro(){
        float perimetro = (this.lado1)*3; // (this.lado1+this.lado2+this.lado3)
        return perimetro;
    }
    // Metodo Area
    public double calcularArea(){
        double rz = (Math.sqrt(3));
        double h = (rz * this.lado1)/2;
        double area = (this.lado1 * h)/2;
        return area;
    }
    public String mostrarDatos(){
        return "Area = " + calcularArea() + "\nPerimetro = " + calcularPerimetro();
    }
}
