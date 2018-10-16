public class BuyingApples {
  public static void main(String[] args) {
    System.out.print("Enter cost per LB: ");
    double costPerPound = IO.readDouble();
    System.out.print("Enter number of pounds: ");
    double pounds = IO.readDouble();

    if (costPerPound < 0 || pounds < 0) {
      IO.reportBadInput();
    } else {
      IO.outputDoubleAnswer(costPerPound * pounds);
    }
  }
}
