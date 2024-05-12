package AlanTuring.Programs;

import java.util.Scanner;

public class Menu{

    //Metodo que muestra el menu de opciones para comprobar si funciona el programa.
    public void mostrarMenu(){
        System.out.println("    - Menu-");
        System.out.println("1. Cuenta regresiva");
        System.out.println("2. Cuenta progresiva");
        System.out.println("3. Salir");

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while(opcion != 3){
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    CountDown cd = new CountDown();
                    cd.countDown();
                    System.out.println("\n");
                    break;
                case 2:
                    CountUp cu = new CountUp();
                    cu.countUp();
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
