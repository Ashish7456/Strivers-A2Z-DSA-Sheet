package Arrays;

public class largest_array {
    static int largest_Arr(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 6, 9, 10 ,-1,-99};
        System.out.println(largest_Arr(arr));

    }
}
