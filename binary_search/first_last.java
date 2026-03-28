package binary_search;
// return first and last index of a target element in an sorted array.
import basic_recurssion.rough;
import basic_recurssion.string_palindrome;

public class first_last {
    static int[] firstlast(int[] arr , int target){
        int [] ans = {-1,-1};
        int first = Search(arr, target, true);
        int last = Search(arr, target, false);
        ans[0] = first;
        ans[1] = last;
        return  ans;
    }
    static int Search(int[] arr, int target, boolean firstlast) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        // int mid ;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (firstlast) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans; 
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 7, 7, 8, 8, 10 };
        // System.out.println(firstlast(arr,7 ));
        int[] result = firstlast(arr, 8);
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}