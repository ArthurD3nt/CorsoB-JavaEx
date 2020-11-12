public class FattorialeRicorsivo {

    public static void main(String[] args) {
        int n = 6;
        int output = fattorialeRic(n);
        System.out.println("Fattoriale ricorsivo di " + n + " : " + output);
    }
    public static int fattorialeRic(int n) {
        if (n >= 1)
            return n * fattorialeRic(n - 1);
        else
            return 1;
    }
}