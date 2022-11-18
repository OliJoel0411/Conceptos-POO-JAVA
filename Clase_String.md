# Clase String

La clase _String_ está orientada al manejo de cadenas de caractres y pertenece al paquete __java.lang__ del _API_ de Java. Los objetos que son instanciados de la clase _String_ se peuden crear a partir de cadenas constantes tambien llamadas literales, las cuales deben estar contenidas entre comillas dobles. En la clase _String_ se puede asignar cadenas de las dos formas siguientes. 

```java
String cadena = new String("Hola"); // Creación a travéz de constructor
String cadena2 = "Hola"; // Creación a travéz de literal
``` 
El método de creación a travéz de literal es el mas eficiente, porque al encontrar un texto entre comillas se crea automaticamente un objeto de la clase _String_.

__Métodos Principales__

| Retorno | Método          | Descripción |
|---------|--------|-------------|
| _void_ | _String()_ | Constructor que inicializa un objeto con una secuencia de caracteres vacía. |
| _void_ | _String(char[] value)_ | Constructor que crea un _String_ inicializa un objeto con una secuencia de caracteres de tipo _char_. 
|_char_ |_charAt(int index)_|Retorna el caractér especificado en la posición _index_ |
|_int_|_compareTo(String anotherString)_|Compara dos cadenas de caracter alfabeticamente. Retorna 0 si son iguales, entero negativo si la primera es menor, entero positivo si la primera es mayor. |
| String | concat(String str) | Concatena la cadena del parametro al final de la primera cadena |
| boolean | contains(CharSequence s) | Retorna _true_ si la cadena contiene la secuencia tipo _char_ del parametro |
| boolean | endsWith(String suffix) | Retorna verdadero si el final de la cadena es igual a sufijo del parametro |
| boolean | equals(Objet anObject) | Retorna verdadero si la cadena es igual al objeto del paramatro |
| int | indexOf(String str) | Retorna el índice de la primera ocurrencia de la cadena del parámetro |
| boolean | isEmpty() | Retorna verdadero si la longitud de la cadena es 0 |
| int | length() | Retorna la longitud de la cadena |
| String | replace(char oldChar, char newChar) | Retorna una nueva cadena reemplanzando los caracteres del primer parámetro con el caracter del segundo parámetro |
| String[] | split(String regex) | Retorna un conjunto de cadenas separadas por la cadena del parametro |
| boolean | startsWith(String prefix) | Retorna verdadero si el comienzo de la cadena es igual al prefijo del parametro |
| String | substring(int beginIndex) | Retorna la subcadena desde el caracter del parametro |
| String | substring(int beginIndex, int endIndex) | Retorna la subcadena desde el caractér del primer parámetro hasta el caractér del segundo parametro |
| char[] | toCharArray() | Retorna el conjunto de caracteres de la cadena |
|String | toLowerCase() | Retorna la cadena en minúsculas |
| String | toUpperCase() | Retorna la cadena en mayúsculas |
| static String | valueOf(char[] data) | Convierte en cadena el conjunto de caracteres del parámetro |
| static String | valueOf(double d) | Convierte en cadena el dato del parámetro |
| static String | valueOf(float f) | Convierte en cadena el dato del parámetro |
| static String | valueOf(int i) | Convierte en cadena el dato del parámetro |
| static String | valueOf(long l) | Convierte en cadena el dato del parámetro |
| static String | valueOf(Object obj) | Convierte en cadena el dato del parámetro |

```java 
// Ejemplo de uso del método length y charAt

public class EjemplosString {
    public static void main(String[] args) {
        String cadena=”Hola Mundo”;
        char caracter;
        System.out.println(“La cadena tiene“+cadena.length()+ ”caracteres”);
        for(int i=0; i<cadena.length(); i++){
                caracter=cadena.charAt(i);
                System.out.println(“El caracter en la posición “+ i +” es: “+caracter);
            }
        }
}
```

```java
// Ejemplo del uso del método de concat

public class EjemplosString{
    public static void main(String[] args){
        String cadena1 = "Hola";
        String cadena2 = "Mundo";
        System.out.println("La cadena uno es: " + cadena1 );
        System.out.println("La cadena dos es: " + cadena2);
        System.out.println("El texto concatenado es: " + cadena1.concat(cadena2)); 
    }
}

```

```java
// Ejemplo del uso del método replace

public class EjemplosStrings{
    public static void main(String [] args){
        String cadena=”Este es el texto original”;
        System.out.println(“La cadena es: “+cadena);
        System.out.println("LA cadena modificada es: " + cadena.replace('e', '?'));
    }
}

```

```java 
// Ejemplo de uso del método Split

public class EjemploStrings{
    public static void main(String [] args){
        String cadena=”Hola planeta tierra”;
        String cadenas[]=cadena.split(“ “);
        for(int i=0; i<cadenas.length; i++){
            System.out.println(“La cadena “+i+” es: “+cadenas[i]);
            }
    }
}
```

```java
//Ejemplo de uso del método subString
public class EjemploStrings{
    public static void main(String [] args){
        String cadena=”Hola planeta tierra”;
        System.out.println(“La cadena es: “+cadena);
        System.out.println(“La sub cadena del caracter 2 al 10 es:“+cadena.substring(2, 10));
    }
}
```