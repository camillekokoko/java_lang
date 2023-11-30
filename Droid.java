public class Droid {
  String name;
  int batteryLevel;

  public String toString(){
    return "Hello, I'm the driod: " + name;
  }

  //Constructor method
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }

  public void energyReport(){
    System.out.println(batteryLevel);
  }

  public void energyTransfer(){
    batteryLevel = 100;
  }
  public void performTask(String task){
    batteryLevel -= 10;
    System.out.println(name + " is performing task: " + task);
  }

  public int statingBattery(){
    return batteryLevel;
  }

  public static void main(String[] args){
    Droid droid1 = new Droid("Codey");
    System.out.println(droid1);
    droid1.performTask("dancing");

  }
}
