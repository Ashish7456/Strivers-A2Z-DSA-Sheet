package Arrays.medium;

// https://leetcode.com/problems/two-sum/description/
public class two_sum {

    static int[] checksum(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] {i,j} ;
                }
            }
        }
        return new int[]{-1-1};
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3};
        int[] result = checksum(arr, 5);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
