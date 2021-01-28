import java.util.Arrays;

public class Esercizio65Punto6 {

	/* Produrre un array in cui ogni elemento contiene la differenza
    tra la somma di tutti gli elementi della 2n-esima riga e la
    somma della (2n+1)-esima riga in m. */
	public static int[] punto6(int[][] m) {
		int[] a = null;
		if (m != null) {
			[...]
		}
	  return a;
	}

    /* Funzione ausiliaria che somma gli elementi nell'array r. */
	public static int sommaElR(int[] r) {
    int s = 0;
		if (r != null) {
			[...]
		}
		return s;
	}

	public static void main (String[] args){
		 System.out.println(Arrays.equals(null, punto6(null)));
		 System.out.println(Arrays.equals(new int[] {}, punto6(new int[][] {})));
		 System.out.println(Arrays.equals(new int[] {0}, punto6(new int[][] {null})));
		 System.out.println(Arrays.equals(new int[] {0}, punto6(new int[][] {{}})));
 		 System.out.println(Arrays.equals(new int[] {1, -2}, punto6(new int[][] {{1},null,{},{1,1}})));
		 System.out.println(Arrays.equals(new int[] {1, 2}, punto6(new int[][] {{1},null,{1,1},{}})));
		 System.out.println(Arrays.equals(new int[] {1, 1, 2}, punto6(new int[][] {{1},null,{1,1},{1},{2}})));
		 System.out.println(Arrays.equals(new int[] {1, 1, 0}, punto6(new int[][] {{1},null,{1,1},{1},null})));
		 System.out.println(Arrays.equals(new int[] {1, 1, 0}, punto6(new int[][] {{1},null,{1,1},{1},{}})));
	}
}