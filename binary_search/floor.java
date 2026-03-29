package binary_search;

public class floor{
    static String ceiling_no(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
         if (target > arr[arr.length - 1]) {
                return "No Floor Exist";
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
        return "Floor value is " + arr[end];
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 8, 10, 12 ,14,16};
        System.out.println(ceiling_no(arr, 3));
    }
}
