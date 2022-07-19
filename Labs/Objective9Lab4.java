import java.util.Scanner;

public class Objective9Lab4 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
		double num1, num2;

    System.out.print("Please give me a number: ");
		num1 = kb.nextDouble();
		System.out.print("Please give me another number: ");
		num2 = kb.nextDouble();

    double average = findAverage(num1, num2);
    System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);

    kb.close();

  }
  public static double findAverage(double var1, double var2) {
    return ((var1 + var2) / 2);
  }
}
