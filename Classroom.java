import java.util.Arrays;

public class Classroom {

  
  public static void main(String[] args){
    String[] students = {"Sade", "Alexus", "Sam", "Koma"};
    double[] mathScores = new double[4];
    mathScores[0] = 94.5;
    mathScores[2] = 76.8;
    System.out.println("The number of students in the class is " + students.length);
 
  }
}


-------------

public class Classroom {
  String[] students;
  double[] mathScores;

  // Constructor to initialize the arrays and set initial values
  public Classroom(String[] students, double[] mathScores) {
    this.students = students;
    this.mathScores = mathScores;
  }

  public void printNumberOfStudents() {
    System.out.println("The number of students in the class is " + students.length);
  }

  public static void main(String[] args) {
    String[] studentsArray = {"Sade", "Alexus", "Sam", "Koma"};
    double[] mathScoresArray = new double[4];
    mathScoresArray[0] = 94.5;
    mathScoresArray[2] = 76.8;

    // Create an instance of Classroom using the constructor
    Classroom classroom = new Classroom(studentsArray, mathScoresArray);

    // Call the printNumberOfStudents method
    classroom.printNumberOfStudents();
  }
}
