package sorting;
// https://leetcode.com/problems/find-the-duplicate-number/description/
public class duplicate_num {
    static int find_duplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 2 };
        System.out.println(find_duplicate(arr));

    }
}
