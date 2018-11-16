/* Code for 11.3b, due Nov. 16th
 * Created by Sally Crow on behalf of Ms. Asplund
 * This code determines letter grade from a numeric input.
 */
import java.util.Scanner;

public class LetterGrade {
  
  public static void main(String [] args)
  {
    //variables, one to take number grade and one to create letter grade.  
    int grade;
    int count = 0;
    int lowgrade = 100;
    int highgrade = 0;
    int average = 0;
    
    //Request and store user data.
    Scanner reader = new Scanner(System.in);
    System.out.println("What is your number grade? If you are finished, enter -1."); 
    grade = reader.nextInt();
    
   while (grade != -1) 
   {
    LetterGrade g = new LetterGrade();
    g.getLetterGrade(grade);
    count++;
    
    if (grade > highgrade && grade < lowgrade) {
     highgrade = grade;
     lowgrade = grade;
    } else if (grade > highgrade) {
     highgrade = grade;
    } else if (grade < lowgrade) {
     lowgrade = grade;
    }
    average += grade;
   }
    
   System.out.println("You entered " + count + " students.");
   System.out.println("Your lowest grade was " + lowgrade + ".");
   System.out.println("Your highest grade was " + highgrade + ".");
   System.out.println("Your class average was a " + (average / count) + ".");
  }
  
  public String getLetterGrade(int grade)
  {
    String letter = "";
    //If/else if/else statement to find letter grade and return it to user.  
    //Includes a message at the end for invalid inputs.
    if(grade >= 90 && grade <= 100) {
      letter = "A";
    } else if (grade >= 80 && grade <= 89) {
      letter = "B";
    } else if (grade >= 70 && grade <= 79) {
      letter = "C";
    } else if (grade >= 65 && grade <= 69) {
      letter = "D";
    } else if (grade >= 0 && grade <= 64) {
      letter = "F";
    }
    return "That's an " + letter + ".";    
  }  
}
