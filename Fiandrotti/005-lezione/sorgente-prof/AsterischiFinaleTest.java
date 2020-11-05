class  AsterischiFinaleTest {
  
  public static void main(String[] args) {
  
      System.out.println("--- Riga");
      AsterischiFinale.riga(0,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.riga(2,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.riga(10,'*'); AsterischiFinale.aCapo();
    
      System.out.println("--- Rettangolo");
      AsterischiFinale.rettangolo(0,0,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.rettangolo(0,1,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.rettangolo(0,2,'*'); AsterischiFinale.aCapo(); 
      AsterischiFinale.rettangolo(1,0,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.rettangolo(1,1,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.rettangolo(1,2,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.rettangolo(5,5,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.rettangolo(5,7,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.rettangolo(7,5,'*'); AsterischiFinale.aCapo();

      System.out.println("--- Triangolo Eq Sx");
      AsterischiFinale.triangoloEqSx(0,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.triangoloEqSx(1,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.triangoloEqSx(2,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.triangoloEqSx(3,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.triangoloEqSx(4,'*'); AsterischiFinale.aCapo(); 

      System.out.println("--- Triangolo Rovesciato Eq Sx");
      AsterischiFinale.triangoloRovEqSx(0,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.triangoloRovEqSx(1,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.triangoloRovEqSx(2,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.triangoloRovEqSx(3,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.triangoloRovEqSx(4,'*'); AsterischiFinale.aCapo();

      System.out.println("--- Triangolo Rovesciato Eq Dx");
      AsterischiFinale.triangoloRovEqDx(0,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.triangoloRovEqDx(1,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.triangoloRovEqDx(2,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.triangoloRovEqDx(3,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.triangoloRovEqDx(4,'*'); AsterischiFinale.aCapo();

      System.out.println("--- Triangolo Eq Dx");
      AsterischiFinale.triangoloEqDx(0,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.triangoloEqDx(1,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.triangoloEqDx(2,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.triangoloEqDx(3,'*'); AsterischiFinale.aCapo();
      AsterischiFinale.triangoloEqDx(4,'*'); AsterischiFinale.aCapo();
   
      System.out.println("--- Tetto");
      AsterischiFinale.tetto(0,'*'); AsterischiFinale.aCapo();      
      AsterischiFinale.tetto(1,'*'); AsterischiFinale.aCapo();      
      AsterischiFinale.tetto(2,'*'); AsterischiFinale.aCapo();      
      AsterischiFinale.tetto(3,'*'); AsterischiFinale.aCapo();      
      AsterischiFinale.tetto(4,'*'); AsterischiFinale.aCapo();
   
      System.out.println("--- Palazzo");
      AsterischiFinale.tetto(4,'*'); AsterischiFinale.aCapo();      
      AsterischiFinale.rettangolo(15,7,'*'); AsterischiFinale.aCapo();
  }
}