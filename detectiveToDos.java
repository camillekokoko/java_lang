import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    // Print the size of each ArrayList below:
    System.out.println(poirotsToDos.size());
    System.out.println(sherlocksToDos.size());

      
    // Print the name of the detective with the larger to-do list:
    if (poirotsToDos.size()>sherlocksToDos.size() ){
       System.out.println("poirots");
    } else {
      System.out.println("sherlocks");
    }

    System.out.println("Sherlock's third to-do:");
    // Print Sherlock's third to-do:
    System.out.println(sherlocksToDos.get(2));
    
    System.out.println("\nPoirot's second to-do:");
    // Print Poirot's second to-do:
    System.out.println(poirotsToDos.get(1));

    // Set each to-do below:
    sherlocksToDos.set(1, "listen to Dr. Watson for amusement");
    poirotsToDos.set(3, "listen to Captain Hastings for amusement");
    System.out.println("Sherlock's to-do list:");
    System.out.println(sherlocksToDos.toString() + "\n");
    System.out.println("Poirot's to-do list:");
    System.out.println(poirotsToDos.toString());

      // Remove each to-do below:
    
    sherlocksToDos.remove(0);
    sherlocksToDos.remove(0);
    poirotsToDos.remove(0);

    System.out.println(sherlocksToDos.toString() + "\n");
    System.out.println(poirotsToDos.toString());


       // Calculate to-dos until case is solved:
    int number = sherlocksToDos.indexOf("solve the case");
      
    // Change the value printed:
    System.out.println("PRINT THE ANSWER HERE");
    System.out.println(number);
   
  }
  
  
}
/*
Creating an ArrayList.
Adding a new ArrayList item using add().
Accessing the size of an ArrayList using size().
Finding an item by index using get().
Changing the value of an ArrayList item using set().
Removing an item with a specific value using remove().
Retrieving the index of an item with a specific value using indexOf().
*/
