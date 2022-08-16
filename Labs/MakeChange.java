/*

Nolan Urban
Completed 8/15/22
Standard error messaging but meets all the tests listed in the grading section.  I am unsure what would occur by inputting strings etc,
I may build this feature in later to parse user inputs.




*/

import java.util.Scanner;
import java.math.*;

public class MakeChange {

  public static void main(String[] args) {
    boolean userInput = false;
    double itemPrice, moneyInput;


    Scanner keyboard = new Scanner(System.in);
    // This is the menu with a built in error messaging; the user does it right or it repeats.
    while (true) {
        System.out.print("Item Price : ");
        itemPrice = keyboard.nextDouble();
        System.out.print("Amount recieved: ");
        moneyInput = keyboard.nextDouble();
        if (itemPrice > moneyInput) {
          System.out.println("It's not enough, please try again.");
        }
        if (itemPrice < moneyInput) break;
    }
    double returnChange = moneyInput - itemPrice;
    int dollars = (int)returnChange;
    double coins = (returnChange - (double)dollars) * 100;
    // Here we had to use some magic to convert decimal points into integers.  I feel that utilizing BigDecimal is probably the way we would do it in the future.
    if (coins == 0)
    System.out.print("Change: $" + dollars + " ");
    else if (coins < 10 && coins != 0)
    System.out.print("Change: $" + dollars + ".0" + Math.round(coins) + " ");
    else
    System.out.print("Change: $" + dollars + "." + Math.round(coins) + " ");

    // This is the bulk of the clean return, lots of string appending to make it nice for the user.
    String fillDataDollars = Integer.toString(dollars);
    String fillDataCoins = Double.toString(Math.round(coins));
    String output = changeSort(fillDataDollars) + coinSort(fillDataCoins);
    output = output.substring(0, output.length()-2);
    output = output.substring(0, output.lastIndexOf(","));
    String output2 = changeSort(fillDataDollars) + coinSort(fillDataCoins);
    output2 = output2.substring(output.length()+1, output2.length()-2);  // I utilized this to knock off the blanket comma and space I put on all the returnString concatenations.
    String finalOutput = output.concat(" and" + output2);
    System.out.println(finalOutput);
  }

  public static String changeSort(String inputString) {
    String returnLine = "";
    // these integers will translate over into a return string.
    int hundred = 0;
    int fifty = 0;
    int twenty = 0;
    int ten = 0;
    int five = 0;
    int one = 0;

    int inputMoney = Integer.parseInt(inputString);
    // this section uses modulo and then modifies the input string to count it down and then organizes it into the money values.
        hundred = inputMoney / 100;
        inputMoney = inputMoney % 100;

        fifty = inputMoney / 50;
        inputMoney = inputMoney % 50;

        twenty = inputMoney / 20;
        inputMoney = inputMoney % 20;

        ten = inputMoney / 10;
        inputMoney = inputMoney % 10;

        five = inputMoney / 5;
        inputMoney = inputMoney % 5;

        one = inputMoney;

    if (hundred == 1) returnLine += "1 hundred dollar bill, ";
    if (hundred > 1) returnLine += hundred + " hundred dollar bills, ";

    if (fifty == 1) returnLine += "1 fifty dollar bill, ";
    if (twenty > 1) returnLine += "2 twenty dollar bills, ";
    if (twenty == 1) returnLine += "1 twenty dollar bill, ";
    if (ten == 1) returnLine += "1 ten dollar bill, ";
    if (five == 1) returnLine += "1 five dollar bill, ";

    if (one == 1) returnLine += "1 one dollar bill, ";
    if (one > 1) returnLine += one + " one dollar bills, ";
    return returnLine;
  }
// I built this function/method to sort only change rather than try to whittle the numbers down to decimals.

  public static String coinSort(String inputString) {
    double doubleCoins = Double.parseDouble(inputString);
    int coins = (int)doubleCoins;
    int quarters = 0;
    int dimes = 0;
    int nickels = 0;
    int pennies = 0;
    String returnString = "";  // we're going to utilize this string to kick back to the println in the main method.

    quarters = coins / 25;
    coins = coins % 25;
    dimes = coins / 10;
    coins = coins % 10;
    nickels = coins / 5;
    coins = coins % 5;
    pennies = coins;


    if (quarters == 1) returnString += "1 quarter, ";
    if (quarters == 2) returnString += "2 quarters, ";
    if (quarters == 3) returnString += "3 quarters,";

    if (dimes == 1) returnString += "1 dime, ";
    if (dimes == 2) returnString += "2 dimes, ";

    if (nickels == 1) returnString += "1 nickel, ";

    if (pennies == 1) returnString += "1 penny, ";
    if (pennies == 2) returnString += "2 pennies, ";
    if (pennies == 3) returnString += "3 pennies, ";
    if (pennies == 4) returnString += "4 pennies, ";
    return returnString;
  }
}
