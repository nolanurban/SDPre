/*  This looks like the last assignment for Objective 5
*   It's purpose is to show off modulus operations which is a
*   super useful tool.
*/

import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number to determine odd or even: ");
    int numberInput = input.nextInt();

    if (numberInput % 2 == 0) System.out.println(numberInput + " is an even number.");
    else System.out.println(numberInput + " is an odd number.");
    input.close(); // I guess it's good programming practice to close it out
  }
}
