/* Prompt the user to get input for all of the String variables using input.nextLine().
*  Print the user's input to match the expected output using String concatenation.
*/

import java.util.Scanner; // bring in the tools

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";

    // We will need to get inputs from here, I'll create the prompts first and then the inputs second
    // After each println I'll add the input, I'll close at the end.

    System.out.printf("First name: "); // I decided to use printf because it looked better without line breaks
    fname           = keyboard.nextLine();
    System.out.printf("Last name: ");
    lname           = keyboard.nextLine();

    System.out.printf("Favorite animal: ");
    favoriteAnimal  = keyboard.nextLine();

    System.out.printf("Favorite food: ");
    favoriteFood    = keyboard.nextLine();

    System.out.printf("Favorite song: ");
    favoriteSong    = keyboard.nextLine();



    // Close of program (Report all variables, close the scanner)
    System.out.println("My name is " + fname + " " + lname);
    System.out.println("My favorite animal is the " + favoriteAnimal);
    System.out.println("My favorite food is " + favoriteFood);
    System.out.println("My favorite song is " + favoriteSong);


  }
}
