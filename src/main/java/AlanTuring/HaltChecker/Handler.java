package AlanTuring.HaltChecker;

public interface Handler {
    void setNextHandler(Handler nextHandler);
    boolean handleRequest(String code);
    boolean handle(String code);
}
