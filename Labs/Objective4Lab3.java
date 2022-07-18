/*
* Take in the users age using input.nextInt() and store it in the age variable.
* Calculate what year the user was born in.
* Print out the calculated birthYear.
*
*/

import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    // the original starter had birthYear, age, currentYear as variables but we really only
    // need age because I can just deduct it now unless I'm trying to make the user input
    // the current year.
    Scanner input = new Scanner(System.in); // this is our input, we will use the utilities based off of the "input variable"
    System.out.printf("How old are you? ");
    int age = input.nextInt();

    System.out.println("You were born in " + (2022 - age));
  }
}
