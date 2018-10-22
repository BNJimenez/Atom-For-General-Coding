//  10/16/18
//  Working with the Student Object
public class StudentTester {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student Ben = new Student("Ben", "Plotnick");

    System.out.println(s1);
    System.out.println(s1.getFirstName());
    System.out.println(Ben.getFirstName() + " " + Ben.getLastName());
  }
}
