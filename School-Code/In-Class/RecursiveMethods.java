/*
 * All recursive methods written in class
 * A recursive algorithm must:
 * 1. hava a base case
 * 2. change its state and move toward the base case (recursive step)
 * 3. call itself, recursively
 */

public class RecursiveMethods {

  public static int factorial (int n) {

    if ( n == 0 || n == 1 ) { // base case
      return 1;
    } else {
      int result = n * factorial(n-1); // recursive step
      return result;
    }
  }

  /*
   * Prints "hello" n times
   */
  public static void printHello (int n) {

    if ( n == 0 ) {
      return;
    } else {
      System.out.print("hello ");
      printHello(n-1);
    }
  }
  public static void main (String[] args) {

    IO.outputIntAnswer(factorial(0));
    IO.outputIntAnswer(factorial(4));
    IO.outputIntAnswer(factorial(5));

    printHello(4);
  }
}
