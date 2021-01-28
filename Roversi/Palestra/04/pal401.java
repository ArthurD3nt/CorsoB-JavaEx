public class pal401 {
    /* È ammesso:
 * - sostituire le sequenze di caratteri \*???*\ con:
 *   -- espressioni;
 *   -- una o più linee di comando;
 * - aggiungere metodi
 * quando ritenuto necessario.
 *
 * Non è ammesso modificare le parti di codice fornite. */
 
public static boolean e1(int[][] x) {
    boolean esiste = false;
    for (int i = 0; i < x.length ; i++)
        for (int j = 0; j < x[i].length; j++ ) {
            if (x[i][j] == 0) {
                esiste = true;
            }
        }
    return esiste;
}

    public static void main(String[] args) {
    // Testing
    int[][] a0 = { {0} }; //true
    int[][] a1 = { {1} }; //false
    int[][] a2 = { {1},{1} }; //false
    int[][] a3 = { {1}, {0} }; //true
    int[][] a4 = { {1,2}, {1,0} }; //true
    int[][] a5 = { {1,2}, {1,2} }; //false
    int[][] a6 = { {1,2,3}, {1,2,3} }; // false
    int[][] a7 = { {1,2,3}, {1,2,0} }; // true

    System.out.println(e1(a0) + " true");
    System.out.println(e1(a1)+ " false");
    System.out.println(e1(a2)+ " false");
    System.out.println(e1(a3)+ " true");
    System.out.println(e1(a4)+ " true");
    System.out.println(e1(a5)+ " false");
    System.out.println(e1(a6)+ " false");
    System.out.println(e1(a7)+ " true");

    }

}

