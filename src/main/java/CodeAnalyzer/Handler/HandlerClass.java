package CodeAnalyzer.Handler;

public class HandlerClass implements HandlerInterface{

    private HandlerInterface nextHandler;

    @Override
    public void setNext(HandlerInterface handler) {
        this.nextHandler = handler;
    }

    @Override
    public String handleRequest(String request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
        return "Code without any issues detected.";
    }
}
