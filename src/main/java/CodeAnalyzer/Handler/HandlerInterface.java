package CodeAnalyzer.Handler;

public interface HandlerInterface {

    void setNext(HandlerInterface nextHandler);
    String handleRequest(String request);
}
