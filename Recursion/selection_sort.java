package Recursion;

public class selection_sort {
    static void selection(int[] arr, int max, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, c, r, c + 1);
            } else {
                selection(arr, max, r, c + 1);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;

            selection(arr, 0, r - 1, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        int r = arr.length;
        // int max = arr.length;
        selection(arr, 0, r, 0);
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
