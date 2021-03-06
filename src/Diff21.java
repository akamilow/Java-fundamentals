/* diff21 => https://codingbat.com/prob/p116624
 * Given an int n, return the absolute difference between n and 21, 
 * except return double the absolute difference if n is over 21.
 * 
    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0
 */


public class Diff21 {
    public static void main(String[] args) {
        Diff diff = new Diff();
        System.out.println(diff.diff21(19));
    }
}

class Diff {
    public int diff21(int n) {
        if (n > 21) {
          return (n - 21) * 2;
        }
        return 21 - n;
      }
}