import java.lang.Math;

public class SerieTest {

  public static void main(String[] args) {
    
    final float ERRORE = 0.5f; // errore ritenuto ragionevole
    
    int q, n; // parametri attuali 
    boolean primaSerieTest; // valore risultante da SerieIniziale.primaSerie
    float valoreEsattoPrimaSerie;

    // primaSerie Test 01
    q = 2; n = 4;
    valoreEsattoPrimaSerie = (1 - Aritmetica.pot(q, n + 1))/(1 - q);
    primaSerieTest = 
      (valoreEsattoPrimaSerie - ERRORE) <= SerieIniziale.primaSerie(q,n)
         && SerieIniziale.primaSerie(q,n) <= (valoreEsattoPrimaSerie + ERRORE);
    System.out.println(primaSerieTest);

    // primaSerie Test 02
    q = 2; n = 5;
    valoreEsattoPrimaSerie = (1 - Aritmetica.pot(q, n + 1))/(1 - q);
    primaSerieTest = 
      (valoreEsattoPrimaSerie - ERRORE) <= SerieIniziale.primaSerie(q,n)
         && SerieIniziale.primaSerie(q,n) <= (valoreEsattoPrimaSerie + ERRORE);
    System.out.println(primaSerieTest);

    // primaSerie Test 03
    q = 3; n = 2;
  valoreEsattoPrimaSerie = (1 - Aritmetica.pot(q, n + 1))/(1 - q);
    primaSerieTest = 
      (valoreEsattoPrimaSerie - ERRORE) <= SerieIniziale.primaSerie(q,n)
         && SerieIniziale.primaSerie(q,n) <= (valoreEsattoPrimaSerie + ERRORE);
    System.out.println(primaSerieTest);
  } 
}