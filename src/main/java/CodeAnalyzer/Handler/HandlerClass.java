package CodeAnalyzer.Handler;

/**
 * La clase HandlerClass implementa la interfaz HandlerInterface y sirve como
 * la clase base para los manejadores en la cadena de responsabilidad del análisis de código.
 * @author Patrik Paul Sirbu
 */

public class HandlerClass implements HandlerInterface{

    private HandlerInterface nextHandler;

    /**
     * Establece el siguiente manejador en la cadena de responsabilidad.
     *
     * @param handler el siguiente manejador.
     */

    @Override
    public void setNext(HandlerInterface handler) {
        this.nextHandler = handler;
    }

    /**
     * Maneja la solicitud de análisis de código.
     * Si hay un siguiente manejador en la cadena, pasa la solicitud a ese manejador.
     *
     * @param request el código a analizar.
     * @return el resultado del análisis de código.
     */

    @Override
    public String handleRequest(String request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
        return "Code without any issues detected.";
    }
}
