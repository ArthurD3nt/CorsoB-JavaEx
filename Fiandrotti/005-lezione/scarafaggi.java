import java.util.Scanner;

public class scarafaggi {

    public static double growth(double n, double v) {
        //Usefull constants
        double vol_scar = 0.08;
        double weekly_rate = 1.95;
        int weeks = 0;
        vol_scar = vol_scar * n;

        //Calc
        while (vol_scar <= v) {
            vol_scar = vol_scar * weekly_rate;
            weeks ++;
            //basic debug info
            //System.out.println("Volume: " + vol_scar + " | " + "Settimane: " + weeks);
        }
        return weeks;
    }
    public static void main(String[] args){

        //User input
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il numero di scarafaggi: ");
        double scar = input.nextDouble();  //numero di scarafaggi iniziale
        System.out.println("Inserire il volume della stanza in metri cubi: ");
        double vol = input.nextDouble();  //volume stanza in mc
        input.close();
        
        //chiamo metodo growth
        System.out.println("Ci sono volute " + growth(scar, vol) + " settimane per riempire la stanza");

    }
}
