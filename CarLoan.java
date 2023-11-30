public class CarLoan {
  int carLoan;
  int loanLength;
  int interestRate;
  int downPayment;
  
  public CarLoan(int paramCarLoan, int paramLoanLength, int paramInterestRate, int paramDownPayment) {
    carLoan = paramCarLoan;
    loanLength = paramLoanLength;
    interestRate = paramInterestRate;
    downPayment = paramDownPayment;
  }

  public void monthlyPayment() {
    if (loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
    } else if (downPayment >= carLoan) {
      System.out.println("The car can be paid in full.");
    } else {
      int remainingBalance;
      int months;
      int monthlyBalance;
      int interest;
      int monthlyPayment;

      remainingBalance = carLoan - downPayment;
      months = loanLength * 12;
      monthlyBalance = remainingBalance / months;
      interest = monthlyBalance * interestRate / 100;
      monthlyPayment = monthlyBalance + interest;

      System.out.println(monthlyPayment);
    }
  }

	public static void main(String[] args) {
    CarLoan carloan1 = new CarLoan(10000, 3, 5, 2000);
    //System.out.println(carloan1.carLoan);
    carloan1.monthlyPayment();
  

	}
}
