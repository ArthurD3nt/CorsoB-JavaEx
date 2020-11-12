public class Punto3EsercizioCon {
  
  public static void multipliU(int m, int n, int i) { 
    if (n == i) {
      /* Non stampa multipli nulli di m */
    } else {
       multipliU(m, n, i + 1); /* Stampa m 2m .. (n-(i+1))m 
                               Cioè stampa m 2m .. (n-i-1)m  */
       System.out.println((n-i)*m + " "); /* Stampa (n-i)m */
       /* Stampa m 2m .. (n-i-1)m (n-i)m */
    }
  }

  public static void multipliU(int m, int n) {
    multipliU(m, n, 0);
  }

  public static void multipliD(int m, int n, int i) {
    if (n == i) {
      /* Non stampa multipli nulli di m */
    } else {
       System.out.println((n-i)*m + " "); /* Stampa (n-i)m */
       multipliD(m, n, i + 1); /* Stampa (n-(i+1))m .. 2m m */
       /* Stampa (n-i)m (n-(i+1))m .. 2m m */
    }
  }

  public static void multipliD(int m, int n) {
    multipliD(m, n, 0);
  }

  public static void main(String[] args) {
       multipliU(4, 3);
       System.out.println();
       multipliD(4, 3); 
  }
}