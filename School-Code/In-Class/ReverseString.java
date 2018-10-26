//  10-25-18
//  Working with strings


public class ReverseString{
  public static void main(String[] args) {
    String s = "Brian";
    System.out.println(s.substring(1,s.length()-1));

    System.out.println("Enter a word: ");
    System.out.println(checkPalindrome(IO.readString()));
    System.out.println(checkPalindromeWithPairs(IO.readString()));


  }

  public static String reverseString(String regular) {
    String reverse = "";
    for (int i = regular.length() - 1; i >= 0; i--) {
      reverse = reverse + regular.charAt(i);
      System.out.println(reverse);
    }
    return reverse;
  }

  public static boolean checkPalindrome(String word) {
    return word.equals(reverseString(word));
  }

  public static boolean checkPalindromeWithPairs(String word) {
    int length = word.length();
    for (int i = 0; i < length; i++) {
      if (word.charAt(i) != word.charAt(length - 1 - i)) {
        return false;
      }
    }

    return true;
  }

  public static boolean checkPalindromeWithRecursion(String word) {
    if (word.length() <= 1) {
      return true;
    } else if (word.charAt(0) !=  word.charAt(word.length() - 1)) {
      return false;
    } else {
      return checkPalindromeWithRecursion(word.substring(1, word.length() - 1));
    }
  }
}
