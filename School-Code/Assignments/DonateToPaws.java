//10-25-18
//Programming Assignment 3.2

public class DonateToPaws {
  public static void main(String[] args) {

    System.out.print("Enter donation amount: ");
    double donationAmount = IO.readDouble();

    IO.outputDoubleAnswer(donationFee(donationAmount));
  }

  public static double donationFee(double donationAmount) {
    double fee = 0;
/*
    if (donationAmount <= 0) {
      IO.reportBadInput();
    } else */
    if (donationAmount <= 150) {
      fee = 3;
    } else if (donationAmount < 1500) {
      fee = donationAmount * 0.04;
      if (fee < 8) {
        fee = 8;
      }
    } else if (donationAmount < 15000) {
      fee = donationAmount * 0.01;
      if (fee < 20) {
        fee = 20;
      }
    } else if (donationAmount < 19000) {
      fee = 150 + (donationAmount - 15000) * 0.02;
    } else {
      fee = 230 + (donationAmount - 19000) * 0.03;
    }
      /*fee += 150;
      donationAmount -= 15000
      if (donationAmount >= 4000) {
        fee += 80;
        donationFee -= 4000;
        if (donationAmount > 0) {
          fee += donationAmount * 0.03;*/
    return fee;
  }
}
