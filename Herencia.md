# Herencia

La _Herencia_ es el concepto que permite que se puedan definir nueva clases basadas en clases existentes. Con el fin de reutilizar el código previamente desarrollado, generando una jerarquía de clases dentro de la aplicación. Entonces si una clase se deriva de otra, está hereda sus atributos y métodos. La clase derivada puede añadir nuevos atributos y métodos y/o definir los atributos y métodos heredados. Para que un atributo y método puedan ser heredados es necesario que su visibilidad sea _"protected"_

En java, a diferencia de otros lenguajes orientados a objetos, una clase, una clase solo puede derivar de una clase única, con la cual, no es posible realizar herencia multiple con base en clases. Sin embargo, es posible _"simular"_ la herencia múltiple con base en las interfases.

Un ejemplo del concepto de herencia puede se considerado, los miembros de una institucion educativa. La institución está compuesta por personas, pero cada uno tiene un rol dentro de la institución, que podría ser de empleado, estudiante o egresado. Así mismo, de empleado se podría derivar la clasificación, académico y administrativo. De académico se puede derivar, decano, coordinador y docente. De administrativo se puede derivar de acuerdo a la cantidad de departamentos de la institución. 


La representación de herencia del caso anteriormente expuesto en lenguaje de modelado es el siguiente:
###### El diagrama esta adjunto en el documento _UML_Herencia_ 

Otro ejemplo del concepto de herencia son las figuras geométricas. Se puede considerar una clase denominada _FigurasGeométricas_, del cual heredan las clases _Cuadrado_, _Triangulo_, y _Rectangulo_.