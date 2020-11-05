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

  public static int primaSerieV2(int q, int n) {
    int s = 1;
	int num = 1;
    int k = 1;
    while (k < n + 1) {
	  num = Aritmetica.perU(num, q);
      s = s + num;
      k = k + 1;
    }
    return s;
  }
  
  public static float secondaSerie(int n) {
    float s = 0;
	int den = 0;
	int k = 1;
    while (k < n + 1) {
	  den = Aritmetica.pot(k, 2);
      s = s + (1 / (float)den);
      k = k + 1;
    }
    return s;
  }
  
  public static float terzaSerie(int n) {
    float s = 0;
	int	den = 0;
	int k = 0;
    while (k < n + 1) {
	  den = Aritmetica.pot(Aritmetica.piu(Aritmetica.perU(k, 2), 1), 2);
      s = s + (1 / (float)den);
      k = k + 1;
    }
    return s;
  }
  
  public static float quartaSerie(int n) {
    float s = 0;
	int	num = 0, den = 0;
	int k = 0;
    while (k < n + 1) {
	  num = Aritmetica.pot(-1, k);
	  den = Aritmetica.piu(Aritmetica.perU(2, k), 1);
      s = s + (num / (float)den);
      k = k + 1;
    }
    return s;
  }
  
  public static float quintaSerie(int z, int n) {
    float s = 0;
	int	num = 1, den = 0;
	int k = 0;
    while (k < n + 1) {
	  num = Aritmetica.pot (z, k);
	  den = fattoriale(k);
      s = s + ((float)num / (float)den);
      k = k + 1;
    }
    return s;
  }
  
  public static int fattoriale(int n) {
	int k = 1;
	int ret = 1;
	while (k <= n) {
		ret = Aritmetica.perU(ret, k);
		k = k + 1;
	}
	return ret;
  }
  
  public static float quintaSerieV2(int z, int n) {
    float s = 1;
	int	num = 1, den = 1;
	int k = 1;
    while (k < n + 1) {
	  num = Aritmetica.perU(num, z);
	  den = Aritmetica.perU(den, k);
      s = s + ((float)num / (float)den);
      k = k + 1;
    }
    return s;
  }
  
}