package CodeAnalyzer.Handler;

/**
 * La interfaz HandlerInterface define los métodos que deben implementar
 * los manejadores en la cadena de responsabilidad del análisis de código.
 * @author Patrik Paul Sirbu
 */


public interface HandlerInterface {

    /**
     * Establece el siguiente manejador en la cadena de responsabilidad.
     *
     * @param nextHandler el siguiente manejador.
     */

    void setNext(HandlerInterface nextHandler);

    /**
     * Maneja la solicitud de análisis de código.
     *
     * @param request el código a analizar.
     * @return el resultado del análisis de código.
     */

    String handleRequest(String request);
}
