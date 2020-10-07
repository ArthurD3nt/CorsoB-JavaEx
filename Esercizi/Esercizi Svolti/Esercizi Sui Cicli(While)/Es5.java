/*Scrivere un programma che calcoli il risultato dell’esame di uno studente.
Il programma prenderà in ingresso:
Il voto ottenuto nella prova scritta (variabile tra -8 e +8)
Il voto ottenuto nella prova pratica (variabile tra 0 e 24)
Memorizzati questi dati procederà al calcolo del risultato finale in trentesimi procedendo come segue:

Il risultato finale è la somma dei risultati.
se il voto di teoria è minore (o uguale) di zero e la somma dei voti di teoria e pratica è maggiore di 18 lo studente è bocciato.
se il voto di teoria è minore (o uguale) di zero e il voto di pratica è minore di 18 il programmalo studente è bocciato.
se il voto di teoria è maggiore di zero e la somma dei voti di teoria e pratica è minore di 18lo studente è bocciato.
se la somma di teoria e pratica vale 31 o 32 il programma stampa: congratulazioni: 30 e lode
in tutti gli altri casi lo studente è promosso e viene riportato il voto calcolato.*/
import java.util.Scanner;
public class Es5{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Inserire voto teorico: ");
  int a =input.nextInt();
  while(a<-8 || a>8){
   System.out.println("Voto non valido, inserire voto teorico: ");  
   a = input.nextInt();
  }
  System.out.println("Inserire voto Pratico: ");
  int b =input.nextInt();
  while(b<0 || b>24){
   System.out.println("Voto non valido, inserire voto Pratico: ");  
   b = input.nextInt();
  }    
  int c=a+b;
  if(c>=31 && c<=32){
      System.out.println("Promosso,30 e lode");
  }else if(a>0 && c>18){
     System.out.println("Promosso");
  }else{
      System.out.println("Bocciato");
  }   
}
}