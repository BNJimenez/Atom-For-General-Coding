/*
 * All recursive methods written in class
 * A recursive algorithm must:
 * 1. hava a base case
 * 2. change its state and move toward the base case (recursive step)
 * 3. call itself, recursively
 */

public class FibonacciNumbers {

  public static int fibonacci (int n) {

    if (n == 1 || n == 2) { // base case
      return 1;
    } else {
      IO.reportBadInput();
    } /*else {
      int result = fibonacci(n-1) + fibonacci(n-2); // recursive step
      return result;
    }*/
  }


  public static void main (String[] args) {

    System.out.println("n-th number of the sequence?");
    int n = IO.readInt();
    System.out.println("Result: " + fibonacci(n));
    /*IO.outputIntAnswer(fibonacci(-4));
    IO.outputIntAnswer(fibonacci(1));
    IO.outputIntAnswer(fibonacci(2));
    IO.outputIntAnswer(fibonacci(3));
    IO.outputIntAnswer(fibonacci(4));
    IO.outputIntAnswer(fibonacci(5));
    IO.outputIntAnswer(fibonacci(6));
*/
  }
}
