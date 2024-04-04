import java.util.Random;
class Main {
  public static void main(String[] args) {
    String name="Logan";
    Random random = new Random();
    int randomNumber = random.nextInt(3);
    switch(randomNumber){
      case 0:
        name=name.toUpperCase();
        break;
      case 1:
        name=name.substring(0,3);
        break;
          case 2:
        name=name.concat(name);
        break;
    }
    System.out.println("Transformed name: "+name);
    switch(name){
      case "LOGAN":
        printsad();
        break;
      case "LOG":
        printbob();
        break;
      case "LOGANLOGAN":
        printfly();
        break;
    }
  }
  private static void printsad(){
    System.out.println("T^T");
  }
  private static void printbob(){
    System.out.println("*o*");
  }
  private static void printfly(){
    System.out.println(".");
  }
}