package AlanTuring.Reverser;

import java.util.Random;

public class ReverserLogic {

    public static boolean willHalt(){
        return true; // Simulamos que siempre va a terminar y no se va a quedar en un bucle infinito.
    }

    public static boolean simulateHaltingProblem(){
        Random rndm = new Random();
        int rndmNum = rndm.nextInt();
        return rndmNum % 2 == 0;
    }

    public static boolean simulateNonHaltingProblem(){
        return false;
    }

}
