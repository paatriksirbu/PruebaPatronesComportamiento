package AlanTuring.Reverser;
import AlanTuring.HaltChecker.Handler;
import AlanTuring.Reverser.Handlers.ForLoopHandler;
import AlanTuring.Reverser.Handlers.InfiniteLoopHandler;

/**
 * Esta clase contiene el controlador de la aplicación. Maneja las interacciones entre la vista y el modelo.
 *
 * @author Patrik Paul Sirbu
 */
public class ReverserController {

    private ReverserView view;
    private Handler chain;
    private boolean continueLoop = true;

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
        view.setStopButtonListener(e -> stopLoop());
    }

    private void handleReverser(){
        String code = view.getCodeInput(); //Obtiene el código ingresado por el usuario.
        boolean result = chain.handle(code);
        view.setResult(result ? "The code will halt." : "The code will not halt.");
    }

    private void handleCountUp(){
        view.setResult("Counting up won't stop... Exiting immediately.");   //Muestra el mensaje "Counting up..." en la vista.
    }

    private void handleCountDown(){
        view.setResult("Counting down will stop... Infinite loop"); //Muestra el mensaje "Counting down..." en la vista.
        new Thread(() -> {
            while(continueLoop){
                System.out.println("Counting down...");
            }
        }).start();

    }

    private void setUpChain() { //Configuracion de la cadena de responsabilidad. (Patron Chain of Responsibility)
        InfiniteLoopHandler loopHandler = new InfiniteLoopHandler() {
            @Override
            public boolean handleRequest(String code) {
                return code.contains("while(true)");
            }
        };

        ForLoopHandler forHandler = new ForLoopHandler() {
            @Override
            public boolean handleRequest(String code) {
                return code.contains("for(");
            }
        };

        loopHandler.setNextHandler(forHandler); //Enlazamos los manejadores de bucles infinitos e iniciamos la cadena en el primer manejador.
        this.chain = loopHandler;

    }


    private void stopLoop(){
        continueLoop = false;
    }



}
