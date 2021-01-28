import java.util.Arrays;

public class Esercizio65Punto7Finale {

	/* Produrre un array in cui ogni elemento contiene la 
     differenza tra la somma di tutti gli elementi della 
     2n-esima colonna e la somma della 2n + 1-esima colonna 
     in m.                                                    */
	public static int[] punto7(int[][] m) {
		int[] a = null;

		if (m != null) {
			/* Calcolo la lunghezza della riga piu lunga di m */
			int maxLunR = maxLunR(m);
			/* Il numero di differenze è pari ad almeno
			   la metà del massimo numero di colonne in m.
			   Se tale numero è dispari, occorre aggiungere
			   un ultimo elemento in a che conterrà il numero
			   la somma dei valori nell'ultima colonna di m. */
			a = new int[maxLunR/2 + maxLunR%2];

			int k = 0;
			/* Calcolo le prime maxLunR/2 differenze */
			for(int j = 0; j < maxLunR/2; j = j + 1) {
				a[k] = sommaElC(m, 2*j)-sommaElC(m, 2*j+1);
				k = k + 1;
			}
			/* Calcolo un'eventuale ultima differenza */
			for(int j = 0; j < maxLunR%2; j = j + 1) {
				a[k] = sommaElC(m, maxLunR-1);
				k = k + 1;
			}
		}
		return a;
	}

	/* Somma elementi della colonna j nella matrice m. */
	public static int sommaElC(int[][] m, int j) {
		int s = 0;
		int i = 0;
		while(i < m.length) {
			if (m[i] != null && j < m[i].length) {
				s = s + m[i][j];
			}
			i = i + 1;
		}
		return s;
	}

	/* Lunghezza della riga più lunga della matrice m. */
	public static int maxLunR(int[][] m) {
		int max = 0;
		if (m != null) {
			int i = 0;
			while(i < m.length) {
				if (m[i] != null && max < m[i].length) {
					max = m[i].length;
				}
				i = i + 1;
			}
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