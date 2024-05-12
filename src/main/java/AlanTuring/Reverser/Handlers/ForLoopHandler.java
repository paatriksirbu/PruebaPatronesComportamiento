package AlanTuring.Reverser.Handlers;
import AlanTuring.HaltChecker.Handler;

public class ForLoopHandler implements Handler{
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
        if (code.matches(".*for\\s*\\([^;]*;\\s*[^;]+;\\s*[^)]*\\)\\s*\\{.*")) { //Usamos esta expresion para detectar cadenas de texto
                                                                                        //Que contengan la estructura de un bucle for.
            System.out.println("It has been detected a for loop in the code.");
            return true;
        } else {
            return nextHandler.handle(code);
        }
    }
}
