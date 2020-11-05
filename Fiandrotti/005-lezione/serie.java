//Funzionano tutte le serie tranne la quinta oerchü il range di default è troppo grande

import java.util.Scanner;

public class serie {
    public static void serie_1() {

        //user input + variables
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il valore di n:");
        double n = input.nextInt();
        System.out.println("Inserire il valore di q:");
        double q = input.nextInt();
        input.close();
        double sx = 0;
        int k = 0;
        
        //calcolo sx
        while (k <= n) {
            double potenza = Math.pow(q, k);
            sx = sx + potenza;
            k ++; 
        }

        //calcolo espressione a dx
        double dx = (1-(Math.pow(q, (n+1))))/(1-q);

        //truncation
        dx = Math.floor(dx * 100) / 100;
        sx = Math.floor(sx * 100) / 100;

        //controllo se l'uguaglianza è verficata
        if (dx == sx) {
            System.out.println("L'uguaglianza è verificata");
        } else {
            System.out.println("L'uguaglianza NON è verificata");
        }
    }

    public static void serie_2() {

        //user input
        Scanner input = new Scanner(System.in);
        input.close();

        //variables
        double k = 1;
        double sx = 0;
        double qk = 0;

        //espressione a destra
        double dx = (Math.PI*Math.PI)/6;

        //sommatoria a sinistra
        while (k <= 9999){
            qk = (1/(k*k));
            sx = sx + qk;
            k++;
        }

        //truncation
        dx = Math.floor(dx * 100) / 100;
        sx = Math.floor(sx * 100) / 100;

        if (sx == dx) {
            System.out.println("L'uguaglianza è verificata");
        } else {
            System.out.println("L'uguaglianza NON è verificata");
            System.out.println("La sommatoria è pari a: " + sx);
            System.out.println("L'espressione a destra è uguale a: " + dx);
            
        }

    }

    public static void serie_3() {

        //user input
        Scanner input = new Scanner(System.in);
        input.close();

        //variables
        double k = 0;
        double sx = 0;
        double qk = 0;

        //espressione a destra
        double dx = (Math.PI*Math.PI)/8;

        //sommatoria a sinistra
        while (k <= 9999){
            qk = (1/(((2*k)+1)*((2*k)+1)));
            sx = sx + qk;
            k++;
        }

        //truncation
        dx = Math.floor(dx * 100) / 100;
        sx = Math.floor(sx * 100) / 100;

        if (sx == dx) {
            System.out.println("L'uguaglianza è verificata");
        } else {
            System.out.println("L'uguaglianza NON è verificata");
            System.out.println("La sommatoria è pari a: " + sx);
            System.out.println("L'espressione a destra è uguale a: " + dx);
            
        }
        
    }

    public static void serie_4() {

        //user input
        Scanner input = new Scanner(System.in);
        input.close();

        //variables
        double k = 0;
        double sx = 0;
        double qk = 0;

        //espressione a destra
        double dx = (Math.PI/4);

        //sommatoria a sinistra
        while (k <= 9999){
            qk = ((Math.pow(-1, k))/((2*k)+1));
            sx = sx + qk;
            k++;
        }

        //truncation
        dx = Math.floor(dx * 100) / 100;
        sx = Math.floor(sx * 100) / 100;

        if (sx == dx) {
            System.out.println("L'uguaglianza è verificata");
        } else {
            System.out.println("L'uguaglianza NON è verificata");
            System.out.println("La sommatoria è pari a: " + sx);
            System.out.println("L'espressione a destra è uguale a: " + dx);
        }
                       
    }

    public static void serie_5() {

        //user input + variables
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il valore di z:");
        double z = input.nextDouble();
        System.out.println("Inserire il valore di e:");
        double e = input.nextDouble();
        input.close();
        int k = 0;
        double qk = 0;
        double sx = 0;

        //espressione a dx
        double dx = Math.pow(e, z);

        //sommatoria a sinistra
        while (k <= 9999){
            qk = (Math.pow(z, k))/k;
            sx = sx + qk;
            k++;
        }
        
        //truncation
        dx = Math.floor(dx * 100) / 100;
        sx = Math.floor(sx * 100) / 100;

        if (sx == dx) {
            System.out.println("L'uguaglianza è verificata");
        } else {
            System.out.println("L'uguaglianza NON è verificata");
            System.out.println("La sommatoria è pari a: " + sx);
            System.out.println("L'espressione a destra è uguale a: " + dx);
        }
                    
    }

    public static void main(String[] args) {
       
        //user input
        System.out.println("Quale serie numerica si vuole calcolare?\n\nInserire un numero da 1 a 5");
        Scanner input = new Scanner(System.in);
        int scelta = input.nextInt();
        switch (scelta) {
            case 1: {
                System.out.println("Hai selezionato la serie numero 1");
                serie_1();
                break;
            }
            case 2: {
                System.out.println("Hai selezionato la serie numero 2");
                serie_2();
                break;
            }
            case 3: {
                System.out.println("Hai selezionato la serie numero 3");
                serie_3();
                break;
            }
            case 4: {
                System.out.println("Hai selezionato la serie numero 4");
                serie_4();
                break;
            }
            case 5: {
                System.out.println("Hai selezionato la serie numero 5");
                serie_5();
                break;
            }
        }
    }  
}
