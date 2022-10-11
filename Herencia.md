# Herencia

La _Herencia_ es el concepto que permite que se puedan definir nueva clases basadas en clases existentes. Con el fin de reutilizar el código previamente desarrollado, generando una jerarquía de clases dentro de la aplicación. Entonces si una clase se deriva de otra, está hereda sus atributos y métodos. La clase derivada puede añadir nuevos atributos y métodos y/o definir los atributos y métodos heredados. Para que un atributo y método puedan ser heredados es necesario que su visibilidad sea _"protected"_

En java, a diferencia de otros lenguajes orientados a objetos, una clase, una clase solo puede derivar de una clase única, con la cual, no es posible realizar herencia multiple con base en clases. Sin embargo, es posible _"simular"_ la herencia múltiple con base en las interfases.

Un ejemplo del concepto de herencia puede se considerado, los miembros de una institucion educativa. La institución está compuesta por personas, pero cada uno tiene un rol dentro de la institución, que podría ser de empleado, estudiante o egresado. Así mismo, de empleado se podría derivar la clasificación, académico y administrativo. De académico se puede derivar, decano, coordinador y docente. De administrativo se puede derivar de acuerdo a la cantidad de departamentos de la institución. 


La representación de herencia del caso anteriormente expuesto en lenguaje de modelado es el siguiente:
###### El diagrama esta adjunto en el documento _UML_Herencia_ 

Otro ejemplo del concepto de herencia son las figuras geométricas. Se puede considerar una clase denominada _FigurasGeométricas_, del cual heredan las clases _Cuadrado_, _Triangulo_, y _Rectangulo_.


En este caso, la clase _FigurasGeométricas_, poseería un atributo que pueda ser llamado _valor1_. Este atributo es heredado por las clases _Cuadrado_, _Triangulo_, y _Rectangulo_. Sin embargo, las clases _Rectángulo_ y _Triángulo_ requieren dos valores. Esto indica que deben incluirse como atributos de cada una de estas clases. Por otro lado la clase _FigurasGeométricas_ pueden implementar los métodos consultores y modificadores, los que podrán ser usados por cada una de las clases que la heredan.

Así mismo, de la clase _Cruadado_, es posible   heredar de la clase _Cubo_. De la clase _Triangulo_ es posible heredar la clase _Piramide_ y _Cono_. 

De la clase _Circulo_ es posible heredar la clase _Esfera_ y _Cilindro_. La representación de herencia del caso anteriormente expuesto, en lenguaje de modelado. es la siguiente:

###### El diagrama esta adjunto en el documento _UML_Herencia_2_ 

### Sentencia _Extends_
La sentencia _Extends_ permite implementar el concepto de herencia. Se incluye para que una clase herede de otra clase. Por ejemplo, en el caso de jerarquía de herencia personal académico, debe existir una clase _persona_ y una clase _estudiante_. Al implementar la clase _estudiante_ se le debe incluir la sentencia _extends_ para que herede de la clase _persona_. La sentencia es la siguiente:

```java
public class Persona{
    ...
}
public class Estudiante extends Persona{
    ...
}
```
Una vez incluida la sentencia _extends_, la clase _Estudiante_ tiene acceso a atributos y métodos protegidos de la clase _Persona_.

### Sentencia _Super_ 

La sentencia _"super"_ es utilizada para acceder a métedos implementados en la clase superior en el concepto de herencia. Esta sentencia es comúnmente  utilizada para acceder al constructor de la clase superior desde el constructor de la clase inferior. Por ejemplo, en la clase de jerarquía de herencia personal académico debe existir una clase _persona_ con atributos como identificación, nombre, apellido y correo, y una clase _Estudiante_ que pueda acceder a estos atributos pero  que adicionalmente, tiene atributos como código y facultad. Al implementar un constructor de la clase _Persona_ enviandole los parámetros definidos en dicha clase. La sintaxis es la siguiente: 

```java  
public class Persona{
    protected int id;
    protected String nombre
    protected String apellido
    protected String correo
    public Persona(int id, String nombre, String apellido, String correo){
    this.id=id;
    this.nombre=nombre;
    this.apellido=apellido;
    this.correo=correo;
    }
    }
    public class Estudiante extends Persona{

    private int codigo
    private String facultad
    
    public Estudiante(int id, String nombre, String apellido, String correo, int codigo, String facultad){

    super(id, nombre, apellido, correo); 
    this.codigo=codigo;
    this.facultad=facultad;
    }
}
```
En el ejemplo anterior, el constructor de la clase estudiante, hace un llamado al constructor de la clase persona asignando los valores a los atributos allí definidos. 

### Sobre-Escritura de Métodos
La sobre-escritura de métodos es una característica que se presenta en el concepto de herencia, que consiste en implementar un método de una clase superior e inferior en la jerarquía de herencia. Por ejemplo, considerando la clase _Cuadrado_ y _Cubo_ de la jerarquía de figuras geometricas que se presentan en la imagen __*UML_Herencia_3*__, es posible crear un método _gerArea_, tanto para la clase _Cuadrado_ como para la clase _Cubo_. Entonces, si se crea una referencia de la clase _Cuadrado_, dependiendo de la instancia del objeto que se crea que puede ser de _Cuadrado_ o _Cubo_, se accede al método implementado en _Cuadrado_ o en _Cubo_, respectivamente. 