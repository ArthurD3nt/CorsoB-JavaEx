class  AsterischiFinale {
  
  /* Rettangolo con n x m copie del carattere c*/
  public static void rettangolo(int n, int m, char c) {
    int i = 0;
    while(i < n - 1) {
      riga(m,c); aCapo();
      i = i + 1;
    }
    if (n > 0)
      riga(m,c);
  }

  /* Riga con n copie del carattere c*/
  public static void riga(int n, char c) {
    int i = 0;
    while(i < n) {
      System.out.print(c);
      i = i + 1;
    }
  }

  /* Triangolo equilatero sinistro di altezza e base x */
  public static void triangoloEqSx(int x, char c) {
    int i = 0;
    while(i <= x) {
      riga(i,c); aCapo();
      i = i + 1;
    }
  }

  /* Triangolo equilatero rovesciato sinistro di altezza e base x */
  public static void triangoloRovEqSx(int x, char c) {
    int i = x;
    while(i > 0) {
      riga(i,c); aCapo();
      i = i - 1;
    }
  }

  /* Triangolo equilatero rovesciato destro di altezza e base x */
  public static void triangoloRovEqDx(int x, char c) {
    int i = 0;
    while(i < x) {
      riga(i,' '); riga(x-i,c); aCapo();
      i = i + 1;
    }
  }

  /* Triangolo equilatero destro di altezza e base x */
  public static void triangoloEqDx(int x, char c) {
    int i = 0;
    while(i < x) {
      riga(x-(i+1),' '); riga(i+1,c); aCapo();
      i = i + 1;
    }
  }

  /* Tetto di altezza x e base 2x+1 */
  public static void tetto(int x, char c) {
    int i = 1;
    while(i <= x) {
      int nonSpazi = 2*i-1;
      int spazi = ((2*x-1)-(2*i-1))/2;
      riga(spazi,' '); 
      riga(nonSpazi,c);
      riga(spazi,' '); 
      aCapo();
      i = i + 1;
    }
  }
 
  public static void aCapo() {
      System.out.println();
  }
}