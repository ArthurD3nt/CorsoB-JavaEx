public class Combinazioni {

public static void main(String[] args) {
    
	int n = 0, k = 0;
	
	boolean inputCorretto = false;
	
	while (inputCorretto == false) {
		inputCorretto = true;
		System.out.print("Numero di carte nel mazzo n: ");
		n = SIn.readInt();
		System.out.print("Numero di carte estratte k: ");
		k = SIn.readInt();
		
		if (k>n) {
			System.out.println("ERROR, k deve essere minore o uguale a n ");
		}
	}
	
	int output  = binomiale (n, k);
	System.out.println("Da un mazzo di " + n + " carte si possono estrarre " + output + " diverse combinazioni di " + k + " carte l'una" );
}

public static int binomiale(int n, int k) {
	return Aritmetica.quo(fattoriale(n), Aritmetica.perU(fattoriale(k), fattoriale(n-k)));
}

public static int fattoriale(int n) {
	int k = 1;
	int ret = 1;
	while (k <= n) {
		ret = Aritmetica.perU(ret, k);
		k = k + 1;
	}
	//System.out.println("fattoriale("+n+") -> " + ret);
	return ret;
}

}