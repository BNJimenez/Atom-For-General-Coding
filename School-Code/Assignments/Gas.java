public class Gas {
  public static void main(String[] args) {
    System.out.print("Enter cost of gallon of gas: ");
    double pricePerGallonOfGas = IO.readDouble();
    System.out.print("Enter number of gallons: ");
    double gallonsOfGas = IO.readDouble();
    System.out.print("Is customer paying with a credit card? ");
    boolean payedWithCreditCard = IO.readBoolean();

    double costOfGas = 0;
    if (pricePerGallonOfGas < 0 || gallonsOfGas < 0) {
      IO.reportBadInput();
    } else if (payedWithCreditCard) {
      costOfGas = 1.1 * (pricePerGallonOfGas * gallonsOfGas);
      IO.outputDoubleAnswer(costOfGas);
    } else {
      costOfGas = pricePerGallonOfGas * gallonsOfGas;
      IO.outputDoubleAnswer(costOfGas);
    }
  }
}
