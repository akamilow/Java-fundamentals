/* 
Given an array of ints length 3, return the sum of all the elements.

sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
*/

public class sum3 {

    static Integer suma(Integer[] a){
        Integer count = 0;
        for (int i = 0; i < a.length; i++) {
            count += a[i];
        }
        return count;
    }
    public static void main(String[] args) {
        Integer[] b = {1,2,3};
        System.out.println(suma(b));
    }
}
