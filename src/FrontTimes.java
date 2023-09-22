/*
Given a string and a non-negative int n, 
we'll say that the front of the string is the first 3 chars, 
or whatever is there if the string is less than length 3. Return n copies of the front;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */

public class FrontTimes {
    
    public static String frontTimes(String str, int copies) {
        String strChopped;

        if (str.length() >= 3) {
            strChopped = str.substring(0, 3);
        } else {
            strChopped = str;
        }
        
        StringBuilder strTres = new StringBuilder();
        
        for (int i = 0; i < copies; i++) {
            strTres.append(strChopped);
        }

        return strTres.toString();
    }

    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 10));
    }
}
