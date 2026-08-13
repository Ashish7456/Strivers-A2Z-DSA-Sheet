package Arrays;
// find the element that appears only single time in an array
// https://leetcode.com/problems/single-number/description/
public class appear_once {
    public static int single_num(int[] arr) {
        // xor will cancle all duplicate element 
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2 };
        System.out.println(single_num(arr));
    }
}