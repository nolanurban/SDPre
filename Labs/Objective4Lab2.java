/* Prompt the user to get input for all of the int and double variables. using input.nextInt() and input.nextDouble()
* Print the user's input to match the expected output using the int and double variables.
*/
import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {
    // I'll create all the printf prompts first to get the variables filled
    Scanner keyboard = new Scanner(System.in);

    // Can I initialize the variable in the scanner?
    System.out.printf("Please enter the first whole number you would like to add: ");
    int num1 = keyboard.nextInt();
    System.out.printf("Please enter the second whole number you would like to add: ");
    int num2 = keyboard.nextInt();
    System.out.printf("Please enter the third whole number you would like to add: ");
    int num3 = keyboard.nextInt();

    // Now doubles
    System.out.printf("Please enter the third decimal number you would like to add: ");
    double dub1 = keyboard.nextDouble();

    System.out.printf("Please enter the third decimal number you would like to add: ");
    double dub2 = keyboard.nextDouble();

    System.out.printf("Please enter the third decimal number you would like to add: ");
    double dub3 = keyboard.nextDouble();

    // print out the 3 ints and their sum
System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));

    // print out the 3 doubles and their sum
System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + (dub1 + dub2 + dub3));

/* had some issues utilize keyboard rather than  scanner variables. */


  }
}
