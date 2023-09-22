/*
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. 
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
 */

public class StringMatch {
    
    public static int stringMatch(String a, String b) {
        int count = 0;
        int strLength = 0;

        if (a.length() > b.length()) {
            strLength = b.length();
        } else if (b.length() > a.length()){
            strLength = a.length();
        } else {
            strLength = a.length();
        }

        for (int i = 0; i < strLength - 1; i++) {
            String aTemp = a.substring(i, i+2);
            String bTemp = b.substring(i, i+2);

            if (aTemp.equals(bTemp)) {
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
    }
}
