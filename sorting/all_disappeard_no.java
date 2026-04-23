package sorting;
import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class all_disappeard_no {
    static List<Integer> disappeard(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] <= arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                result.add(j + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(disappeard(arr));
        // disappeard(arr);
    }

}