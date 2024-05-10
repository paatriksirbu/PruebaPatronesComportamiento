package AlanTuring.HaltChecker;

public class HaltChecker {

    public static boolean willHalt(String code) {
        if(code.equalsIgnoreCase("CountUp")){
            return false;
        } else if (code.equalsIgnoreCase("CountDown")) {
            return true;
        }
        return false;
    }
}
