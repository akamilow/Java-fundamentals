/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.

stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
*/

public class stringYak {

    static String strYak(String str) {
        String new_str = "";
        for (int i=0; i<str.length(); i++) {
            if (i+2 < str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
              i =  i + 2;
            } else {
                new_str += str.charAt(i);
            }
          }
          return new_str;
    }
    public static void main(String[] args) {
        System.out.println(strYak("yakpak"));
    }
}
