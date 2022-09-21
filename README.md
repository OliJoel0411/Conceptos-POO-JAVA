# Conceptos-POO-JAVA
# Programacion Orientada a Objetos #
## Paradigma:  ##
Se define como un paradigma que permite realizar una abstracción de la realidad, que se puede implementar en una aplicación se _software_ 
con el fin de resolver problemas mediante el uso de un lenguaje de programación. 
### Paquetes: ###

Un __paquete__ es un contenendor de clases. Se utiliza para ordenar el código de forma consistente de acuerdo a los servicios implementados.

` Package MiPaquete;`

En donde *__"MiPaquete"__* es el nombre del paquete que contendra el codigo. Por lo tanto, si se desea hacer uso de servicios implementados en otros paquetes se debe agregar el siguiente código:

`import OtroPaquete;`

Java contiene una gran cantidad de paquetes que proveen una gran
cantidad de servicios. Algunos de estos paquetes se presentan en la Tabla: 

| __Paquete__ | __Descripción__   |
|-------------|--------------------|
|pendiete de actualizar

### Clases ###
Una clase se define como un tipo abastracto de dato que contiente  _Atributos_  y _Métodos_. Atravéz de una clase se implemente un concepto abstraído de la realidad. En este caso, los atributos hacen referencia a las caracteristicas del concepto abstraído y los métodos hacen referencia a los servicios de dicho concepto. 

La sintaxis de la clase debe ser la siguiente:

```java
public class MiClase{
    //Definición de atributos
    //Definición de métodos
}
```
En Java se debe seguir una buena práctica que consiste en implementar
cada clase en un archivo independiente con extensión .java. Para el
ejemplo anterior, el archivo debe denominarse __MiClase.java.__

#### Atributos ####

Los atributos hacen referencia a las características que se le incluyen a
la clase. Estos atributos pueden ser declaraciones de tipos primitivos
de datos o declaraciones de clases.
#### Visibilidad ####
La visibilidad se refiere al nivel de accesibilidad de los atributos y métodos. Los niveles de accesibilidad se dan por los siguientes términos:

1. _Private:_ Se puede acceder desde un método implementado sobre la misma clase. 
2. _Public:_ Se puede acceder desde un método implementado sobre cualquier clase. 
3. _Protected:_ Se puede acceder desde un método implementado en
una clase que herede la clase que contiene esta visibilidad y desde
clases implementadas en el mismo paquete.

#### Métodos ####
Los métodos hacen referencia a los servicios que se le incluyen a la clase. En estos métodos se implemente el código necesario del servicio. Un método contiene los siguientes elementos. 

1. __Visibilidad:__ Se debe establecer si el método es _Private,_ _Public,_ o _Protected._
2. __Retorno:__ Un método puede retornar información. Si el método no retorna información se debe colocar la palabra " _Void_ ". El retorno puede ser de tipo primitivo o de una clase. Si un método tiene retorno, en la implementación del método, debe estar presente la palabra reservada `return`.
3. __Nombre:__ Identificador del método en la clase. 
4. __Parametros:__ Un método puede recibir de _0_ a _n_ parámetros. Un parámetro puede ser un tipo primitivo de dato o la declaración de una clase. Los parámetros pueden estar separados por comas. 

Cada metodo implementa un código que debe estar contendio entre `{}`, la sintáxis de los métodos es la siguiente. 

```java
    // método publico sin retorno y sin parámetros
    public void miMetodo(){
        instruccion 1;
        instruccion 2;
        ...
        instruccion n;
    }

    // méotdo privado con retorno int y sin parametros
    private int miMetodo(){
        instruccion 1;
        instruccion 2;
        ...
        instruccion n;

        return valor int;
    }

    // método privado con retorno int y con parametros 
    private int miMetodo(int parametro1, boolean parametro2, miClase parametro3){
        instruccion 1;
        instruccion 2;
        ...
        instruccion n;

        return valor int;
    }
```
#### Encapsulamiento ####

Es una característica que indica que los atributos que definen propiedades propias de la clase deben tener visibilidad private. De esta forma se ofrece seguridad a la informacion depósitada en dichos atributos. 

#### Apuntador _This_ ####

El apuntador " _This_ " permite acceder a los atributos y metodos de la clase. El uso del apuntador no es obligatorio, pero se recomienda usarlo como buena práctica. Es posible que el parámetro de un método tenga el mismo nombre que un atributo. En este caso el uso del apuntador _This_ es obligatorio para que el compilador identifique si esta haciendo referencia al atributo o al parámetro del método. 

### Objeto ###

Es la referencia o instancia de una clase. Al crear una referencia se asigna un espacio de memoria dinámica al objeto, pero no es utilizable. Al crear la instancia, el objeto es utilizable. La sintaxis de la referencia es la siguiente: 

```java
    miClase m;
```
donde _m_ es la referencia del objeto. La sintáxis de la instancia es la siguiente:

```java
    m = new miClase();
```
Al hacer la instancia se puede acceder a los atributos y métodos públicos y protegídos si aplica, a travéz del objeto _m._ Otro sintáxis para realizar referencia e instancia en la misma linea es la siguiente:

```java
miClase m = new miClase();
```
### Sentencia _Static_ ###

una clase puede tener atributos y/o métodos propios o no del objeto.
La sentencia _static_ define los atributos y métodos de tal forma que puedan ser accedidos sin requerir una instancia de la clase. Por otro lado, un atributo _static_ toma el mismo valor para todos los objetos que sean instancia de la clase que lo contiene. Por ejemplo, la clase _Math_  contiene el metodo " _sin_ " el cual calcula el _seno_ de un parametro dato. 

##### Ejemplo 
```java
    public class MiClase(){
        public static int valor;
        
        public static long factorial(long n){
            long fact = 1;
            for(int i = 1; i<n ; i++){
                fact*=1;
            }
            return fact;
        }
    }
```
En donde se puede hacer uso del método factorial de la siguiente forma:

```java
long valor = MiClase.factorial(5);
```
También permite hacer uso del atributo _Mi Valor_ de la siguiente forma:

```java
MiClase c1 = new MiClase();
c1.miValor = 10;
MiClase c2 = new MiClase();
MiClase c3 = new MiClase();
```
En el código anterior el atributo _miValor_ tendra el valor de _10_ para los objetos _c1, c2, c3_ Solo con asginarlo en un objeto de ellos, que para el caso es __c1__ 

### Sentencia Final ###
Una clase puede tener atributos finales que hacen referencia a constantes que no pueden cambiar su valor en tiempo de ejecución de la aplicación. la sintáxis es la siguiente:
```java
Public class MiClase(){
    public final static int uno = 1;
    public final static int dos = 2;
}
```
Por ejemplo el atributo “PI” cuyo valor se encuentra implementado
en la clase del API de Java Math, puede ser accedido sin requerir
instancia de la clase Math y su valor es constante.
