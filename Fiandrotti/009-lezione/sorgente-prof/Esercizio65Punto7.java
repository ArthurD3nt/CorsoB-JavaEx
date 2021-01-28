import java.util.Arrays;

public class Esercizio65Punto7 {

	/* Produrre un array in cui ogni elemento contiene la 
     differenza tra la somma di tutti gli elementi della 
     2n-esima colonna e la somma della 2n + 1-esima colonna 
     in m.                                                    */
	public static int[] punto7(int[][] m) {
		int[] a = null;

		if (m != null) {
			[...]
		}
		return a;
	}

	/* Somma elementi della colonna j nella matrice m. */
	public static int sommaElC(int[][] m, int j) {
		int s = 0;
		int i = 0;
		while(i < m.length) {
			[...]
		}
		return s;
	}

    /* Lunghezza della riga più lunga della matrice m. */
	public static int maxLunR(int[][] m) {
    int max = 0;
		if (m != null) {
			[...]
		}
		return max;
	}

	public static void main (String[] args){
		 System.out.println(Arrays.equals(null, punto7(null)));
		 System.out.println(Arrays.equals(new int[] {}, punto7(new int[][] {})));
		 System.out.println(Arrays.equals(new int[] {}, punto7(new int[][] {null})));
 		 System.out.println(Arrays.equals(new int[] {}, punto7(new int[][] {{}})));
 		 System.out.println(Arrays.equals(new int[] {1}, punto7(new int[][] {{1}
                                                                        ,null
                                                                        ,{}
                                                                        ,{1,1}})));
		 System.out.println(Arrays.equals(new int[] {1}, punto7(new int[][] {{1}
                                                                         ,null
                                                                         ,{1,1}
                                                                         ,{}})));
		 System.out.println(Arrays.equals(new int[] {2, 1}, punto7(new int[][] {{1}
                                                                           ,null
                                                                           ,{1,1,1}
                                                                           ,{1}})));
		 System.out.println(Arrays.equals(new int[] {2, 1}, punto7(new int[][] {{1}
                                                                              ,null
                                                                              ,{1,1,1}
                                                                              ,{1}
                                                                              ,null})));
	}
}