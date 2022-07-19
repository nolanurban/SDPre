/* I'd really like to see if I can learn methods in java to
* include using arguments.  I guess we'll see.
*/
import java.util.Scanner;

public class Objective9Lab1 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("What's your name ? ");
    String myName = input.nextLine();
    printName(myName);
    input.close();
  }

  public static void printName(String yourName) {
    System.out.println("Hello " + yourName);
  }
  // I was really happy to write a method that has an argument
}
