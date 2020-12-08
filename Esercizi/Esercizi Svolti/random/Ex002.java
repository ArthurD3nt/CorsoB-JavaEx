//Scrivere un programma che calcoli il fattoriale di un numero intero
//fornito dall’utente.

import java.util.Scanner;

public class Ex002 {
    public static void main (String[] args) {
        System.out.println("Inserire numero del quale si vuole conoscere il fattoriale");
        //input stuff
        Scanner input = new Scanner(System.in);
        System.out.println("Il fattoriale è " + fact(input.nextInt()));
        input.close();
        
    }

    public static int fact (int n) {
        if (n != 0) {
            return n * fact(n-1);
        } else if (n == 0) {
            return 1;
        } else {
            System.out.println("error");
            return 0;
        }
    }
}

