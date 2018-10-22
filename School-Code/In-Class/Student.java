//  10/16/18
//  Student Object
public class Student {
  private String fName;
  private String lName;
  private double gpa;
  private int studentID;

  public Student() {
    fName = "John";
    lName = "Doe";
  }

  public Student(String first, String last) {
    fName = first;
    lName = last;
  }
  public String getFirstName() {
    return fName;
  }

  public String getLastName() {
    return lName;
  }
}
