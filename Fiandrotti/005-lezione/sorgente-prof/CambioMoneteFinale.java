public class CambioMoneteFinale {
  
  public static String cambia(int banconota) {
     final int CINQUANTACENT = 50;
     final int VENTICENT = 20;
     final int DIECICENT = 10;
     final int CINQUECENT = 5;
     final int DUECENT = 2;
     final int UNCENT = 1;

     int resto = banconota;
     
     int cinquantaCent = Aritmetica.quo(resto,CINQUANTACENT);// floor(resto/CINQUANTACENT)
     resto = Aritmetica.resto(resto,CINQUANTACENT); // resto = resto - (cinquantaCent * CINQUANTACENT)
     
     int ventiCent = Aritmetica.quo(resto,VENTICENT);
     resto = Aritmetica.resto(resto,VENTICENT);
     
     int dieciCent = Aritmetica.quo(resto,DIECICENT);
     resto = Aritmetica.resto(resto,DIECICENT);
     
     int cinqueCent = Aritmetica.quo(resto,CINQUECENT);
     resto = Aritmetica.resto(resto,CINQUECENT);
     
     int dueCent = Aritmetica.quo(resto,DUECENT);
     int unCent = Aritmetica.resto(resto,DUECENT);
     
	 String sequenzaRitorno = cinquantaCent + " " + ventiCent + " " + dieciCent + " " + cinqueCent + " "  + dueCent + " " + unCent;
	 // ESEMPIO PER INPUT == 45 (dal piu grande al piu piccolo)
	 //String risAtteso = "0 2 0 1 0 0"
	 // ESEMPIO PER INPUT == 45 (dal piu piccolo al piu grande)
	 //String risAttesoInv = "0 0 1 0 2 0"
	 return sequenzaRitorno;
  }
}