//10-26-18
//Programming Assignment 3.1

public class TwoLargest {
  public static void main(String[] args) {
    double largest = 0;
    double secondLargest = 0;
    double x = 0;

    System.out.print("Enter a sequence of real numbers (the first number " +
    "entered does not \ncount and will become a terminating value. You will " +
    "be prompted to \ncontinue entering values until you enter at least two " +
    "unique values \nand THEN reenter the same terminating value: ");

    double terminatingValue = IO.readDouble();

    while ((x != terminatingValue || secondLargest == 0)) {
      "terminating value \nAFTER you have entered AT LEAST two unique " +
      System.out.print("Enter a new value, or if you are done reenter the " +
      "values: ");
      x = IO.readDouble();

      if (x == terminatingValue && (largest == 0 || secondLargest == 0)) {
        continue;
      }

      if (x == terminatingValue && largest != 0 && secondLargest != 0) {
        break;
      } else if (largest == 0) {
        largest = x;
      } else if (secondLargest == 0) {
        if (x > largest) {
          secondLargest = largest;
          largest = x;
        } else {
          secondLargest = x;
        }
      } else if (x > largest) {
        secondLargest = largest;
        largest = x;
      } else if (x > secondLargest) {
        secondLargest = x;
      }
    }

    IO.outputDoubleAnswer(largest);
    IO.outputDoubleAnswer(secondLargest);
  }
}
