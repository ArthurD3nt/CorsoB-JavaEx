//Scrivi un codice che, dato un array, stampi il minimo e il massimo presente all'interno dell'array
import java.util.Scanner;
public class Es10{
    public static void main(String[] args){    
      Scanner input = new Scanner(System.in);
      System.out.println("Quanti numero vuoi inserire?");  
      int n = input.nextInt();
      int []x= new int [n];
      int max=x[0],min=x[0];     
      for(int i=0;i<n;i++){
          try{
          System.out.println("Inserire numero"+(i+1));
          x[i] = (int)input.nextInt();
              if(x[i]>max){
                  max=x[i];
              }else if(x[i]<min){
                  min=x[i];
              }
          }catch(Exception e){
              System.out.println("Numero non valido");
              i--;
          }
      }
        
        System.out.println("Il minimo e' " +min);
        System.out.println("Il massimo e' " +max);    
    }
}