# Clase String

La clase _String_ está orientada al manejo de cadenas de caractres y pertenece al paquete __java.lang__ del _API_ de Java. Los objetos que son instanciados de la clase _String_ se peuden crear a partir de cadenas constantes tambien llamadas literales, las cuales deben estar contenidas entre comillas dobres. En la clase _String_ se puede asignar cadenas de las dos formas siguientes. 

```java
String cadena = new String("Hola"); // Creación a travéz de constructor
String cadena2 = "Hola"; // Creación a travéz de literal
``` 
El método de creación a travéz de literal es el mas eficiente, porque al encontrar un texto entre comillas se crea automaticamente un objeto de la clase _String
                __Métodos Principales__
| Retorno | Método          | Descripción |
|---------|--------|-------------|
| _void_ | _String()_ | Constructor que inicializa un objeto con una secuencia de caracteres vacía. |
| _void_ | _String(char[] value)_ | Constructor que crea un _String_ inicializa un objeto con una secuencia de caracteres de tipo _char_. 
|_char_ |_charAt(int index)_|Retorna el caractér especificado en la posición _index_ |
|_int_|_compareTo(String anotherString)_|Compara dos cadenas de caracter alfabeticamente. Retorna 0 si son iguales, entero negativo si la primera es menor, entero positivo si la primera es mayor. |
