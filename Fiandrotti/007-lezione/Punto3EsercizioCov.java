public class Punto3EsercizioCov {
  
  public static void multipliU(int m, int n) { 
    if (n == 0) {
      /* Non stampa multipli nulli di m */
    } else {
       multipliU(m, n - 1); /* Stampa m 2m .. (n-1)m */
       System.out.println(n*m + " "); /* Stampa nm */
       /* Stampa m 2m .. (n-1)m nm */
    }
  }
  
  public static void multipliD(int m, int n) {
    if (n == 0) {
      /* Non stampa multipli nulli di m */
    } else {
       System.out.println(n*m + " "); /* Stampa nm */
       multipliU(m, n - 1); /* Stampa (n-1)m .. 2m m */
       /* Stampa nm (n-1)m .. 2m m */
    }
  }

  public static void main(String[] args) {
       multipliU(4, 3);
       System.out.println();
       multipliD(4, 3); 
  }
}