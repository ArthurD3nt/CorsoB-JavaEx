public class Esercizio65Punto3Finale {
	 
	/* Data una matrice m, calcolare la somma degli elementi di m come la somma
	   degli elementi di ogni colonna di m ("column-major order")
     */
	public static int punto3(int[][] m) {
		// lunghezza massima delle righe
		int maxLunR = maxLunR(m);
		int s = 0; // variabile accumulatore
		if (m != null) {
			int j = 0; // indice della colonna
			while(j < maxLunR) {
				int i = 0; // indice delal riga
				while(i < m.length) {
					// Q: cosa succede se scambiamo l'ordine delle due espressioni sottostanti ?
					if (m[i] != null && j < m[i].length) {
						s = s + m[i][j];
					}
					i = i + 1;
				}
				j = j + 1;
			}
		}
		return s;
	}
	
  /* Lunghezza della riga più lunga della matrice m. */
	public static int maxLunR(int[][] m) {
    int max = 0;
	if (m != null) {
		int i = 0; // Indice di riga
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
		 System.out.println(0==punto3(null));
		 System.out.println(0==punto3(new int[][] {}));
		 System.out.println(0==punto3(new int[][] {null}));
		 System.out.println(0==punto3(new int[][] {{}}));
		 System.out.println(3==punto3(new int[][] {{1},null,{},{1,1}}));
		 System.out.println(3==punto3(new int[][] {{1},null,{1,1},{}}));
		 System.out.println(3==punto3(new int[][] {{1},null,{1,1},{}}));
  }
}
