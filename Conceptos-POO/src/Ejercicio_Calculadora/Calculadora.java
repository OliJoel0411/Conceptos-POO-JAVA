package Ejercicio_Calculadora;


public class Calculadora {
    //Atributos
    private int num1;
    private int num2;

    //Constructor
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int getSuma(int a , int b){
        int suma = this.num1 + this.num2;
        return suma;
    }
    public int getResta(int a , int b){
        int resta = this.num1 - this.num2;
        return resta;
    }
    public int getMult(int a , int b){
        int mult = this.num1 * this.num2;
        return mult;
    }
    public int getDiv(int a , int b){
        int div = this.num1 / this.num2;
        return div;
    }
}
