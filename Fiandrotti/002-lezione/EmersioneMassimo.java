public class EmersioneMassimo {
    public static void main (String[] args) {
        //4 variabili randomizzate
        int a = (int)(Math.random()*100);
        int b = (int)(Math.random()*100);
        int c = (int)(Math.random()*100);
        int d = (int)(Math.random()*100);

        int tmp; //variabile di appoggio 
        int i = 0; //variabile per il calcolo del numero di iterazioni
        while (!(a <= b && b <= c && c <= d)) {
            if (a > b) {
                tmp = a;
                a = b;
                b = tmp;
            } if (b > c) {
                tmp = b;
                b = c;
                c = tmp;
            } if (c > d) {
                tmp = d;
                d = c;
                c = tmp;
            }
            i++;
        }
        //Printa su command line
        System.out.println("Variabili ordinate: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("Con " + i + " iterazioni");

    }
}