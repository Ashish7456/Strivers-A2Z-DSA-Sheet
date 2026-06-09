package sorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// import java.util.List;
public class find_all_duplicate {
    static List<Integer> find_duplicate(int[] arr) {
        List<Integer> array = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                } else {
                    if (seen.add(arr[i])) {
                        array.add(arr[i]);
                    }
                    i++;
                }
            } else {
                i++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1, 3, 2,4,5,6,7,8,7};
        System.out.println(find_duplicate(arr));
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}
