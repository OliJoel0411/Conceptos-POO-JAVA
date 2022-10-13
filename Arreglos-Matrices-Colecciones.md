# Arreglo, Matrices y Colecciones

En cualquier lenduaje de programación es posible construir estructuras que almacenen conjuntos de datos. Estas estructuras pueden tener una o mas dimensiones. Las estructuras con una dimensión se denominan _arreglos_, y las estructuras con dos dimensiones se denominan _matríces_. Hay casos particulares en el que se requiere el uso de mas de dos dimensiones, en ese caso, se denominan _arrglos multidimensionales_. Java además incluye en su _API_ clases que proveen servicios para almacenamiento de objetos denominados _colecciones_.

## Arreglos

Un arreglo es una estructura que posee un conjunto de datos del mismo tipo. Los arreglos en java son objetos pero sus elementos pueden ser tipos primitivos de datos o clases.

Un arrelo tiene las siguientes características:

* __Nombre:__ El nombre identifica al arreglo y a travéz de este, se accede al arreglo para su lectura y escritura de información.

```java
int [] miArreglo;
```

* Insancia con el operador __"new"__ que permite la asignación del tamaño de arreglo.

```java
miArreglo = new int[20];
```

* Es posible realizar los procedimientos anteriores en una sola línea de código.

```java
int [] miArreglo = new int[20];
```

* Se accede a los elementos del arreglo a travéz de corchetes __"[ ]"__ indicando la posición del elemento al cual se desea acceder. La posición del elemento es denominada ___índice___. El _índice_ inicia en cero "0" y finaliza en _n-1_ donde _n_ es la cantidad de elementos del arreglo.

|__índice__| 0| 1 | 2 | 3 | 4 | 5 | 6 | ...n |
|----------|--|---|---|---|---|---|---|------|
|__elemento__| 5 | 9 | 45 | 23 | 0 | 9 | 87 | ... |

Accediendo al elemento con el índice 4.

```java
miArreglo[4] = 0;
```

* Los elementos del arreglo se inicializan con el valor por defecto del dato.

* Los elementos se pueden inicializar por valores dentro de __"{ }"__ separados por comas.

```java
String dias[] = {“lunes”, “martes”, “miércoles”, “jueves”,
“viernes”, “sábado”, “domingo”};
```

|__índice__| 0| 1 | 2 | 3 | 4 | 5 | 6 |
|----------|--|---|---|---|---|---|---|------|
|__elemento__| "lunes" | "martes" | "miercoles" | "jueves" | "viernes" | "sabado" | "domingo" |


### Ejemplo Práctico con arreglos

Calcular el promedio de los elementos de un arreglo: Para calcular el promedio en un arreglo, basta con hacer la sumatoria
de números del arreglo y dividir en el número de elementos.

Su implementación es la siguiente:

```java
// Importamos la libreria para recibir la entrada por teclado
import java.util.Scanner;
// Declaración de la clase
public class EjemplosArreglos {
    // Declaración del método main
    public static void main(String[] args){
        // Objeto Scanner
        Scanner s = new Scanner(System.in);
        double promedio;
        double sumatoria=0;
        // El usuario decide el número de elementos
        int tamano=10;
        // Declaramos nuestro arreglo
        double []arreglo = new double[tamano];

        // Llenamos nuestro elemento 
        for(int i=0; i<tamano; i++){
        arreglo[i]=s.nextInt();
        }
        // Imprimimos en pantalla los datos de nuestro arreglo
        System.out.println(“El arreglo original es:”);

        for(int i=0; i<tamano; i++){
        System.out.println(arreglo[i]);
        }

        // hacemos la sumatoria
        for(int i=0; i<tamano; i++){
        sumatoria+=arreglo[i];
        }

        // Calculamos el promedio
        promedio = sumatoria / tamano;
        // Imprimimos en pantalla nuestro resultado 
        System.out.println(“El promedio es:”+promedio);

    }
}
```

Salida: 

| Salida Estándar|
| --------------- |
| El arreglo original es: |
| 25.0|
| 6.0 |
| 8.0 |
| 50.0 |
| El promedio es: 22.25 |

