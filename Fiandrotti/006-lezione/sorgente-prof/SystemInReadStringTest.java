public class SystemInReadStringTest{
	public static void main (String[] args){
		System.out.print("In attesa di input: ");
		char c = (char)-1;
		String s = "";
		boolean flagCont = true;
		while(flagCont) {
			c = (char)SIn.read();
			if (c == '\r') {
				SIn.read(); //scarto '\n'
				flagCont = false;
			} else {
				s = s + c;
		}
		System.out.println("Stringa risultante: " + s);
		//Parsing di numeri interi e reali
		//int sInt =  Integer.valueOf(s).intValue();
		//float sFloat =  Float.valueOf(s).floatValue();
	}
}
