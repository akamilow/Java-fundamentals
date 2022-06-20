public class NumberChecker {
    public static void main(String[] args) {
        System.out.println("---------------------");

        If ifStmt = new If();
        ifStmt.checkNumber(9090);

        System.out.println("---------------------");
    }
}

class If {
    public int num; 

    public void checkNumber(int num) {
        if (num > 0) {
            System.out.println("The number "+num+" is  positive");
        } else if (num < 0) {
            System.out.println("The number "+num+" is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}