public class CambioMoneteFinaleTest {
   public static void main (String[] args) {
   
   // Input(s)
   int input = 45;
   // Output che ci attendiamo nel caso l'algoritmo sia corretto
   String outputAtteso "0 2 0 1 0 0"; // Ipotesi: cdifca con taglio maggiore in prima posizione
   // Invoco l'algoritmo
   String output = CambioMoneteFinale.cambia(input);
   // Clalcolo la variabile boolean di successo
   boolean successo = output.equals(outputAtteso);
   // Smeplice stampata a schermo
   System.out.println("CambioMoneteFinale.cambia(" + input + ") -> " + output + " SUCCESS: " + successo);
   }
}