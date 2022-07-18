/* I'm going to use this small assignment to play with declaring
*  a string.  I'll do it first by creating four strings and then seeing how
*  the println function will work with commas, trying to call it once.
*/

public class Objective2Lab1 {
  public static void main(String[] args) {
    String Line1 = ">>  ----------------";
    String Line2 = ">> | Grocery List   |";
    String Line3 = ">> | 1. Milk        |";
    String Line4 = ">> | 2. Eggs        |";
    String Line5 = ">> | 3. Bread       |";
    String Line6 = ">>  ----------------";

    System.out.println(Line1 +
                      '\n' +
                      Line2 +
                      '\n' +
                      Line3 +
                      '\n' +
                      Line4 +
                      '\n' +
                      Line5 +
                      '\n' +
                      Line6 );
  }
}
