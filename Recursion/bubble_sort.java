package Recursion;
// bubble sort using recursion
public class bubble_sort {
    // r = row ,c = column;
    static void sort(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        // checking colum is less than row if true than execute
        if (c < r) {
            // swaping the elements; 
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            };
            sort(arr, r, c+1);
        }else{
            sort(arr, r-1, 0);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 4, 3, 2, 1 };
        int i = arr.length-1;
        sort(arr, i, 0);
        // replace the original array
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
