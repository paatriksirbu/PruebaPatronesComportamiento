package AlanTuring.HaltChecker;

/**
 * Esta clase contiene la lógica para determinar si un código dado se detendrá o no.
 * Actualmente, solo maneja los casos en los que el código es "CountUp" o "CountDown".
 *
 * @author Patrik Paul Sirbu
 */

public class HaltChecker {

    /**
     * Determina si un código dado se detendrá o no. Si el código es "CountUp", devuelve false.
     * Si el código es "CountDown", devuelve true. En cualquier otro caso, devuelve false.
     *
     * @param code El código a evaluar.
     * @return false si el código es "CountUp", true si el código es "CountDown", false en cualquier otro caso.
     */

    public static boolean willHalt(String code) {
        if(code.equalsIgnoreCase("CountUp")){
            return false;
        } else if (code.equalsIgnoreCase("CountDown")) {
            return true;
        }
        return false;
    }
}
