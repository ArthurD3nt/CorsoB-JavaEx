public class Esercizio65Punto3 {
	 
	/* Data una matrice m, calcolare la somma degli elementi di m come la somma
	   degli elementi di ogni colonna di m ("column-major order")
     */
	public static int punto3(int[][] m) {
		int maxLunR = maxLunR(m);
		int s = 0;
		if (m != null) {
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
		 System.out.println(0==punto3(null));
		 System.out.println(0==punto3(new int[][] {}));
		 System.out.println(0==punto3(new int[][] {null}));
		 System.out.println(0==punto3(new int[][] {{}}));
		 System.out.println(3==punto3(new int[][] {{1},null,{},{1,1}}));
		 System.out.println(3==punto3(new int[][] {{1},null,{1,1},{}}));
		 System.out.println(3==punto3(new int[][] {{1},null,{1,1},{}}));
  }
}
