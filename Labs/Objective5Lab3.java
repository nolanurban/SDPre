/* Simple conditional check for greater than 0 integer */

import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter a number to check it's positivity: ");
    int userNumber = input.nextInt();

    if (userNumber > 0 && userNumber != 0) System.out.println(userNumber + " is a positive number.");
    else if (userNumber == 0) System.out.println("Your number is zero.");
    else System.out.println(userNumber + " is a negative number.");

    input.close(); // Not sure this is really a necessary step? Maybe for memory purposes?
  }
}
