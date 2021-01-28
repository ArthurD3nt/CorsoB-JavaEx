import java.util.Arrays;

public class Test {

		public static void main (String[] args) {
		/* Classifica del torneo/campionato
		 * classNomiSquadre: array con nomi delle squadre partecipanti al torneo
		 * classPuntiSquadre: array con punti delle squadre partecipanti al torneo
		 *
		 * Tutte le squadre iniziano con 0 punti all'attivo
		 */
		String[] classNomiSquadre = {"Torino",  "Roma", "Napoli"};
		int[] classPuntiSquadre = {0, 0, 0};

		/* Elenco partite del torneo/campionato
		 * nomeSquadraCasa: array con nomi delle squadre che hanno giocato in casa
		 * nomeSquadraOspite: array con nomi delle squadre che hanno giocato fuori
		 * goalsSquadraCasa: array con goals segnati dalal squadra di casa
		 * goalsSquadraCasa: array con goals segnati dalal squadra ospite
		 *
		 * L'esempio sottostante si legge come:
		 * Torino-Roma 1-1
		 * Roma-Napoli 0-2
		 * Napoli-Torino 2-3
		 */
		String[] nomeSquadraCasa = {"Torino", "Roma", "Napoli"};
		String[] nomeSquadraOspite = {"Roma", "Napoli", "Torino"};
		int[] goalsSquadraCasa = {1, 0, 2};
		int[] goalsSquadraOspite = {1, 2, 3};

		// Processiamo tutte le partite del torneo/stagione per attribuire i punti in classifica
		Metodi.analizzaPartite(nomeSquadraCasa, nomeSquadraOspite, goalsSquadraCasa, goalsSquadraOspite, classNomiSquadre, classPuntiSquadre);

		// Cerchiamo una squadra vincitrice
		int capolista = Metodi.trovaCapolista(classPuntiSquadre);
		if (capolista == -1) {
			System.out.println("spareggio necessario!");
		} else {
			System.out.println("Vince il torneo " + classNomiSquadre[capolista] + " con " + classPuntiSquadre[capolista] + " punti!");
		}
		//System.out.println(Arrays.toString(classPuntiSquadre));

		// Ordiniamo la classifica squadre e quindi la stampiamo
		Metodi.ordinaClassifica(classNomiSquadre, classPuntiSquadre);
		stampaClassifica(classNomiSquadre, classPuntiSquadre);

		// Domanda: come potremmo sfruttare il metodo ordinaClassifica() per individuare anche la squadra vincitrice ?
	}

	/* Questo  metodo riceve in input classNomiSquadre e classPuntiSquadre e stampa la classifica squadre */
	public static void stampaClassifica(String[] classNomiSquadre, int[] classPuntiSquadre) {
		System.out.println("Squadra\t\tPunti");

		for (int i = classNomiSquadre.length -1; i >= 0; i--) {
			System.out.println(classNomiSquadre[i] + "\t\t" + classPuntiSquadre[i]);
		}
	}
}