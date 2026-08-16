package Arrays;
// Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.
public class longest_subarr {
    static int find_subarr(int[] arr, int k) {
        int n = arr.length;

        int maxlength = 0;

        for (int start = 0; start < n; start++) {

            for (int end = start; end < n; end++) {
                int currentsum = 0;

                for (int i = start; i <= end; i++) {
                    currentsum = currentsum + arr[i];
                }

                if (currentsum == k) {
                    maxlength = Math.max(maxlength, end - start + 1);
                }
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5 };

        System.out.println(find_subarr(arr, 15));

    }
}
