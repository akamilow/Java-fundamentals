public class FizzBuzz {

    static void fizzBuzz(int num) {
        for(int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i +" FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i +" Buzz");
            } else if (i % 5 == 0) {
                System.out.println(i +" Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        fizzBuzz(20);
    }
}
