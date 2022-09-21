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

### Atributos ###

Los atributos hacen referencia a las características que se le incluyen a
la clase. Estos atributos pueden ser declaraciones de tipos primitivos
de datos o declaraciones de clases.
### Visibilidad ###
La visibilidad se refiere al nivel de accesibilidad de los atributos y métodos. Los niveles de accesibilidad se dan por los siguientes términos:

1. _Private:_ Se puede acceder desde un método implementado sobre la misma clase. 
2. _Public:_ Se puede acceder desde un método implementado sobre cualquier clase. 
3. _Protected:_ Se puede acceder desde un método implementado en
una clase que herede la clase que contiene esta visibilidad y desde
clases implementadas en el mismo paquete.

### Métodos ###
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



