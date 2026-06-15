package sorting;

import java.util.ArrayList;
import java.util.List;

public class set_mismatch {
    static List<Integer> findmismatch(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (correct < arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        List<Integer> newarray = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                newarray.add(j + 1);
                newarray.add(arr[j]);
            }
        }
        return newarray;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 4, 1 };
        System.out.println(findmismatch(arr));

    }
}
