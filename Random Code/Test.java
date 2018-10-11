public class Test {
  public static void main(String[] args) throws InterruptedException {

    System.out.println("Countdown Commencing...");
    Thread.sleep(500);

    for (int i = 3; i >= 0; i--) {
      if (i == 0) {
        System.out.print("GoGoGo!");
      } else {
        System.out.println(i + "...");
        Thread.sleep(1000);
      }
    }
  }  
}