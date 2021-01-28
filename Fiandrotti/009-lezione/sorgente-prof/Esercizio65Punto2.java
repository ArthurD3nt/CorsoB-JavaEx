public class Esercizio65Punto2 {
	 
	/* Data una matrice m, calcolare la somma degli elementi di m come la somma
	   degli elementi di ogni riga di m ("row-major order")
     */

	//esteso
	public static int punto2ext(int[][] m) {
		int s = 0;
		if (m != null) {
			int i = 0;
			while (i < m.length) {
				int j = 0;
				if (m[i] != null) {
					while (j<m[i].length) {
						s = s +(m[i][j]);
						j++;
					}
				}
				i++;
			}
    }
	  return s;
	}

	//compatto
	public static int punto2(int[][] m) {
		int s = 0;
		int i = 0;
		if (m != null) {
			while (m!= null && i < m.length) {
				int j = 0;
				while (m[i] != null && j<m[i].length) {
					s = s +(m[i][j]);
					j++;
				}
				i++;
			}
		}
	  return s;
	}

	 public static void main (String[] args){
		System.out.println("Esteso");
		 System.out.println(0==punto2ext(null));
		 System.out.println(0==punto2ext(new int[][] {}));
		 System.out.println(0==punto2ext(new int[][] {null}));
		 System.out.println(0==punto2ext(new int[][] {{}}));
		 System.out.println(3==punto2ext(new int[][] {{1},null,{},{1,1}}));
		 System.out.println("Compatto");
		 System.out.println(0==punto2(null));
		 System.out.println(0==punto2(new int[][] {}));
		 System.out.println(0==punto2(new int[][] {null}));
		 System.out.println(0==punto2(new int[][] {{}}));
		 System.out.println(3==punto2(new int[][] {{1},null,{},{1,1}}));
	 }
}
