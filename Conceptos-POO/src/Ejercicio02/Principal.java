package Ejercicio02;

import java.io.ObjectInputStream;
import java.util.Scanner;

/**
 *
 * @author Oliver
 */
public class Principal {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        String mar, mod, col;
        System.out.println("Diseñe su calculadora");
        System.out.println("Ingrese la marca");
        mar = tc.next();
        System.out.println("Ingrese el modelo");
        mod = tc.next();
        System.out.println("Ingrese el color");
        col = tc.next();
        
        Calculadora calcu1 = new Calculadora(mar,mod,col);
        
        System.out.println("Calculadora");
        System.out.println("Marca: " + calcu1.getMarca());
        System.out.println("Modelo: " + calcu1.getModelo());
        System.out.println("Color: " + calcu1.getColor());
        
        System.out.println(" ");
        
        System.out.println("Elija la opcion que desea");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        
        System.out.println("");
        
        int opc = tc.nextInt();
        
        switch(opc){
            case 1: 
                System.out.println("Ingrese un numero");
                float num1 = tc.nextInt();
                System.out.println("Ingrese otro numero");
                float num2 = tc.nextInt();
                // Llamamos a nuestro metodo para sumar
             
                System.out.println("La suma es: "+calcu1.calcularSuma(num1, num2));
                break;
            case 2:
                break;
        }
    }
    
    
}
