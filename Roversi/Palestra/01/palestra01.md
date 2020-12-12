# Palestra numero 1

## Esercizio 1

Scrivere un metodo fD con le seguenti caratteristiche:

* fD ha un parametro formale a di tipo array di interi;
* fD restituisce un array che contiene tutti e soli gli interi dispari inizialmente in a, rispettando l'ordine originale degli elementi;
* fD è wrapper di un paio di metodi ricorsivi con le seguenti caratteristiche:
    * uno contro-variante che conta quanti elementi in a dovranno essere restituiti nell'array risultato;
    * uno co-variante che risolve effettivamente il problema.

Per ipotesi, l'array a passato al metodo fD come parametro attuale non puo' essere null. 

**NOTA:** Il metodo con firma boolean `Arrays.equals(int[],int[])` restituisce true se i due parametri attuali sono array identici elemento per elemento, e false altrimenti.

```java
// Contro-variante
    public static int contaDispari(int[] a, int i) {

    }

    // Co-variante
    public static int fD(int[] a, int i, int[] r) {

    }

    // Wrapper
    public static int[] fD(int[] a) {

    }

  /* Metodi di supporto */
  // Restituisce true se gli array di interi a e b sono uguali
  public static boolean uguali(int[] a, int[] b) {
  return Arrays.equals(a, b);
  }

  // Stampa un array di interi 
  public static void pA(int[][] a) {
    System.out.println(Arrays.toString(a));
  }

```
#

## Esercizio 2
Scrivere un metodo fD con le seguenti caratteristiche:

* fD ha un parametro formale a di tipo array di interi;
* fD restituisce un array che contiene tutti e soli gli interi dispari inizialmente in a, rispettando l'ordine originale degli elementi;
* fD è wrapper di un paio di metodi ricorsivi tali che:
    * il primo è dicotomico e conta quanti elementi in a dovranno essere restituiti nell'array risultato;
    * il secondo è contro-variante e risolve effettivamente il problema.

Per ipotesi, l'array a passato al metodo fD come parametro attuale non puo' essere null. 

**NOTA:** Il metodo con firma boolean `Arrays.equals(int[],int[])` restituisce true se i due parametri attuali sono array identici elemento per elemento, e false altrimenti.
```java
    // Dicotomico
    public static int contaDispari(int[] a, int l, int r) {

    }

    // Contro-variante
    public static int fD(int[] a, int i, int[] r) {

    }

    // Wrapper
    public static int[] fD(int[] a) {

    }

  /* Metodi di supporto */
  // Restituisce true se gli array di interi a e b sono uguali
  public static boolean uguali(int[] a, int[] b) {
  return Arrays.equals(a, b);
  }

  // Stampa un array di interi 
  public static void pA(int[][] a) {
    System.out.println(Arrays.toString(a));
  }
```

#

## Esercizio 3

Scrivere un metodo fMag con le seguenti caratteristiche:

* fMag ha un primo parametro formale a di tipo array di interi ed un secondo parametro formale l di tipo intero;
* fMag restituisce un array che contiene tutti e soli gli interi inizialmente in a e strettamente maggiori del valore in l, rispettando l'ordine originale degli elementi;
* fMag *non* puo' contare il numero di elementi in a che soddisfano la proprieta' indicata per dimensionare opportunamente l'array da produrre come risultato;
* fMag è wrapper di un solo metodo ricorsivo co-variante che risolve effettivamente il problema.

Per ipotesi, l'array a passato al metodo fD come parametro attuale non puo' essere null. 

**NOTA:** Il metodo con firma boolean `Arrays.equals(int[],int[])` restituisce true se i due parametri attuali sono array identici elemento per elemento, e false altrimenti.
```java
    // Co-variante
    private static int[] fMag(int[] a, int l, int i) {

    }

    // Wrapper
    public static int[] fMag(int[] a, int l) {

    }

    /* Metodo contro-variante che copia tmp in r, assumendo 
    che tmp.length<=r.length. */
    private static void copiaDi(int[] tmp, int[] r, int i) {

    }

  /* Metodi di supporto */
  // Restituisce true se gli array di interi a e b sono uguali
  public static boolean uguali(int[] a, int[] b) {
    return Arrays.equals(a, b);
  }

  // Stampa un array di interi 
  public static void pA(int[][] a) {
    System.out.println(Arrays.toString(a));
  }
```
#

## Esercizio 4
Scrivere un metodo fMag con le seguenti caratteristiche:

