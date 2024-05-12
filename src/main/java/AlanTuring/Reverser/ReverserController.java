package AlanTuring.Reverser;
import AlanTuring.HaltChecker.Handler;
import AlanTuring.Reverser.Handlers.ForLoopHandler;
import AlanTuring.Reverser.Handlers.InfiniteLoopHandler;

public class ReverserController {

    private ReverserView view;
    private Handler chain;

    public ReverserController(ReverserView view){
        this.view = view;
        initView();
        setUpChain();
    }

    private void initView(){
        view.setVisible(true);
        view.setReverserButtonListener(e -> handleReverser());
        view.setCountUpButtonListener(e -> handleCountUp());
        view.setCountDownButtonListener(e -> handleCountDown());
    }

    private void handleReverser(){
        String code = view.getResult(); //Obtiene el código ingresado por el usuario.
        boolean result = chain.handle(code);
        view.setResult(result ? "The code will halt." : "The code will not halt.");
    }

    private void handleCountUp(){
        view.setResult("Counting up won't stop... Exiting immediately.");   //Muestra el mensaje "Counting up..." en la vista.
    }

    private void handleCountDown(){
        view.setResult("Counting down will stop... Infinite loop"); //Muestra el mensaje "Counting down..." en la vista.
        while(true); //Bucle infinito.
    }

    private void setUpChain() { //Configuracion de la cadena de responsabilidad. (Patron Chain of Responsibility)
        InfiniteLoopHandler loopHandler = new InfiniteLoopHandler() {
            @Override
            public boolean handleRequest(String code) {
                return false;
            }
        };

        ForLoopHandler forHandler = new ForLoopHandler() {
            @Override
            public boolean handleRequest(String code) {
                return false;
            }
        };

        loopHandler.setNextHandler(forHandler);
        this.chain = loopHandler;

    }

}
