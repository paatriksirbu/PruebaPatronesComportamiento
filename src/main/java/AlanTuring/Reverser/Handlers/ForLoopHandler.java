package AlanTuring.Reverser.Handlers;
import AlanTuring.HaltChecker.Handler;


/**
 * Esta clase abstracta implementa la interfaz Handler y se utiliza para manejar
 * los bucles for en el código proporcionado. Si se detecta un bucle for en el código,
 * el método handle devuelve true. Si no se detecta un bucle for, se delega la responsabilidad
 * al siguiente manejador en la cadena si existe.
 * @autor Patrik Paul Sirbu
 */

public abstract class ForLoopHandler implements Handler{
    private Handler nextHandler;


    /**
     * Establece el siguiente manejador en la cadena de responsabilidad.
     *
     * @param nextHandler El siguiente manejador.
     */

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }


    /**
     * Este método se utiliza para manejar una solicitud específica. En esta implementación,
     * siempre devuelve false.
     *
     * @param code El código a analizar.
     * @return false
     */

    @Override
    public boolean handleRequest(String code) {
        return false;
    }

    /**
     * Este método se utiliza para manejar el código proporcionado. Si se detecta un bucle for
     * en el código, devuelve true. Si no se detecta un bucle for, se delega la responsabilidad
     * al siguiente manejador en la cadena si existe.
     *
     * @param code El código a analizar.
     * @return true si se detecta un bucle for, false en caso contrario.
     */

    @Override
    public boolean handle(String code) {
        if (code.matches(".*for\\s*\\([^;]*;\\s*[^;]+;\\s*[^)]*\\)\\s*\\{.*")) { //Usamos esta expresion para detectar cadenas de texto
                                                                                        //Que contengan la estructura de un bucle for.
            System.out.println("It has been detected a for loop in the code.");
            return true;
        } else if (nextHandler != null) {
            return nextHandler.handle(code);
        } else {
            return false;

        }
    }

}
