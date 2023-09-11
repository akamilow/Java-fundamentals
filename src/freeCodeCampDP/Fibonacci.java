package freeCodeCampDP;

public class Fibonacci {

    public static void fibonacci() {
        int n = 10;
        int[] fibNumbers = new int[n];
        
        fibNumbers[0] = 0;
        fibNumbers[1] = 1;

        System.out.println(0);
        System.out.println(1);
        
        for (int i = 2; i < n; i++) {
            System.out.println(fibNumbers[i] = fibNumbers[i - 1] + fibNumbers[i - 2]);
        }
    }

    public static void main(String[] args) {
        fibonacci();
    }
}
