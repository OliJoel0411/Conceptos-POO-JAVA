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

### Clasificación de Métodos 

Los metodos se pueden clasificar en 4 tipos que son los siguientes:
1. __Constructores:__ Un constructor es el primer método que se ejecuta al realizar la instancia del objeto. Uno de los usos principales del constructor es la inicialización de los atributos de la clase. El método constructor debe tener visibilidad pública y no posee retorno. La sintaxis es la siguiente:

```java
public class miClase{
    // Definición de atributos
    private int atributo1;
    private int atributo2;

    // Definicion de método constructor
    public miClase(){
        this.atributo1 = 0;
        this.atributo2 = 0;
    }
}
```
2. __Consultores:__ Un consultor es el método que permite retornar el valor de un atributo con visibilidad _private_ al aplicar el concepto de encapsulamiento. La sintaxis es la siguiente:
```java
public class miClase{
    //Difinición de atributos
    private atributo1;
    private atributo2;

    //Método constructor
    public miClase(){
        this.atributo1 = 0;
        this.atributo2 = 0;
    }

    //Método consultor
    public int getAtributo1(){
        return this.atributo1;
    }
    public int getAtributo2(){
        return this.atributo2;
    }
}
```
3. __Modificadores:__ Un modificador es el método que permite asignar valor a un atributo con visibilidad _private_ al aplicar el concepto de encapsulamiento. La sintáxis es la siguiente:
```java
public class miClase{
    //Difinición de atributos
    private atributo1;
    private atributo2;

    //Método constructor
    public miClase(){
        this.atributo1 = 0;
        this.atributo2 = 0;
    }

    //Método consultor
    public int getAtributo1(){
        return this.atributo1;
    }

    //Método consultor
    public int getAtributo2(){
        return this.atributo2;
    }

    //Método modificador
    public void setAtributo1(int atributo1){
        this.atributo1 = atributo1;
    } 

    //Método modificador
    public void setAtributo2(int atributo2){
        this.atributo2 = atributo2;
    }
}
```
4. __Analizadores:__ Un analizador es el método que permite implementar la lógica del servicio del mismo, es decir; allí se implementan los algoritmos requeridos. La sintaxis es la siguiente:
   
```java

public class miClase{
    //Difinición de atributos
    private atributo1;
    private atributo2;

    //Método constructor
    public miClase(){
        this.atributo1 = 0;
        this.atributo2 = 0;
    }

    //Método consultor
    public int getAtributo1(){
        return this.atributo1;
    }

    //Método consultor
    public int getAtributo2(){
        return this.atributo2;
    }

    //Método modificador
    public void setAtributo1(int atributo1){
        this.atributo1 = atributo1;
    } 

    //Método modificador
    public void setAtributo2(int atributo2){
        this.atributo2 = atributo2;
    }

    //Método analizador 
    public int calcularMayor(){
        if(this.atributo1 > this.atributo2){
            return this.atributo1;
        }else {
            return this.atributo2;
        }
    }
}
```
### Sobrecarga de Métodos

La sobrecarga de métodos es una característica que perminten que varios métodos en un misma clase tenga el mismo nombre. La forma en que el compilador identifica cuál es el método a utilizar en tiempo de ejecución, se debe a que estos deben poseer diferentes parámetros y/o retorno. La diferencia puede estar en el número de parámetros y/o tipo de los mismos. Por ejemplo se plantean los siguientes métodos sobrecargados.

```java
//Método sobrecargado 1. Sin parámetro y sin retorno.
public void miMetodo(){
}
//Método sobrecargado 2. Con parámetro y con retorno int.
public int miMetodo(int parametro1){
}
//Método sobrecargado 3. Con parámetros y con retorno boolean.
public boolean miMetodo(int parametro1, int parametro2){
}
//Método sobrecargado 4. Con parámetros diferentes a la
sobrecarga 3 y con retorno boolean.
public boolean miMetodo(int parametro1, long parametro2){
}
```
### Recursividad
La recursividad es la características en la programación que permite hacer un llamado a un método desde el mismo método. Esta característica simplifica el desarrollo. Cada llamado recursivo equivale a una iteración en una estructua de repetición como el _"while"_ o el _"for"_. Tiene una ventaja de utilizar casi los mismos recursos que un proceso iterativo regular. Por otro lado existen algoritmos que necesariamente deben ser implementados de forma recursiva como algoritmos fractales  y árboles. 

Para aplicar el concepto de recursividad, el método debe necesariamente retornar un valor, recibir por parametros al menos un valor, implementar una condición de ruptura del proceso recursivo e implementar una función recursiva. 

Por ejemplo si se desea implementar el algoritmo del factorial se podría implementar el siguiente método a resolver el algoritmo.

```java
public long factorial(long n) {
long fact=1;
for(int i=1; i<n; i++){
fact *= i;
}
return fact;
}
```