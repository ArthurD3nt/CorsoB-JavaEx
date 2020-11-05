public class ScarafaggiTest {
   public static void main (String[] args) {
	  int popIniz = 100;
	  int volumeAbitazione = 240;
	  int nSettAtteso = 23;
	  
	  int output = Scarafaggi.stimaSettimane(popIniz, volumeAbitazione);
	  bool successo = (nSettAtteso == output);
      System.out.println( "Scarafaggi.stimaSettimane() -> " + output + " SUCCESS: " + successo );
   }
}