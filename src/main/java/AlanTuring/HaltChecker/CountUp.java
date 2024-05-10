package AlanTuring.HaltChecker;

public class CountUp implements Handler{
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean handleRequest(String code) {
        if(code.contains("CountUp") && code.contains("count++;") && code.contains("while(true)")){
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
