package CodeAnalyzer;

public interface HandlerInterface {

    void setNext(HandlerInterface nextHandler);
    String handleRequest(String request);
}
