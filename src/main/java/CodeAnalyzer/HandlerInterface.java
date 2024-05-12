package CodeAnalyzer;

public interface HandlerInterface {

    void setNext(HandlerInterface nextHandler);
    void handleRequest(String request);
}
