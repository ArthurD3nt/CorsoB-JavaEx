public class StampaSegmConFinale {
	
  /* Metodo controvariante che stampa i primi 
  n numeri naturali in ordine crescente. */
  public static void stampaU(int n, int i){
		if (n == i) {
      /* Stampa i numeri nell'intervallo [0,n-n), 
        cioè in [0,0), che è vuoto. Quindi non 
        stampa nulla. */
    } else {
      stampaU(n, i+1); /* Per ipotesi induttiva, 
                        stampa [0,n-(i+1)), cioè [0,n-i-1)  */
      System.out.print(n-(i+1) + " "); /* Stampa n-(i+1)==n-i-1*/
      /* Ha stampato [0,n-i-1) seguito dalla stampa di n-i-1.
      Quindi stampa l'intervallo [0,n-i) dei numeri naturali*/
    }      
	}

  /* Metodo wrapper che stampa i primi 
  n numeri naturali in ordine crescente 
  sfruttando quello controvariante. */
  public static void stampaU(int n){
      stampaU(n,0); /* Stampa l'intervallo [0,n) dei numeri naturali*/
	}
	
  /* Metodo controvariante che stampa i primi 
  n numeri naturali in ordine decrescente. */
  public static void stampaD(int n, int i){
		if (n == i) {
      /* Stampa i numeri nell'intervallo (n-n,0], 
        cioè in (0,0], che è vuoto. Quindi non 
        stampa nulla. */
    } else {
      System.out.print(n-(i+1) + " "); /* Stampa n-(i+1)==n-i-1*/
      stampaD(n, i+1); /* Per ipotesi induttiva, 
                        stampa (n-(i+1),0], cioè (n-i-1,0]  */
      /* Ha stampato (n-i-1,0] preceduto dalla stampa di n-i-1.
      Quindi stampa l'intervallo (n-i,0] dei numeri naturali */
    }      
	}

  /* Metodo wrapper che stampa i primi 
  n numeri naturali in ordine crescente 
  sfruttando quello controvariante. */
  public static void stampaD(int n){
      stampaD(n,0); /* Stampa l'intervallo (n,0] dei numeri naturali*/
	}

}
