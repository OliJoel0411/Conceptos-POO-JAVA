# Conceptos-POO-JAVA
# Programacion Orientada a Objetos #
## Paradigma:  ##
Se define como un paradigma que permite realizar una abstracción de la realidad, que se puede implementar en una aplicación se _software_ 
con el fin de resolver problemas mediante el uso de un lenguaje de programación. 
### Paquetes: ###
<<<<<<< HEAD
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
=======
Un __paquete__ es un contenendor de clases.

>>>>>>> ece848957bd87cee3b3ce09d787510c6578effe8
