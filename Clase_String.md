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