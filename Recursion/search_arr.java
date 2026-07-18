package Recursion;

// linear search using recursion
public class search_arr {
    static int search(int[] arr, int i, int target) {
        if (i > arr.length - 1) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return search(arr, i += 1, target);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 8, 8 };
        System.out.println(search(arr, 0, 12));
    }
}