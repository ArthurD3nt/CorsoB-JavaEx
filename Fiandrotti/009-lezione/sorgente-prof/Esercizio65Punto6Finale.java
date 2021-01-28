import java.util.Arrays;

public class Esercizio65Punto6Finale {

	/* Produrre un array in cui ogni elemento contiene la differenza
    tra la somma di tutti gli elementi della 2n-esima riga e la
    somma della (2n+1)-esima riga in m. */
	public static int[] punto6(int[][] m) {
		int[] a = null;
		if (m != null) {
			/* Il numero di differenze è almeno la metà delle righe di m.
			   Se il numero delle righe di m è dispari, alla somma degli
			   elementi dell'ultima riga non si sottrarrà nulla.
			 */
			a = new int[(m.length/2) + (m.length%2)];

			int k = 0; // Contatore delle righe di a
			// Calcolo le prime (m.length/2) differenze
			for(int i = 0; i < m.length/2; i = i + 1) {
				a[k] = sommaElR(m[2*i]) - sommaElR(m[2*i+1]);
				k = k + 1;
			}
			// Clacolo un'eventuale ultima differenza tramite semplice copia
			for(int i = 0; i < m.length%2; i = i + 1) {
				a[k] = sommaElR(m[m.length-1]);
				k = k + 1;
			}
		}
		return a;
	}

    /* Funzione ausiliaria che somma gli elementi nell'array r. */
	public static int sommaElR(int[] r) {
		int s = 0;
		if (r != null) {
			int j = 0; // Indice di colonna nella riga r
			while(j < r.length) {
				s = s + r[j];
				j = j + 1;
			}
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