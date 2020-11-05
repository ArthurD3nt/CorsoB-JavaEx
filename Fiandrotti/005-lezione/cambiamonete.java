import java.util.Scanner;

public class cambiamonete {
        public static void main(String[] args){
            System.out.println("Questa macchina è un cambiamonete");
            Scanner input = new Scanner(System.in);
            System.out.println("Inserire importo in euro: ");
            float a =input.nextFloat();
            input.close();
            a = a * 100;
            int n = Math.round(a);
            System.out.println("L'importo da lei inserito e' pari a " + n + " centesimi");
            if (n/50>=1) {
                System.out.println("Monete da 50: " + n/50);
                n = n%50;
            }if (n/20>=1) {
                System.out.println("Monete da 20: " + n/20);
                n = n%20;
            }if (n/10>=1) {
                System.out.println("Monete da 10: " + n/10);
                n = n%10;
            }if (n/5>=1) {
                System.out.println("Monete da 5: " + n/5);
                n = n%5;
            }if (n/2>=1) {
                System.out.println("Monete da 2: " + n/2);
                n = n%2;
            }if (n/1>=1) {
                System.out.println("Monete da 1: " + n);
            }     
    }
}