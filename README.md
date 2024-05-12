# Prueba de patrones de comportamiento. Implementacion del Problema de Parar

##  Halting Problem de Alan Turing

El problema de la parada (halting problem) es un problema de decisión que consiste en determinar, a partir de una descripción de un programa y una entrada inicial, si el programa finalizará su ejecución (se detendrá) o continuará ejecutándose indefinidamente. Alan Turing demostró en 1936 que no existe un algoritmo general que pueda solucionar el problema de la parada para todos los posibles pares de programa-entrada, estableciendo un límite fundamental en lo que es computable.

## Que hemos hecho
Este proyecto incluye el desarrollo de una aplicación destinada a simular un sistema de análisis de programas, específicamente para evaluar si un código concluirá o entrará en un ciclo sin fin. Mediante el uso del patrón de diseño Chain of Responsibility, hemos establecido varios manejadores que examinan estructuras de código como bucles while(true) y for que carecen de condiciones de terminación claras.

También, hemos hecho un analizador de codigo que detecta si un codigo tiene un bucle infinito o no. Para ello, hemos utilizado el patrón de diseño Chain of Responsibility, donde cada manejador se encarga de analizar una estructura de código en particular. En caso de que se detecte un bucle infinito, el manejador correspondiente se encarga de notificar al usuario.

## Como hemos hecho el analizador de codigo
Para el analizador de código, hemos implementado una clase abstracta Handler que define un método abstracto handleRequest() que se encarga de analizar una estructura de código en particular. A partir de esta clase, hemos creado una serie de manejadores concretos, cada uno de los cuales se encarga de analizar una estructura de código específica. Por ejemplo, el manejador InfiniteLoopHandler se encarga de analizar bucles while(true), mientras que el manejador ForLoopHandler se encarga de analizar bucles for.
Para determinar si un código tiene un bucle infinito, hemos utilizado una expresión regular que busca patrones de código específicos. Por ejemplo, la expresión regular del manejador InfiniteLoopHandler busca la cadena "while(true)" en el código fuente, mientras que la expresión regular del manejador ForLoopHandler busca la cadena "for(;;)".

## Que patrones de diseño hemos utilizado y por qué
Hemos utilizado el patrón de diseño Chain of Responsibility para implementar el analizador de código. Este patrón nos permite desacoplar el código que realiza la verificación de bucles infinitos del código que solicita la verificación. Además, nos permite agregar nuevos manejadores sin modificar el código existente, lo que facilita la extensibilidad del sistema.

## Como ejecutar el programa
Para ejecutar el programa, simplemente hay que ejecutar el archivo Main.java en los dos casos (AlanTuring y CodeAnalyzer). A continuación, se le pedirá que introduzca el código fuente que desea analizar. Una vez introducido el código, el programa analizará el código y le informará si se ha detectado un bucle infinito.

## Estructura del proyecto

```
└── src
    ├── main
    │   ├── java
    │   │   ├── CodeAnalyzer
    │   │   │   ├── Analyzer
    │   │   │   │   ├── Analyzer.java
    │   │   │   │   └── Analyzers
    │   │   │   │       ├── CommentHandler.java
    │   │   │   │       ├── ParenthesisHandler.java
    │   │   │   │       ├── ReservedWordHandler.java
    │   │   │   │       ├── StringHandler.java
    │   │   │   │       └── SyntaxHandler.java
    │   │   │   ├── Handler
    │   │   │   │   ├── HandlerClass.java
    │   │   │   │   └── HandlerInterface.java
    │   │   │   └── Main.java
    │   │   └── AlanTuring
    │   │       ├── HaltChecker
    │   │       │   ├── Handlers
    │   │       │   │   ├── Handler.java
    │   │       │   │   ├── InfiniteLoopHandler.java
    │   │       │   │   └── ForLoopHandler.java
    │   │       │   ├── Main.java
    │   │       │   ├── Programs
    │   │       │   │   ├── CountDown.java    
    │   │       │   │   ├── CountUp.java    
    │   │       │   │   ├── Menu.java    
    │   │       │   └── Reverser
    │   │       │       ├── Handlers
    │   │       │       │   ├── ForLoopHandler.java    
    │   │       │       │   ├── InfiniteLoopHandler.java    
    │   │       │       ├── ReverserController.java
    │   │       │       └── ReverserView.java
    │   │       │       └── ReverserLogic.java
    │   │       │       └── ReverserModel.java
    │   │       └── Main.java
    │   └── resources
```

## Que hemos aprendido
Hemos aprendido a implementar el patrón de diseño Chain of Responsibility en un sistema de análisis de código. También hemos aprendido a utilizar expresiones regulares para buscar patrones de código específicos. Además, hemos aprendido a desacoplar el código que realiza la verificación de bucles infinitos del código que solicita la verificación, lo que nos ha permitido extender el sistema de forma sencilla.

## Que hemos mejorado

Hemos mejorado nuestra comprensión de los patrones de diseño y su aplicación en un sistema de análisis de código. También hemos mejorado nuestra habilidad para trabajar con expresiones regulares y buscar patrones de código específicos. Además, hemos mejorado nuestra capacidad para desacoplar el código y facilitar la extensibilidad del sistema.


## Contacto

Patrik Paul Sirbu - https://github.com/paatriksirbu

Mail: patrikpsirbu@gmail.com

Enlace del proyecto: https://github.com/paatriksirbu/PruebaPatronesComportamiento.git