* fMag ha un primo parametro formale a di tipo array di interi ed un secondo parametro formale m di tipo intero;
* fMag restituisce un array che contiene tutti e soli gli interi inizialmente in a e strettamente maggiori del valore in m, rispettando l'ordine originale degli elementi;
* fMag *non* puo' contare il numero di elementi in a che soddisfano la proprieta' indicata per dimensionare opportunamente l'array da produrre come risultato. La conseguenza è che occorrerà scrivere anche un metodo append (ricorsivo o iterativo) che, dati due array x, ed y di interi, ne costruisce un terzo z la cui prima parte contiene tutti e soli i valori in x e la seconda tutti e soli i valori di y;
* fMag è wrapper di un solo metodo ricorsivo dicotomico che risolve effettivamente il problema.

Per ipotesi, l'array a passato al metodo fD come parametro attuale non puo' essere null.

**NOTA:** Il metodo con firma boolean `Arrays.equals(int[],int[])` restituisce true se i due parametri attuali sono array identici elemento per elemento, e false altrimenti.
```java
    // Dicotomica
    private static int[] fMag(int[] a, int m, int l, int r) {

    }

    // Wrapper
    public static int[] fMag(int[] a, int m) {

    }

    // Appende array y ad array x
    public static int[] append(int[] x, int[] y) {

    }

  /* Metodi di supporto */
  // Restituisce true se gli array di interi a e b sono uguali
  public static boolean uguali(int[] a, int[] b) {
    return Arrays.equals(a, b);
  }

  // Stampa un array di interi
  public static void pA(int[][] a) {
    System.out.println(Arrays.toString(a));
  }
```
#

## Esercizio 5
Scrivere un metodo fMin con le seguenti caratteristiche:

* fMin ha un primo parametro formale a di tipo array di interi ed un secondo parametro formale m di tipo intero;
* fMin restituisce un array che contiene tutti e soli gli interi inizialmente in a e strettamente minori del valore in m, rispettando l'ordine originale degli elementi;
* fMin è wrapper di un paio di metodi ricorsivi con le seguenti caratteristiche:
    * uno co-variante che conta quanti elementi in a dovranno essere restituiti nell'array risultato;
    * uno contro-variante che risolve effettivamente il problema.

Per ipotesi, l'array a passato al metodo fMin come parametro attuale non puo' essere null. 

**NOTA:** Il metodo con firma boolean `Arrays.equals(int[],int[])` restituisce true se i due parametri attuali sono array identici elemento per elemento, e false altrimenti.
```java
    // Co-variante
    public static int contaMinori(int[] a, int m, int i) {

    }

    // Contro-variante
    public static int fMin(int[] a, int m, int i, int[] r) {

    }

    // Wrapper
    public static int[] fMin(int[] a, int m) {

    }

  /* Metodi di supporto */
  // Restituisce true se gli array di interi a e b sono uguali
  public static boolean uguali(int[] a, int[] b) {
    return Arrays.equals(a, b);
  }

  // Stampa un array di interi 
  public static void pA(int[][] a) {
    System.out.println(Arrays.toString(a));
  }
```
#

## Esercizio 6
Scrivere un metodo fMin con le seguenti caratteristiche:

* fMin ha un primo parametro formale a di tipo array di interi ed un secondo parametro formale m di tipo intero;
* fMin restituisce un array che contiene tutti e soli gli interi inizialmente in a e strettamente minori del valore in m, rispettando l'ordine originale degli elementi;
* fMin è wrapper di un paio di metodi con le seguenti caratteristiche:
    * il primo è ricorsivo dicotomico conta quanti elementi in a dovranno essere restituiti nell'array risultato;
    * il secondo è ricorsivo co-variante e risolve effettivamente il problema.

Per ipotesi, l'array a passato al metodo fMin come parametro attuale non puo' essere null. 

**NOTA:** Il metodo con firma boolean `Arrays.equals(int[],int[])` restituisce true se i due parametri attuali sono array identici elemento per elemento, e false altrimenti.
```java
    // Dicotomico
    public static int contaMinori(int[] a, int m, int l, int r) {

    }

    // Co-variante
    public static int fMin(int[] a, int m, int i, int[] r) {

    }

    // Wrapper
    public static int[] fMin(int[] a, int m) {

    }

  /* Metodi di supporto */
  // Restituisce true se gli array di interi a e b sono uguali
  public static boolean uguali(int[] a, int[] b) {
    return Arrays.equals(a, b);
  }

  // Stampa un array di interi 
  public static void pA(int[][] a) {
    System.out.println(Arrays.toString(a));
  }
```
#

## Esercizio 7
Scrivere un metodo fPosDValD con le seguenti caratteristiche:

* fPosDValD ha un parametro formale a di tipo array di interi;
* fPosDValD restituisce un array che contiene il doppio di tutti e soli gli interi di posizione dispari inizialmente in a, rispettando l'ordine originale degli elementi;
* fPosDValD è wrapper un metodo metodo ricorsivo contro-variante che risolve effettivamente il problema.

