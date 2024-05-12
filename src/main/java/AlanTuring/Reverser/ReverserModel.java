package AlanTuring.Reverser;

/**
 * Esta clase contiene el modelo de la aplicación. Proporciona métodos para simular
 * diferentes operaciones como contar hacia arriba, contar hacia abajo y revertir.
 *
 * @author Patrik Paul Sirbu
 */
public class ReverserModel {
    public String simulateCountUp(){    //Loop infinito
        return "Counting up...";
    }

    public String simulateCountDown(){  //Simula un loop regresivo que terminara al llegar a 0.
        return "Counting down...";
    }

    public String simulateReverser(){ //Simula la funcion del reverser(Hacer lo contrario de lo que se le pide)
        return "Reversing...";
    }
}
