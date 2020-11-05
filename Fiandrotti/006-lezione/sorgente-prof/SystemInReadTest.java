public class SystemInReadTest{
	public static void main (String[] args){

		System.out.print("In attesa di input: ");
		bool flagCont = true;
		while(flagCont) {
			int tasto = SIn.read();
			System.out.println("Codice carattere " + tasto + " -> " + (char)tasto);
			if (tasto == '\n')
				flagCont = false;
		}
	}
}