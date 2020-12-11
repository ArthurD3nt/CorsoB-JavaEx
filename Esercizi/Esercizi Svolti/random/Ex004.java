/**
Si scriva un programma che legga dalla tastiera un
numero binario di quattro bit sotto forma di stringa e che 
poi lo converta in un numero decimale.
Per esempio, se l'input è 1100, l'output deve essere 12
Suggerimento: si suddivida la stringa in sottostringhe 
e quindi si converta ciascuna sottostringa in un valore per ciascun bit
se i bit sono b0, b1, b2, b3 il numero decimale equivalente potrà
esser calcolato con la formula 8*b0 + 4 * b1 + 2*b2 +b3
*/

import java.util.Scanner;
import java.lang.Math;

public class Ex004 {
    public static void main(String[] arg){
    Input();
    }

    public static void Input() {
        System.out.println("Inserire un numero binario:");
        Scanner input = new Scanner (System.in);
        StrSplit(input.nextLine());
    }

    public static void StrSplit(String str) {
        String[] arrString = str.split("");
        int arr[] = new int [arrString.length];
        for (int i = 0; i < arrString.length; i++ ){
            if (!arrString[i].equals("0") && !arrString[i].equals("1")) {
                System.out.println("\nNope, devi mettere un numero binario. \nRiprova, la prossima volta sarai più fortunato\n");
                Input();
            }
            arr[i] = Integer.parseInt(arrString[i]);
        }
        Dec(arr);
    }
    
    public static void Dec(int arr[]) {
        int res = 0;
        int j = arr.length - 1;
        for (int i = 0; i <= arr.length - 1; i++) {
             if (arr[i] == 1) {
                 res = res + (int)(Math.pow(2, j));
             }
            j--;
        }
        System.out.println("Ayyyy, il tuo numero, trasformato da binario a decimale è: " + res);
    }
}