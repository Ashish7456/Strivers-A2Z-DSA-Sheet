package Arrays;
// remove duplicate from array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

public class remove_duplicated {
    static int remove(int[] arr ){

        int j = 0;
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
                count++;
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        int[] arr ={2,2,3,4,4,4,4,5};
        System.out.println(remove(arr));
        // remove(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
