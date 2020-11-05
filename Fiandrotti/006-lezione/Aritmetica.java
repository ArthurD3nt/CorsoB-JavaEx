public class Aritmetica {
  public static float pi = (float)3.1415;
  public static float e = (float)2.7182;
  
  public static int piu(int a, int b) {
    int res = a;
    int i = b;
    while (i > 0) {
      res = res + 1;
      i = i - 1;
    }
    return res;
  }

  public static int piuNC(int a, int b) {
    while (a > 0) {
      a = a - 1;
      b = b + 1;
    }
    return b;
  }

  /* Ricordare i vincoli sui valori di a e b:
     0<=a e 0<=b */
  public static int meno(int a, int b) {
    int res = a;
    int i = 0;
    while (i < b) {
      res = res - 1;
      i = i + 1;
    }
    return res;
  }

    public static float meno(float a, float b) {
    float res = a;
    float i = 0;
    while (i < b) {
      res = res - 1;
      i = i + 1;
    }
    return res;
  }
  
  public static int perU(int a, int b) {
    int res = 0;
    int i = 0;
    while (i < b) {
      res = res + a;
      i = i + 1;
    }
    return res;
  }

  public static int perD(int a, int b) {
    int res = 0;
    int i = b;
    while (i > 0) {
      res = res + a;
      i = i - 1;
    }
    return res;
  }

  public static int pot(int a, int b) {
    int res = 1;
    int i = 0;
    while (i < b) {
      res = res * a;
      i = i + 1;
    }
    return res;
  }

  public static float pot(float a, int b) {
    float res = 1;
    int i = 0;
    while (i < b) {
      res = res * a;
      i = i + 1;
    }
    return res;
  }
  
  public static int quo(int D, int d) {
    int q = 0;
    int r = D;
    while (r >= d) {
      q = q + 1;
      r = meno(r, d);
    }
    return q;
  }
  
  public static float quo(float D, float d) {
    return D/d;
  }

  public static int resto(int D, int d) {
    int q = 0;
    int r = D;
    while (r >= d) {
      q = q + 1;
      r = meno(r, d);
    }
    return r;
  }

  
  
}