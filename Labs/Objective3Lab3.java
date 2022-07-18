// Working with random number generation

public class Objective3Lab3 {
  public static void main(String[] args) {
    int first, second, third; // variables will each be a random number between 1 & 6 (like dice)

    first   = 1 + (int)(Math.random() * 6);  // Was getting weird feedback from the compiler, seems to be working now.
    second  = 1 + (int)(Math.random() * 6);
    third   = 1 + (int)(Math.random() * 6);
    System.out.println(first + " + " + second + " + " + third + " = " + (first + second + third));
  }
}
