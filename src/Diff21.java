/* diff21 => https://codingbat.com/prob/p116624
 * Given an int n, return the absolute difference between n and 21, 
 * except return double the absolute difference if n is over 21.
 * 
    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0
 */

public class Diff21 {
  static int n;

  public static int absoluteDiff(int n) {
    if (n > 21) {
      return (n - 21) * 2;
    }
    return 21 - n;
  }
  public static void main(String[] args) {
    System.out.println(absoluteDiff(22));
  }

}