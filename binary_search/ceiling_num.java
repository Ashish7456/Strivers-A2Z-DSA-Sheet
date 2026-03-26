package binary_search;

public class ceiling_num {
    static String ceiling_no(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
         if (target > arr[arr.length - 1]) {
                return "No Ceiling Exist";
            }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                // System.out.println("Target Founded");
                return "Target Found" + arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        // System.out.println(arr[start]);
        return "ceiling value is " + arr[start];
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 8, 10, 12 ,14,16};
        System.out.println(ceiling_no(arr, 16));
    }
}
