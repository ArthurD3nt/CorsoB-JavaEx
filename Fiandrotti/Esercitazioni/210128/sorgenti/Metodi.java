public class Metodi {
	
	/* Aggiunge sqPunti punti alla squadra di nome sqNome */
	public static void incrementaPunti(String[] classSquadre, int[] classPunti, String sqNome, int sqPunti) {
		boolean trovata = false;
		// Ciclo per cercare la squadra di nome sqNome
		for  (int i = 0; trovata == false && i < classSquadre.length; i++) {
			if (classSquadre[i].equals(sqNome)) {
				classPunti[i] = classPunti[i] + sqPunti;
				trovata = true;
			}
		}
	}
	
	/* Esamina il risultato di una singola partita e attribuisce i punti in classifica alle squadre */
	public static void analizzaPartita(String[] squadraCasa, String[] squadraOspite, int[] goalsCasa, int[] goalsOspite, String[] classSquadre, int[] classPunti, int indicePartita) {
	
		// Per semplicità esplicitiamo nomi e goals di ogni partita
		String sqCasa = squadraCasa[indicePartita];
		String sqOspite = squadraOspite[indicePartita];
		int gCasa = goalsCasa[indicePartita];
		int gOspite = goalsOspite[indicePartita];
		
		// Vittoria squadra casa: 2 punti a squadra di casa
		if (gCasa > gOspite) {
			incrementaPunti(classSquadre, classPunti, sqCasa, 2);
		}
		// Vittoria squadra ospite: 2 punti a squadra ospite
		else if (gCasa < gOspite) {
			incrementaPunti(classSquadre, classPunti, sqOspite, 2);
		}
		// Pareggio: 1 punto a ogni squadra
		else if (gCasa  ==  gOspite) {
			incrementaPunti(classSquadre, classPunti, sqCasa, 1);
			incrementaPunti(classSquadre, classPunti, sqOspite, 1);
		}
	}
	
	/* Esamina l'insieme dell partite chiamando analizzaPartita() */
	public static void analizzaPartite(String[] squadraCasa, String[] squadraOspite, int[] goalsCasa, int[] goalsOspite, String[] classSquadre, int[] classPunti) {
		//TODO check indicePartita lecito

		// Ciclo su tutte le partite della stagione
		for  (int i = 0; i < squadraCasa.length; i++) {
			analizzaPartita(squadraCasa, squadraOspite, goalsCasa, goalsOspite, classSquadre, classPunti, i);
		}
	}
	
	/* Ritorna l'indice della squadra capolista, oppure -1 se é necessario uno spareggio */
	public static int trovaCapolista(int[] classPunti) {
		int indiceCapolista = -1;
		int puntiCapolista = -1;
		
		//Primo ciclo: individuiamo squadra capolista e relativi punti
		for  (int i = 0; i < classPunti.length; i++) {
			if (classPunti[i] > puntiCapolista) {
				indiceCapolista = i;
				puntiCapolista = classPunti[i];
			}
		}
		
		//Secondo ciclo: verifichiamo se ci sia un'altra squadra con lo stesso punteggio
		//Nel caso, impostiamo indiceCapolista a -1 e terminiamo il ciclo
		for  (int i = 0; indiceCapolista != -1 && i < classPunti.length; i++) {
			if (i!= indiceCapolista && classPunti[i] == puntiCapolista) {
				indiceCapolista = -1;
			}
		}
		
		return indiceCapolista;
	}

	/* Ordina la classifica tramite bubble sort */
	public static void ordinaClassifica(String[] classSquadre, int[] classPunti) {
		String stmp;
		int itmp;
		
		//Ordinamento di due array sincronizzati tramite bubble sort */
		boolean scambioEffettuato = true;
		while (scambioEffettuato == true ) {
			scambioEffettuato = false;
			for (int i = 0; i < classPunti.length -1; i++ ) {
				if (classPunti[i] > classPunti[i+1]) {
					scambioEffettuato = true;
					itmp = classPunti[i]; stmp = classSquadre[i];
					classPunti[i] = classPunti[i+1]; classSquadre[i] = classSquadre[i+1];
					classPunti[i+1] = itmp; classSquadre[i+1] = stmp;
				}
			}
		}
	}
}