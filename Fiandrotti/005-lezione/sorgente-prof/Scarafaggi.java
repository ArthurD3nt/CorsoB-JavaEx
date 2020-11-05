public class Scarafaggi {
  
  static final float VOLUME_SCARAFAGGIO = 0.76e-6f;
  static final float TASSO_CRESCITA = 0.95f;
  
  public static float volumeScarafaggi (float popolazione) {
    float volume = popolazione * VOLUME_SCARAFAGGIO;
    return volume;
  }

  public static float popolazioneScarafaggi (float popolazionePartenza) {
    float popolazioneArrivo = 
      popolazionePartenza + popolazionePartenza * TASSO_CRESCITA;
    return popolazioneArrivo;
  }

  public static int stimaSettimane (
           int popolazioneIniziale, int volumeAbitazione) {
    
    float popolazioneScarafaggi = popolazioneIniziale;
    float volumeScarafaggi = volumeScarafaggi(popolazioneScarafaggi);
    int settimane = 0;
    while (volumeScarafaggi < volumeAbitazione) {
      popolazioneScarafaggi = popolazioneScarafaggi(popolazioneScarafaggi);
      volumeScarafaggi = volumeScarafaggi(popolazioneScarafaggi);
      settimane = settimane + 1;
    }
    return settimane;
  }
}