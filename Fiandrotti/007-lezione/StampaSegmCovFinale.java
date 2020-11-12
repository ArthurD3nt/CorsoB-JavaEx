public class StampaSegmCovFinale {
	
  /* Metodo covariante che stampa i primi 
  n numeri naturali in ordine crescente,
  cioè da 0 incluso a n escluso. */
  public static void stampaU(int n){
		if (n == 0) {
      /* Stampa i numeri da 0 incluso a 0 escluso, 
        cioè nessun numero */
    } else {
      stampaU(n-1); /* Stampa i numeri da 0 incluso a n-1 escluso. */
      System.out.print(n-1 + " "); /* Stampa n-1 */
      /* Avrà appena stampato i numeri da 0 incluso
      a n-1 incluso, quindi da 0 a n escluso */
    }      
	}
	
  /* Metodo covariante che stampa i primi 
  n numeri naturali in ordine decrescente, 
  cioè da n escluso a 0 incluso. */
  public static void stampaD(int n){
		if (n == 0) {
      /* Stampa i numeri da 0 escluso a 0 incluso, 
        cioè nessun numero */
    } else {
      System.out.print(n-1 + " "); /* Stampa n-1 */
      stampaD(n-1); /* Stampa i numeri da n-1 escluso a 0 incluso. */
      /* Avrà appena stampato i numeri da n-1 incluso,
      a 0 incluso, quindi da n escluso a 0 incluso */
    }      
	}
}
