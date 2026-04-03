package binary_search;

class peek_in_mountain {
    static int findpeek(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if ( arr[mid] > arr[mid + 1]) {
                end  = mid;
            } else  {
                start = mid +1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5,8,10,9,7, 6, 1 };
        int[] arr = {0,2,4,6,5,3,1};
        System.out.println(findpeek(arr));
    }
}