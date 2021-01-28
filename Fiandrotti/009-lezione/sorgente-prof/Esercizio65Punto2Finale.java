public class Esercizio65Punto2Finale {
	 
	/* Data una matrice m, calcolare la somma degli elementi di m come la somma
	   degli elementi di ogni riga di m ("row-major order")
     */	
	public static int punto2(int[][] m) {
		int s = 0; // variabile accumulatore
		if (m != null) {
			int i = 0; // indice della riga
			while(i < m.length) {
				int j = 0; // indice della colonna
				if (m[i] != null) {
					while(j < m[i].length) {
						s = s + m[i][j];
						j = j + 1; // incremento l'indice di colonna
					}
				}
			i = i + 1; // incremento l'indice di riga
			}
		}
		return s;
	}
	 
	 public static void main (String[] args){
		 System.out.println(0==punto2(null));
		 System.out.println(0==punto2(new int[][] {}));
		 System.out.println(0==punto2(new int[][] {null}));
		 System.out.println(0==punto2(new int[][] {{}}));
		 System.out.println(3==punto2(new int[][] {{1},null,{},{1,1}}));
	 }
}
