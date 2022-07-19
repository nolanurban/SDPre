/* First, create an easy menu function that will operate within a while loop
*  Seconnd, build all the other math functions which are:
*  1. findSum(x, y)
*  2. findAverage(x, y)
*  3. calcTax(x, y)
*
*  Finally, leave an option to break out of the loop.
*
*/

import java.util.Scanner;

public class Objective9Lab5 {
  public static void main(String[] args) {
    int choice;
    boolean exitTicket = true;
    double doubleInput1, doubleInput2;

    while (exitTicket) {
      Scanner input = new Scanner(System.in);
      printMenu();
      choice = input.nextInt();

          switch (choice) {
            case 1:
            System.out.println("You've chosen add two numbers!");
            System.out.print("First number: ");
            doubleInput1 = input.nextDouble();
            System.out.print("Second number: ");
            doubleInput2 = input.nextDouble();
            System.out.println(doubleInput1 + " + " + doubleInput2 + " = " + findSum(doubleInput1, doubleInput2));
            break;

            case 2:
            System.out.println("You've chosen to find the average of two numbers!");
            System.out.print("First number: ");
            doubleInput1 = input.nextDouble();
            System.out.print("Second number: ");
            doubleInput2 = input.nextDouble();
            System.out.println(doubleInput1 + " + " + doubleInput2 + " = " + findAverage(doubleInput1, doubleInput2));
            break;


            case 3:
            System.out.println("You've chosen to calculate the tax after adding two numbers");
            System.out.print("First number: ");
            doubleInput1 = input.nextDouble();
            System.out.print("Second number: ");
            doubleInput2 = input.nextDouble();
            System.out.println(doubleInput1 + " + " + doubleInput2 + " = " + calcTax(doubleInput1, doubleInput2));
            break;


            case 4:
            System.out.println("Goodbye.");
            exitTicket = false;
            break;

            default:
            System.out.println("You've made some sort of error :( Try again!");
            break;
            }
      }
  }
  public static void printMenu() {
    System.out.println();
    System.out.println("========= MENU =========");
    System.out.println("|                      |");
    System.out.println("|   1. Add Numbers     |");
    System.out.println("|   2. Find Average    |");
    System.out.println("|   3. Calculate Tax   |");
    System.out.println("|   4. Exit            |");
    System.out.println("|                      |");
    System.out.println("========================");
    System.out.println();
  }
  public static double findSum(double x, double y) {
    return x + y;
  }
  public static double findAverage(double x, double y) {
    return (x + y) / 2;
  }
  public static double calcTax(double x, double y) {
    return (x + y) * 0.0831;
  }
}
