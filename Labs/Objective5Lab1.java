import java.util.Scanner;
public class Objective5Lab1 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Let's compare some numbers!");
    System.out.print("First number: ");
    int firstNum = input.nextInt();
    System.out.print("Second number: ");
    int secondNum = input.nextInt();

    if (firstNum > secondNum) System.out.println(firstNum + " is greater than " + secondNum);

    else
    System.out.println(secondNum + " is greater than " + firstNum);
    // I decided to cheat here a bit, let's see if it works.
  }
}
