package AlanTuring.Programs;

public class CountDown {
    public void countDown(){
        int i = 5;
        while(i >= 0){   //Vamos a hacer un loop que imprime los valores de i desde 5 hasta 0, es decir, hace una cuenta regresiva.
            System.out.println(i);
            i--;
        }
    }
}