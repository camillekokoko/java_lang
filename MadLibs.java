public class MadLibs {
  /*
  This program generates a mad libbed story. 
  Author: Camille Ko
  Date: 29 Nov 2023
  */
  	public static void main(String[] args){
      
      String name1 = "Harry";
      String name2 = "Mary";

      String adjective1 = "energetic";
      String adjective2 = "wonderful";
      String adjective3 = "gorgous";

      String verb1 = "eat";
      String verb2 = "sleep";
      String verb3 = "love";

      String noun1 = "tree";
      String noun2 = "stone";
      String noun3 = "pool";
      String noun4 = "swarms";
      String noun5 = "dragons";
      String noun6 = "cats";

      int number = 20;

      String place1 = "Lalaland";

      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}
