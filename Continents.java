// Continents.java: a program that will print out a continent and the largest city in that continent, based on the value of an integer.

public class Continents {
  int continent;

  public Continents(int paramContinent) {
    continent = paramContinent;
  }
   
  public String statement() {
    String output;
    switch (continent) {
      case 1:
        output = "North Amercia: Mexico City, Mexico";
        break;
      case 2: 
        output = "South America: Sao Paulo, Brazil";
        break;
      case 3: 
        output = "Europe: Moscow, Russia";
        break;
      case 4:
        output = "Africa: Lagos, Nigeria";
        break;
      case 5: 
        output = "Asia: Shanghai, China";
        break;
      case 6: 
        output = "Australia: Sydney, Australia";
        break;
      case 7: 
        output = "Antarctica: McMurdo Station, US";
        break;
      default: 
        output = "Undefined continent!";
    }
    return output;
  }
  
  public static void main(String[] args) {
    Continents continent1 = new Continents(4);

    System.out.println(continent1.statement());
  }
}
