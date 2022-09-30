package Ejercicio02;

/**
 *
 * @author Oliver
 */
public class Calculadora {
    String marca;
    String modelo;
    String color;
    

    public Calculadora(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    // Metodos Analizadores (Recibir parametros)
    // Metodo para sumar
    // Los parametros deben de definir de que tipo son
    public float calcularSuma(float n1, float n2){
        float suma = n1 + n2;
        return  suma;
    }
    public String calcularResta(float n1, float n2){
        float resta = n1 - n2;
        return "La resta es: " + resta;
    }
    
    
}
