public class SavingsAccount {
  
  int balance;
  String name;
  String branch;
  int accountNum;
  
  public SavingsAccount(int initialBalance, String accountName, String accountBranch, int accountNum){
    balance = initialBalance;
    name = accountName;
    branch = accountBranch;
    accountNum = accountNum;
  }

  public String toString(){
    return name + "" + branch + "" + accountNum;
  }
  public void checkBalance(){
    System.out.println("Hello!");
    System.out.println("Your balance is "+ balance);
  }

  public void deposit(int amountToDeposit){
    balance += amountToDeposit;
    System.out.println("You just deposited "+ balance);
  }

  public int withdraw(int amountToWithdraw){
    balance -= amountToWithdraw;
    System.out.println("You just withdrew "+ amountToWithdraw);
    return amountToWithdraw;
  }

  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000, "Alex", "Adelaide", 123456);

    System.out.println(savings);
  
    //Check balance:
    savings.checkBalance();
    
    //Withdrawing:
    savings.withdraw(300);

    //Check balance:
    savings.checkBalance();
    //Deposit:
    savings.deposit(600);
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    savings.checkBalance();    
  }       
}

--------------------------------



public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }
  
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Withdrawing:
    int afterWithdraw = savings.balance - 300;
    savings.balance = afterWithdraw;
    System.out.println("You just withdrew "+300);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Deposit:
    int afterDeposit = savings.balance + 600;
    savings.balance = afterDeposit;
    System.out.println("You just deposited "+600);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Deposit:
    int afterDeposit2 = savings.balance + 600;
    savings.balance = afterDeposit2;
    System.out.println("You just deposited "+600);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
  }       
}
