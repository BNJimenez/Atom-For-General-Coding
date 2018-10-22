<<<<<<< HEAD
//10-12-18
//Programming Assignment 2.4

=======
>>>>>>> dc5e71406450536d94e4cd1e24e1ab3eaa1c8fdc
public class Zoo {
  public static void main(String[] args) {
    System.out.print("Enter number of Zoos: ");
    int numZoos = IO.readInt();
    int totalGiraffes = 0;
    int totalLions = 0;
    int totalSnakes = 0;

    for (int i = 1; i <= numZoos; i++){
      System.out.print("Enter number of giraffes for zoo " + i + ": ");
      int numGiraffes = IO.readInt();
      System.out.print("Enter number of lions for zoo " + i + ": ");
      int numLions = IO.readInt();
      System.out.print("Enter number of snakes for zoo " + i + ": ");
      int numSnakes = IO.readInt();

      totalGiraffes += numGiraffes;
      totalLions += numLions;
      totalSnakes += numSnakes;
    }
    IO.outputIntAnswer(totalGiraffes);
    IO.outputIntAnswer(totalLions);
    IO.outputIntAnswer(totalSnakes);
  }
}
