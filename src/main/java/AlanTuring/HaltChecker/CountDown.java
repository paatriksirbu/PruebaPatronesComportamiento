package AlanTuring.HaltChecker;

public class CountDown implements Handler{
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

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
