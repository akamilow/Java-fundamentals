public class AddDoors {
    public static void main(String[] args) {
        System.out.println("-----------");

        Car myCar = new Car();
        myCar.addDoors();
        myCar.addDoors();
        System.out.println(myCar.doors);

        System.out.println("-----------");
  
    }
}

class Car {
    int doors;
    public void addDoors() {
        this.doors++;
    }
}
