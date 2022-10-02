# Entrada y Salida Estándar
Toda aplicación requiere información de entrada para realizar las operaciones que cada proceso resuelve, así como requiere mecanismos de salida para entregar los resultados. La forma de representar estas entradas y salidas en Java es con base en _"Streams"_ que son flujos de datos. Un _"Streams"_ se comporta como un medio de comunicacion entre el programa y la fuente o destino de los datos. La informacion se transporta en serie a travéz de este medio. 

## Clase _System_
En Java la entrada desde el teclado y la salida en pantalla se utiliza a través de la clase _System_. Esta clase pertenece al paquete __java.lang__ y posee atributos y métodos que se relacionan directamente con el sistema local. 
|__Tipo__| __Atributo__ | __Descripción__|
|--------|--------------|----------------|
|_static inputStream_| _in_ |Objeto preparado para recibir datos desde la entrada estándar del sistema que generalmente es el teclado.| 
| _static PrintStream_ | _out_ | Objeto preparado para imprimir los datos de la salida estándar del sistema que generalmente es la pantalla |
| _static PrintStream_  | _err_ | Obejto utilizado para mostrar mensajes de error presentados por defecto en la pantalla |

## Clase _InputStream_

La clase _InputStream_ es necesaria para realizar la lectura de información por entrada estándar. Esta clase pertene al paquete __java.io__ 

| Retorno | Método | Descripción |
|---------|--------|-------------|
| _int_ | _available()_ | Retorna el número estimado de bytes que pueden ser leidos por el _InputStream Constructor_ que inicializa el _BigInteger_ con el valor de la cadena de caractéres del parametro |
