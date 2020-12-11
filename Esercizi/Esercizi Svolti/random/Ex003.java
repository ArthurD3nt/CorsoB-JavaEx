import java.util.Scanner;

public class Ex003 {
  public static void main (String[] args) {

    Scanner input = new Scanner (System.in);
    int eta;
    String nome;
    System.out.println("Digita il tuo nome completo.");
    nome = input.nextLine();
    System.out.println("Digita la tua eta'. ");
    eta = input.nextInt();
    ;
    System.out.println("Il tuo mome in maiuscolo e' "

    + nome.toUpperCase() + " e hai " + eta + " anni.");
      }
}