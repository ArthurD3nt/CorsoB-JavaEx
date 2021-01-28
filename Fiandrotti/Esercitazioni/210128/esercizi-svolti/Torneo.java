public class Torneo {

    //trova indice di una parola all'interno di un array
    public static int trovaIndex (String a, String[]arr) {

        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (a == arr[i]){
                index = i;
                break;
            };
        }
        return index;
    }

    //in base ai risultati delle partite assegna i punti
    public static void score(String[]sqc, String[]sqo, int[]gc, int[]go, int[]score, String[]name){
        if(sqc.length != sqo.length || gc.length != go.length) System.out.println("ERROR: Dati inseriti non validi. \n li array non contengono lo stesso numero di elementi");
        else if (sqc.length == sqo.length && gc.length == go.length) {      //a questo punto gli array sono per forza uguali

            for (int i = 0; i<sqc.length; i++){     //for loop per iterare all'interno degli array
                if (gc[i] == go[i]){

                    score[trovaIndex(sqo[i],name)] += 1;
                    score[trovaIndex(sqc[i],name)] += 1;

                }else if (gc[i] < go [i]){

                    score[trovaIndex(sqo[i],name)] += 2;

                }else if (gc[i] > go [i]){

                    score[trovaIndex(sqc[i],name)] += 2;

                }else{
                    System.out.println("ERROR: unknown");
                }
            }
        } else System.out.println("ERROR: unknown");
    }


    //bubble sort per i 2 array
    public static void sort(String[]b, int[]a, int[]score, String[]name) {
        for(int i = 0; i < a.length; i++) {
            boolean flag = false;
            for(int j = 0; j < a.length-1; j++) {
                if(a[j]>a[j+1]) {
                    int k = a[j];
                    String z = b[j];
                    a[j] = a[j+1];
                    b[j] = b[j+1];
                    a[j+1] = k;
                    b[j+1] = z;
                    flag=true; 
                }
            }
        if(!flag) break;  
        }

        name = b;
        score = a;
    }

    //stampa l'array formattato come voglio io
    public static void print(int[]score, String[]name) {
        System.out.println("I risultati sono");
        for(int i = score.length -1; i >= 0 ; i--){
            System.out.println(i+1+". "+name[i]+": "+score[i]);
        };
    }

    public static void testCase(int[]score){
            System.out.println(score[2] == 3);
            System.out.println(score[1] == 2);
            System.out.println(score[0] == 1);
    }

    public static void main(String[] args) {

        String [] sqC = {"Torino", "Roma", "Napoli"};
        String [] sqO = {"Roma", "Napoli", "Torino"};
        int [] gC = {1, 0, 2};
        int [] gO = {1, 2, 3};

        //arrays per leaderboard
        String [] name = sqC;
        int [] score = new int[sqC.length];

        //non avevo voglia di scrivere un wrapper
        score(sqC, sqO, gC, gO, score, name);

        sort(name, score, score, name);

        testCase(score);

        print(score, name);
    
    }
}