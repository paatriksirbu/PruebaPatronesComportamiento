package AlanTuring.HaltChecker;

/**
 * Esta clase implementa la interfaz Handler y define el comportamiento para manejar
 * el caso en el que el código contiene un bucle que cuenta hacia arriba.
 *
 * @author Patrik Paul Sirbu
 */

public class CountUp implements Handler{
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
     * Maneja la solicitud de detención de la ejecución de código. Si el código contiene un bucle que cuenta hacia arriba,
     * devuelve false, lo que significa que el código no se detendrá. Si el código no contiene un bucle que cuenta hacia arriba,
     * pasa la solicitud al siguiente manejador en la cadena de responsabilidad.
     *
     * @param code El código a evaluar.
     * @return false si el código contiene un bucle que cuenta hacia arriba, el resultado del siguiente manejador en caso contrario.
     */

    @Override
    public boolean handleRequest(String code) {
        if(code.contains("CountUp") && code.contains("count++;") && code.contains("++count") && code.contains("while(true)")){
            return false;
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(code);
        }
        return false;
    }

    @Override
    public boolean handle(String code) {
        return false;
    }
}
