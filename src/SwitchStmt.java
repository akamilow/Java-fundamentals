public class SwitchStmt {
    public static void main(String[] args) {
        System.out.println("----------");

        Switch s = new Switch();
        s.switchStmt();

        System.out.println("----------");
    }
}

class Switch {
    public String seasons = "summer";

    public void switchStmt() {
        switch(seasons) {
            case "spring":
              System.out.println("We are in " + seasons);
              break;
            case "summer":
              System.out.println("We are in " + seasons);
              break;
            case "fall":
              System.out.println("We are in " + seasons);
              break;
            case "winter":
              System.out.println("We are in " + seasons);
              break;
            default:
            System.out.println("It's not a season");
          }
    }
}