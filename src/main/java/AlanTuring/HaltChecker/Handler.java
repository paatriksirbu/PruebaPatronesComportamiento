package AlanTuring.HaltChecker;

/**
 * Esta interfaz define los métodos que deben ser implementados por las clases que manejan
 * la lógica de detención de la ejecución de código.
 *
 * @author Patrik Paul Sirbu
 */

public interface Handler {
    void setNextHandler(Handler nextHandler);
    boolean handleRequest(String code);
    boolean handle(String code);
}
