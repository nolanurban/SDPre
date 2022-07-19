/* We get to use my favorite: switch */
/* I'm going to reverse this program so I can play with some methods */
/* namely toLowerCase if possible. */
import java.util.Scanner; // forgot to add this caused errors.

public class Objective6Lab1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String monthArray[] = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh",
                            "eighth", "ninth", "tenth", "eleventh", "twelfth" };
    System.out.println("This program tells you what numerical month you input.");
    System.out.print("Enter a month: ");
    String inputMonth = input.nextLine();
    System.out.println(inputMonth.toLowerCase());
    switch (inputMonth.toLowerCase()) { // not sure if i can switch a method
      case "january":
        System.out.println("The month of " + inputMonth + " is the " + monthArray[0] + " month");
        break;
      case "february":
        System.out.println("The month of " + inputMonth + " is the " + monthArray[1] + " month");
        break;
      case "march":
        System.out.println("The month of " + inputMonth + " is the " + monthArray[2] + " month");
        break;
      case "april":
        System.out.println("The month of " + inputMonth + " is the " + monthArray[3] + " month");
        break;
      case "may":
        System.out.println("The month of " + inputMonth + " is the " + monthArray[4] + " month");
        break;
      case "june":
        System.out.println("The month of " + inputMonth + " is the " + monthArray[5] + " month");
        break;
      case "july":
        System.out.println("The month of " + inputMonth + " is the " + monthArray[6] + " month");
        break;
      case "august":
        System.out.println("The month of " + inputMonth + " is the " + monthArray[7] + " month");
        break;
      case "september":
        System.out.println("The month of " + inputMonth + " is the " + monthArray[8] + " month");
        break;
      case "october":
        System.out.println("The month of " + inputMonth + " is the " + monthArray[9] + " month");
        break;
      case "november":
        System.out.println("The month of " + inputMonth + " is the " + monthArray[10] + " month");
        break;
      case "december":
        System.out.println("The month of " + inputMonth + " is the " + monthArray[11] + " month");
        break;
      default:
        System.out.println("That is not a valid month");
        break;
    }
// quick debug check with default only.
  }
}
