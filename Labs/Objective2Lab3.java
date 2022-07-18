/*  Declare an integer variable to hold the year you were born.
    Declare a String variable to hold the month you were born.
    Declare a variable to store whether today is a weekend or not.
    Print out each of the three variables.

    Seems like this assignment could be far more tedious.
    You'd need to initialize an array that has months 1-12 to convert
    the string to a number

    You'd need to also initialize a boolean to determine truth or false
    based upon weekend days (Monday-Sunday) which means that days 6 & 7
    would return a true

    Lastly, I'm not sure I understand the idea behind returning a 15 for 1996
    If it's an integer value for "1996" I can't see how that would return a
    15 (output would result from numbers 15 6 2) when 6 = June, and 2 = false

*/

public class Objective2Lab3 {
  public static void main(String[] args) {
    int birthYear = 1982;
    String birthMonth = "July";
    boolean weekendCheck = false;

    System.out.println(birthYear);
    System.out.println(birthMonth);
    System.out.println(weekendCheck);

  }
}
