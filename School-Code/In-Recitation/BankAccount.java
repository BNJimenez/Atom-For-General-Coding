
public class BankAccount{

//  instance variables
  private String name;
  private double balance;
  private int accountNum;
  private String address;

//  constructor

  public BankAccount(String n, String ad, int acc) {
    this.name = n;
    this.address = ad;
    this.accountNum = acc;
    this.balance = 0;
  }

//  another constructor

  public BankAccount(String n, String ad, int acc, double sum) {
    this.name = n;
    this.address = ad;
    this.accountNum = acc;
    this.balance = sum;
  }

//  getter

  public int getAccountNum() {
    return this.accountNum;
  }

  public double getBalance() {
    return this.balance;
  }

  public String getName() {
    return this.name;
  }

//  setter

  public void setName(String n) {
    this.name = n;
  }

  public boolean deposit(double amount) {
    if (amount > 0) {
      this.balance += amount;
      return true;
    } else {
      return false;
    }
  }

  public boolean withdraw(double amount) {
    if (amount <= this.balance && amount > 0) {
      this.balance -= amount;
      return true;
    } else {
      return false;
    }
  }

  public boolean transfer(BankAccount one, BankAccount two, double amount) {
    if (one.withdraw(amount)) {
      two.deposit(amount);
      return true;
    } else {
      return false;
    }
  }
}
