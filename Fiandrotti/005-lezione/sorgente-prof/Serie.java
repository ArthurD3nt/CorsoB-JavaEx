public class Serie {
  
  public static int primaSerie(int q, int n) {
    int s = 0;
    int k = 0;
    while (k < n + 1) {
      s = s + Aritmetica.pot(q, k);
      k = k + 1;
    }
    return s;
  }
}