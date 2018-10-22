//10-26-18
//Programming Assignment 3.1

public class TwoLargest {
  public static void main(String[] args) {
    double largest = 0;
    double secondLargest = 0;
    double x = 0;

    System.out.print("Enter a sequence of real numbers (the first number ");
    System.out.print("entered does not count and will become a terminating ");
    System.out.print("value. You will be prompted to continue entering ");
    System.out.print("values until you enter at least two unique values and ");
    System.out.print("THEN reenter the same terminating value:");

    double terminatingValue = IO.readDouble();

/*    System.out.print("Enter a new value, or if you are done reenter the ");
    System.out.print("terminating value AFTER you have entered AT LEAST ");
    System.out.print("two unique values: ");
    x = IO.readDouble();
    largest = x;
*/

    while ((x != terminatingValue || secondLargest == 0)) {
      System.out.print("Enter a new value, or if you are done reenter the ");
      System.out.print("terminating value AFTER you have entered AT LEAST ");
      System.out.print("two unique values: ");
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
//    System.out.print("Largest: " + largest + "\nSecond Largest: " + secondLargest);
  }
}
