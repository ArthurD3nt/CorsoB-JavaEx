/*Scrivere un programma che stampi le tabellina del numero dato come argomento*/
import java.util.Scanner;
public class Es3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    	System.out.println("Inserisci un numero: ");
        int tab=input.nextInt();
        for(int a=1,ris=0;a<=10;a++){
            ris=tab*a;
            System.out.println(ris);
        }
    }
}