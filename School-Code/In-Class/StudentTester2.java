//  10/23/18
//  instanceof
public class StudentTester2 {
  public static void main(String[] args) {
    Student s1 = new Student();
    if (s1 instanceof Student) {
      System.out.println("s1 is an instance of Object");
    } else {
      System.out.println("s1 is NOT an instance of Student");
    }
    System.out.println(s1);
  }
}
