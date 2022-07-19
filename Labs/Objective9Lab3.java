import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int selection;

    while (true) {
      printMenu();
      selection = keyboard.nextInt();

      if (selection == 1) HelloHuman();
      if (selection == 2) FavoriteFoods();
      if (selection == 3) {
        System.out.println("Goodbye");
        break;
      }

    }

  }
  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
  public static void HelloHuman() {
    System.out.println("Hello Human");
  }
  public static void FavoriteFoods() {
    System.out.println("Apples, Bananas, Coconuts");
  }
}
