package AlanTuring.Programs;

/*
    * Esto es una clase simple que cuenta hacia abajo de 5 a 0.
    * Tiene un método llamado countDown que hace la cuenta.
    * El método usa un bucle while para hacer la cuenta.
    *
    * @Author: Patrik Paul Sirbu
 */
public class CountDown {
    public void countDown(){
        int i = 5;
        while(i >= 0){   //Vamos a hacer un loop que hace una cuenta regresiva.
            System.out.println(i);
            i--;
        }
    }

}
