/*Scrivere un programma che stampi a video i primi dieci interi pari compresi fra 20 e 0, partendo da 20. */
public class Es2{
    public static void main(String[] args){
        int a;
        for(a=20;a>=0;a=a-1){
            if(a%2==0){
                System.out.println(a);
            }
        }
    }
}