public class pal402 {
    /* È ammesso:
 * 1. sostituire le sequenze di caratteri \*???*\ con espressioni, linee di 
 * comando, richiami ad altri metodi
 * 2. aggiungere metodi  
 * quando ritenuto necessario.
 * Non è ammesso modificare le parti di codice fornite. */
 
public static boolean e2(int[][] x) {
    return e2R(x, 0);
}

public static boolean e2R(int[][] x, int i) {
    if (i == x[i].length) {
        return false;
    } else {
        return esiste(x[i]) && e2R(x, i++);
    }
}

public static boolean esiste(int[] r) {
    boolean esiste = false;
    for (int i = 0; i < r.length; i++){
    if (r[i] == 0) {
        esiste = true;
    } else {
        esiste = false;
    }
    }
    return esiste;
}

// Testing
static int[][] a0 = { {} }; //false
static int[][] a1 = { {1} }; //false
static int[][] a2 = { {1},{1} }; //false
static int[][] a3 = { {1},{0}  }; //true
static int[][] a4 = { {1,2} ,{1,0} }; //true
static int[][] a5 = { {1,2}, {1,2} }; //false
static int[][] a6 = { {1,2,3},{1,3,4},{1,0,2} }; // true
static int[][] a7 = { {1,2,2},{1,3,4},{1,2,3} }; // false
}
