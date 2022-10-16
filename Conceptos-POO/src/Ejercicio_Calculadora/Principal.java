package Ejercicio_Calculadora;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) { // main
        // Entrada por teclado
        Scanner tc = new Scanner(System.in);

        // Creando la instancia de Calculadora
        Calculadora operaciones = new Calculadora(0,0);


        // Variables globales
        int opc, num1, num2;

        do{

            opc = 0;
            num1 = 0;
            num2 = 0;

            // Menu
            System.out.println("Menu Calculadora");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación ");
            System.out.println("4. División ");
            System.out.println("5. salir");
            opc = tc.nextInt();

            switch (opc){ // switch
                case 1:
                    System.out.println("Bienvenido a suma");
                    System.out.println("Ingese el primer numero");
                    num1 = tc.nextInt();
                    operaciones.setNum1(num1);
                    System.out.println("Ingese el segundo numero");
                    num2 = tc.nextInt();
                    operaciones.setNum2(num2);
                    System.out.println("La suma es: " + operaciones.getSuma(num1,num2));

                    break;
                case 2:
                    System.out.println("Bienvenido a resta");
                    System.out.println("Ingese el primer numero");
                    num1 = tc.nextInt();
                    operaciones.setNum1(num1);
                    System.out.println("Ingese el segundo numero");
                    num2 = tc.nextInt();
                    operaciones.setNum2(num2);
                    System.out.println("La suma es: " + operaciones.getResta(num1,num2));
                    break;
                case 3:
                    System.out.println("Bienvenido a multiplicacion");
                    System.out.println("Ingese el primer numero");
                    num1 = tc.nextInt();
                    operaciones.setNum1(num1);
                    System.out.println("Ingese el segundo numero");
                    num2 = tc.nextInt();
                    operaciones.setNum2(num2);
                    System.out.println("La suma es: " + operaciones.getMult(num1,num2));
                    break;
                case 4:
                    System.out.println("Bienvenido a division");
                    System.out.println("Ingese el primer numero");
                    num1 = tc.nextInt();
                    operaciones.setNum1(num1);
                    System.out.println("Ingese el segundo numero");
                    num2 = tc.nextInt();
                    operaciones.setNum2(num2);
                    System.out.println("La suma es: " + operaciones.getDiv(num1,num2));
                    break;
                case 5:
                    // Close
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error, ingrese una opcion correcta");
            } // switch


        }while(opc != 5); // se ejecuta indifinidamente hasta que se seleccion la opción salir.
    } // main
}
