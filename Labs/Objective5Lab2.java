/* Checking string equivalency.  I'm pretty decent at conditionals
* but I'm more interested in Java methods (similar to what I saw in JS)
*/

import java.util.Scanner;

public class Objective5Lab2 {
  public static void main(String[] args) {
    // We'll continue the trend of user input strings and utilize equals methods
    Scanner input = new Scanner(System.in);
    System.out.println("Let's compare two strings!");
    System.out.print("First string: ");
    String string1 = input.nextLine();
    System.out.print("Second string: ");
    String string2 = input.nextLine();

    if (!string1.equals(string2)) System.out.println("These aren't the droids you were looking for :( ");
    else System.out.println(string1 + " is equivalent to " + string2);

  }
}
