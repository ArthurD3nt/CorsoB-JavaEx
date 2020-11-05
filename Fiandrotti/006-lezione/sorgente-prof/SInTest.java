public class SInTest
{
  public static void main(String[] args) {
  
    System.out.println("Scrivere un intero non preceduto da spazi" +
                         "e seguito dal \\n.");
    System.out.println("L'intero è:" + SIn.readInt());
    System.out.println("Scrivere un intero preceduto da spazi" +
                         "e seguito dal \\n.");
    System.out.println("L'intero è:" + SIn.readInt());
    System.out.println("Scrivere un intero preceduto e seguito da spazi," +
                         " concludendo con \\n.");
    System.out.println("L'intero è:" + SIn.readInt());
    System.out.println("Scrivere due interi separati da almeno uno spazio," +
                         " concludendo con \\n.");
    System.out.println("Il primo intero è:" + SIn.readInt());
    System.out.println("Il secondo intero è:" + SIn.readInt());
    
    System.out.println("Scrivere un float (ccc.cc ad esempio).");
    System.out.println("Il float è:" + SIn.readLineFloat());
  }
} 
