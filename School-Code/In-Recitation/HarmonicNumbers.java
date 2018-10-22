public class HarmonicNumbers {
  public static void main(String[] args) {
    System.out.print("Input an integer above zero to find its harmonic: ");
    int a = IO.readInt();
    IO.outputDoubleAnswer(harmonic(a));
  }

  public static double harmonic (int x) {
    if (x == 1) {
      return 1;
    } else {
      return ((double) 1) / x + harmonic(x-1);
    }
  }
}
