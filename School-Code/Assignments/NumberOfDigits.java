<<<<<<< HEAD
//10-12-18
//Programming Assignment 2.5

=======
>>>>>>> dc5e71406450536d94e4cd1e24e1ab3eaa1c8fdc
public class NumberOfDigits {

  public static void main (String[] args) {

    System.out.print("Enter an integer: ");
    int number = IO.readInt();
    int digits = 0;

    if (number < 0) {
      IO.reportBadInput();
    } else {
      while ( number >= 1 ) {
        digits++;
        number = number / 10;
      }
      IO.outputIntAnswer(digits);
    }
  }
}
