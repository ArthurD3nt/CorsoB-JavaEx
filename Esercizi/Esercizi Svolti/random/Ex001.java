import java.util.Scanner;

public class Ex001 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il numero a:");
        int a = input.nextInt();
        System.out.println("Inserire il numero b:");
        int b = input.nextInt();
        somma(a, b);
    }

    public static void somma (int a, int b) {
        Scanner input = new Scanner(System.in);
        int result = a + b;
        System.out.println("Inserire il risultato giusto:");
        int rs = input.nextInt();
        if (rs == result) {
            System.out.println("Nice, sai contare");
            input.close();
        } else {
            somma (a, b);
        }

    }
}
