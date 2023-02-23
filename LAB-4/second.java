class Account {
  String custName, acNo, type, branch;

  public Account(String custName, String acNo, String type, String branch) {
    this.custName = custName;
    this.acNo = acNo;
    this.type = type;
    this.branch = branch;
  }

  void getCustInfo() {
    System.out.println("Customer Name: " + custName);
    System.out.println("Account Number: " + acNo);
    System.out.println("Account Type: " + type);
    System.out.println("Branch: " + branch);
  }

  void displayInfo() {
    getCustInfo();
  }
}

class Saving extends Account {
  double amount, rate, year, interest;
  static final double SAVING_RATE = 3.5;

  public Saving(String custName, String acNo, String type, String branch, double amount, double year) {
    super(custName, acNo, type, branch);
    this.amount = amount;
    this.year = year;
  }

  void getSavingInfo() {
    System.out.println("Amount: " + amount);
    System.out.println("Year: " + year);
  }

  double callAmt() {
    interest = (amount * SAVING_RATE * year) / 100;
    return interest;
  }

  @Override
  void displayInfo() {
    super.displayInfo();
    getSavingInfo();
    System.out.println("Interest: " + callAmt());
  }
}

class FixedDeposit extends Account {
  double amount, rate, year, interest;

  public FixedDeposit(String custName, String acNo, String type, String branch, double amount, double year) {
    super(custName, acNo, type, branch);
    this.amount = amount;
    this.year = year;
  }

  void getInfo() {
    System.out.println("Amount: " + amount);
    System.out.println("Year: " + year);
  }

  double callAmt() {
    if (year <= 2) {
      rate = 6.5;
    } else if (year > 2 && year <= 5) {
      rate = 7.5;
    } else if (year > 5 && year <= 10) {
      rate = 8.5;
    } else {
      rate = 9;
    }
    interest = (amount * rate * year) / 100;
    return interest;
  }

  @Override
  void displayInfo() {
    super.displayInfo();
    getInfo();
    System.out.println("Interest: " + callAmt());
  }
}

public class Bank {
  public static void main(String[] args) {
    Saving s = new Saving("John Doe", "SA12345", "Saving", "ABC Branch", 10000, 5);
    s.displayInfo();

    System.out.println("\n");

    FixedDeposit fd = new FixedDeposit("Jane Doe",
