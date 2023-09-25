package LeetCode;

/*
 * https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75
 */

public class MergeStrings1768 {

    public static String mergeAlternately(String word1, String word2) {
        String[] array_word1 = word1.split("");
        String[] array_word2 = word2.split("");
        
        StringBuilder mergeWord = new StringBuilder();
        
        if (array_word1.length > array_word2.length) {

            String remains_word1 = word1.substring(word2.length());
            for (int i = 0; i < array_word2.length; i++) {
                mergeWord.append(array_word1[i] + array_word2[i]);
            }

            return mergeWord.toString() + remains_word1;

        } else if (array_word1.length < array_word2.length) {

            String remains_word2 = word2.substring(word1.length());
            for (int i = 0; i < array_word1.length; i++) {
                mergeWord.append(array_word1[i] + array_word2[i]);
            }

            return mergeWord.toString() + remains_word2;

        } else {

            for (int i = 0; i < array_word1.length; i++) {
                mergeWord.append(array_word1[i] + array_word2[i]);
            }

            return mergeWord.toString();

        }
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately("abcd", "pq"));
    }
}

/*SOLUCION
public String mergeAlternately(String word1, String word2) {
    StringBuilder result = new StringBuilder();
    int i = 0;
    while (i < word1.length() || i < word2.length()) {
        if (i < word1.length()) {
            result.append(word1.charAt(i));
        }
        if (i < word2.length()) {
            result.append(word2.charAt(i));
        }
        i++;
    }
    return result.toString();
}
*/