Per ipotesi, l'array a passato al metodo fPosDValD come parametro attuale non puo' essere null. 

**NOTA:** Il metodo con firma boolean `Arrays.equals(int[],int[])` restituisce true se i due parametriattuali sono array identici elemento per elemento, e false altrimenti.
```java
    // Contro-variante
    public static int fPosDValD(int[] a, int i, int[] r) {

    }

    // Wrapper
    public static int[] fPosDValD(int[] a) {

    }

    
  /* Metodi di supporto */
  // Restituisce true se gli array di interi a e b sono uguali
  public static boolean uguali(int[] a, int[] b) {
    return Arrays.equals(a, b);
  }

  // Stampa un array di interi 
  public static void pA(int[][] a) {
    System.out.println(Arrays.toString(a));
  }    

```
#

## Esercizio 8
Scrivere un metodo fPosDValD con le seguenti caratteristiche:

* fPosDValD ha un parametro formale a di tipo array di interi;
* fPosDValD restituisce un array che contiene il doppio di tutti e soli gli interi di posizione dispari inizialmente in a, rispettando l'ordine originale degli elementi;
* fPosDValD è wrapper un metodo metodo ricorsivo dicotomico che risolve effettivamente il problema.

Per ipotesi, l'array a passato al metodo fPosDValD come parametro attuale deve avere almeno un elemento.

**NOTA:** Il metodo con firma boolean `Arrays.equals(int[],int[])` restituisce true se i due parametri attuali sono array identici elemento per elemento, e false altrimenti.
```java
    // Dicotomico
    public static void fPosDValD(int[] a, int l, int r, int[] ris) {

    }

// Wrapper
    public static int[] fPosDValD(int[] a) {

    }
    
  /* Metodi di supporto */
  // Restituisce true se gli array di interi a e b sono uguali
  public static boolean uguali(int[] a, int[] b) {
    return Arrays.equals(a, b);
  }

  // Stampa un array di interi 
  public static void pA(int[][] a) {
    System.out.println(Arrays.toString(a));
  }
```
#

## Esercizio 9
Scrivere un metodo t con le seguenti caratteristiche:

* t ha un primo parametro formale a di tipo array di interi ed un secondo parametro formale m di tipo intero;
* t restituisce un array di booleani in cui ogni elemento e' true se l'elemento che gli corrisponde in a e' strettamente inferiore al valore in l e false altrimenti;
* t è wrapper di un solo metodo ricorsivo co-variante che risolve effettivamente il problema.

Per ipotesi, l'array a passato al metodo T come parametro attuale non puo' essere null.

**NOTA:** Il metodo con firma boolean `Arrays.equals(int[],int[])` restituisce true se i due parametri attuali sono array identici elemento per elemento, e false altrimenti.
```java
   // Co-variante
    private static void t(int[] a, int m, int i, boolean[] r) {

    }

    // Wrapper
    public static boolean[] t(int[] a, int m) {

    }

  /* Metodi di supporto */
  // Restituisce true se gli array di booleani a e b sono uguali
  public static boolean uguali(boolean[] a, boolean[] b) {
    return Arrays.equals(a, b);
  }

  // Stampe di array
  public static void pABool(boolean[] a) {
    System.out.println(Arrays.toString(a));
  }
  public static void pAInt(int[] a) {
    System.out.println(Arrays.toString(a));
  }
```
#

## Esercizio 10
Scrivere un metodo t con le seguenti caratteristiche:

* t ha un primo parametro formale a di tipo array di interi ed un secondo parametro formale m di tipo intero;
* t restituisce un array di booleani in cui ogni elemento e' true se l'elemento che gli corrisponde in a e' strettamente  inferiore al valore in l e false altrimenti;
* t è wrapper di un solo metodo ricorsivo dicotomico che risolve effettivamente il problema.

Per ipotesi, l'array a passato al metodo T come parametro attuale non puo' essere null.

**NOTA:** Il metodo con firma boolean `Arrays.equals(int[],int[])` restituisce true se i due parametri attuali sono array identici elemento per elemento, e false altrimenti.
```java
   // Co-variante
    private static void t(int[] a, int m, int l, int r, boolean[] ris) {

    }

    // Wrapper
    public static boolean[] t(int[] a, int m) {

    }

  /* Metodi di supporto */
  // Restituisce true se gli array di booleani a e b sono uguali
  public static boolean uguali(boolean[] a, boolean[] b) {
    return Arrays.equals(a, b);
  }

  // Stampe di array
  public static void pABool(boolean[] a) {
    System.out.println(Arrays.toString(a));
  }
  public static void pAInt(int[] a) {
    System.out.println(Arrays.toString(a));
  }
```
#

