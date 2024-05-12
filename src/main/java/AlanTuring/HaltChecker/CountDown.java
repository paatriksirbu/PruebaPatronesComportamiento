package AlanTuring.HaltChecker;

/**
 * Esta clase implementa la interfaz Handler y define el comportamiento para manejar
 * el caso en el que el código contiene un bucle que cuenta hacia abajo.
 *
 * @author Patrik Paul Sirbu
 */

public class CountDown implements Handler{
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * Maneja la solicitud de detención de la ejecución de código. Si el código contiene un bucle que cuenta hacia abajo,
     * devuelve true, lo que significa que el código se detendrá. Si el código no contiene un bucle que cuenta hacia abajo,
     * pasa la solicitud al siguiente manejador en la cadena de responsabilidad.
     *
     * @param code El código a evaluar.
     * @return true si el código contiene un bucle que cuenta hacia abajo, el resultado del siguiente manejador en caso contrario.
     */

    @Override
    public boolean handleRequest(String code) {
        if(code.contains("CountDown") && code.contains("count--;") && code.contains("--count") && code.contains("for")){
            return true;    //En el caso de que el codigo sea un CountDown, se retorna true, es decir, el codigo se detiene
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(code);
        }
        return true; //Si no se cumple la condicion, se retorna true, es decir, el codigo se detiene
    }

    @Override
    public boolean handle(String code) {
        return true;
    }
}
