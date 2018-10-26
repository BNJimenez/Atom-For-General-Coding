public class BankAccountTester{
  public static void main(String[] args) {

    BankAccount one = new BankAccount("Brian", "9 Orchard Road", 12345);
    BankAccount two = new BankAccount("Alex", "College Ave", 67890, 50);

    one.deposit(75);

    System.out.println(one.getBalance());
    System.out.println(two.getBalance());

    one.withdraw(10);
    System.out.println("After withdraw " + one.getBalance());

    one.transfer(two, one, 25);

    System.out.println("New values");
    System.out.println(one.getBalance());
    System.out.println(two.getBalance());
  }
}
