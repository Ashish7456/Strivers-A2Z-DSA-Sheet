package Arrays;
// https://leetcode.com/problems/rotate-array/description/
// rotating array by k
public class rotate_arr_op {
    // method to reverse the array
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    // method to rotate array
    static void rotate(int[] arr,int k){
        k%=arr.length;

        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(arr, 2);
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
