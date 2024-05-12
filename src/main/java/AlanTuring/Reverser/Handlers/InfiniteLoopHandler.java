package AlanTuring.Reverser.Handlers;

import AlanTuring.HaltChecker.Handler;

public abstract class InfiniteLoopHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean handleRequest(String code) {
        return false;
    }

    @Override
    public boolean handle(String code) {
        if (code.contains("while(true)")) {
            System.out.println("It has been detected an infinite loop in the code.");
            return true;
        } else {
            return nextHandler.handle(code);
        }

    }

    public boolean handleNext(String code) {
        if (nextHandler != null) {
            return nextHandler.handle(code);
        }
        return false;
    }
}