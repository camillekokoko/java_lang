public class CheckingAccount{
  public String name; //change from private to public
  private int balance;
  private String id;

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    name = inputName; 
    balance = inputBalance;
    id = inputId;
  }

  //change from private to public
  public void addFunds(int fundsToAdd){ 
    balance += fundsToAdd;
  }

  public void getInfo(){
    System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
  }

}
