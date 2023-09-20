/*
Given an array of ints length 3, return an array with the elements 
"rotated left" so {1, 2, 3} yields {2, 3, 1}.

rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
*/

public class rotateLeft3 {

    public static int[] rotateLeft(int[] arrayNums) {
        int[] rotatedArray = {arrayNums[1], arrayNums[2], arrayNums[0]};
        return rotatedArray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(rotateLeft(nums));
    }
}