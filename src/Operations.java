public class Operations {
    public static void main(String[] args) {
        System.out.println("----------");

        Addition addition = new Addition();
        addition.operation(100,100);
        System.out.println(addition.result);

        System.out.println("----------");

        Subtraction subtraction = new Subtraction();
        subtraction.operation(100,50);
        System.out.println(subtraction.result);

        System.out.println("----------");

        Multiplication multiplication = new Multiplication();
        multiplication.operation(100,2);
        System.out.println(multiplication.result);

        System.out.println("----------");

        Division division = new Division();
        division.operation(100,2);
        System.out.println(division.result);
        
        System.out.println("----------");
    }
}

class Addition {
    int a;
    int b;
    int result;

    public void operation(int a, int b) {
        result = a + b;
    }
}

class Subtraction {
    int a;
    int b;
    int c;
    int result;

    public void operation(int a, int b) {
        result = a - b;
    }
}

class Multiplication {
    int a;
    int b;
    int result;

    public void operation(int a, int b) {
        result = a * b;
    }
}

class Division {
    int a;
    int b;
    int c;
    int result;

    public void operation(int a, int b) {
        result = a / b;
    }
}

