public class Cycles {
    public static void main(String[] args) {
        System.out.println("----------");

        While w = new While();
        w.whileCycle(0);

        System.out.println("----------");

        Do d = new Do();
        d.doCycle(0);

        System.out.println("----------");

        For f = new For();
        f.forCycle();

        System.out.println("----------");
    }
}

class While {
    public int num;

    public void whileCycle(int num) {
        while (num <= 5) {
            System.out.println(num);
            num++;
        }
    }

}

class Do {
    public int num;

    public void doCycle(int num) {
        do {
            System.out.println(num);
            num++;
        } while (num <= 5);
    }
}

class For {
    public int num;

    public void forCycle() {
        for (num = 0; num <= 5; num++ ) {
            System.out.println(num);
        }
    }
}