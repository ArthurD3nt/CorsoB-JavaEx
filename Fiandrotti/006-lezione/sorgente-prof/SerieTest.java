import java.lang.Math;

public class SerieTest {

  public static void main(String[] args) {
    
    final float ERRORE = 0.5f; // errore ritenuto ragionevole
    
    int q, n; // parametri di input
    float output, outputAtteso;

	// Test prima serie
	q = 2; n = 4;
	outputAtteso = (1 - Aritmetica.pot(q, n + 1))/(1 - q);
	output = Serie.primaSerieV2(q, n);
	System.out.println("Serie.s1(" + q + "," + n + ") returns " + output + " vs. " + outputAtteso + " -> " + SerieTest.compareEpsilon(output, outputAtteso, ERRORE));
	
	// Test seconda serie
	n = 100;
	outputAtteso = Aritmetica.quo(Aritmetica.pot((float)Aritmetica.pi, 2), 6);
	output = Serie.secondaSerie(n);
	System.out.println("Serie.s2(" + n + ") returns " + output + " vs. " + outputAtteso + " -> " + SerieTest.compareEpsilon(output, outputAtteso, ERRORE));
	
	// Test terza serie
	n = 100;
	outputAtteso = Aritmetica.quo(Aritmetica.pot((float)Aritmetica.pi, 2), 8);
	output = Serie.terzaSerie(n);
	System.out.println("Serie.s3(" + n + ") returns " + output + " vs. " + outputAtteso + " -> " + SerieTest.compareEpsilon(output, outputAtteso, ERRORE));

	// Test quarta serie
	n = 100;
	outputAtteso = Aritmetica.quo((float)Aritmetica.pi, 4);
	output = Serie.quartaSerie(n);
	System.out.println("Serie.s4(" + n + ") returns " + output + " vs. " + outputAtteso + " -> " + SerieTest.compareEpsilon(output, outputAtteso, ERRORE));
	
	// Test quinta serie
	int z = 2;
	n = 10;
	outputAtteso = Aritmetica.pot((float)Aritmetica.e, z);
	output = Serie.quintaSerieV2(z, n);
	System.out.println("Serie.s5(" + z + "," + n + ") returns " + output + " vs. " + outputAtteso + " -> " + SerieTest.compareEpsilon(output, outputAtteso, ERRORE));
	
   } 
  
	public static boolean compareEpsilon (float a, float b, float epsilon) {
		float diff = a - b;
		if (diff < 0) 
			diff = -diff;
		
		if (diff < epsilon)
			return true;
		return false;
	}
  
}