## Esercizio 11
Scrivere un metodo nDD con le seguenti caratteristiche:

* nDD ha un parametro formale a di tipo array di interi ed un intero n;
* nDD restituisce un nuovo array, rispetto ad a, che contiene tutti e soli i multipli di n che si trovano in a, rispettando l'ordine originale degli elementi;
* nDD è wrapper di un metodo con le seguenti caratteristiche:
    * è ricorsivo dicotomico;
    * risolve effettivamente il problema usando il metodo append, fornito a corredo del testo.

Per ipotesi, il parametro attuale a, passato al metodo nDD, può essere null o può contenere 0 elementi.

**NOTA:** Il metodo con firma boolean `Arrays.equals(int[],int[])` restituisce true se i due parametri attuali sono array identici elemento per elemento, e false altrimenti. Il metodo con firma boolean `Arrays.toString(int[])` restituisce una stringa con gli elementi del parametro formale.
```java
  // Dicotomico
  static int[] nDD(int[] a, int n, int l, int r) {

  }
  
  // Wrapper
  static int[] nDD(int[] a, int n) {

  }
  
  /* Metodi di supporto */
  // Appende array y ad array x
  public static int[] append(int[] x, int[] y) {
      int[] z = new int[x.length+y.length];
      int i;
      for(i = 0; i < x.length; i++)
          z[i] = x[i];
      for(i = 0; i < y.length; i++)
          z[x.length+i] = y[i];
      return z;
  }

  // Restituisce true se gli array di interi a e b sono uguali
  public static boolean uguali(int[] a, int[] b) {
    return Arrays.equals(a, b);
  }

  // Stampa un array di interi
  public static void pA(int[] a) {
    System.out.println(Arrays.toString(a));
  }
```
#

## Esercizio 12
Scrivere un metodo sZD con le seguenti caratteristiche:

* sZD ha un parametro formale a di tipo array di interi;
* sZD è wrapper di un metodo ricorsivo dicotomico che, tramite il meccanismo di aliasing, modifica a sostituendo 0 ad ogni valore pari inizialmente in a;
* sZD restituisce una copia di a, per mezzo dell'assegnamento `int[] b = Array.copyOf(a, a.length)`.

Per ipotesi, il parametro attuale a, passato al metodo sZD, può essere null o può contenere 0 elementi.

**NOTA:** Il metodo con firma boolean `Arrays.equals(int[],int[])` restituisce true se i due parametri attuali sono array identici elemento per elemento, e false altrimenti. Il metodo con firma boolean `Arrays.toString(int[])` restituisce una stringa con gli elementi del parametro formale.
```java
  // Dicotomico
  static void sZD(int[] a, int l, int r) {

  }
  
  // Wrapper
  static int[] sZD(int[] a) {

  }
  
  /* Metodi di supporto */
  // Restituisce true se gli array di interi a e b sono uguali
  public static boolean uguali(int[] a, int[] b) {
    return Arrays.equals(a, b);
  }

  // Stampa un array di interi
  public static void pA(int[] a) {
    System.out.println(Arrays.toString(a));
  }
```
#

## Esercizio 13
Scrivere un metodo sZSD con le seguenti caratteristiche:

* sZSD ha un parametro formale a di tipo array di interi;
* sZSD è wrapper di un metodo ricorsivo dicotomico che, tramite il meccanismo di aliasing, modifica a come segue:
    * ogni valore che si trova nella posizione immediatamente successiva ad una cella con valore pari è sostituito con 0, ammesso che tale cella successiva esista;
    * sZSD restituisce una copia di a, per mezzo dell'assegnamento `int[] b = Array.copyOf(a, a.length)`.

Per ipotesi, il parametro attuale a, passato al metodo sZSD, può essere null o può contenere 0 elementi.

**NOTA:** Il metodo con firma boolean `Arrays.equals(int[],int[])` restituisce true se i due parametri attuali sono array identici elemento per elemento, e false altrimenti. Il metodo con firma boolean `Arrays.toString(int[])` restituisce una stringa con gli elementi del parametro formale.
```java
  // Dicotomico
  static void sZSD(int[] a, int l, int r) {

  }
  
  // Wrapper
  static int[] sZSD(int[] a) {

  }
  
  /* Metodi di supporto */
  // Restituisce true se gli array di interi a e b sono uguali
  public static boolean uguali(int[] a, int[] b) {
    return Arrays.equals(a, b);
  }

  // Stampa un array di interi
  public static void pA(int[] a) {
    System.out.println(Arrays.toString(a));
  }
```
#