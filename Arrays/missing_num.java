package Arrays;
// Find missing number
public class missing_num {

    static int find_miss_num(int[] arr) {
// sorting the array
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (correct < arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{

                i++;
            }
        }
        // finding mission number
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] !=  j+1) {
                return j+1;
            }
        }
        return arr.length+1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 6, 4, 5, 8, 7, 2 };
        System.out.println(find_miss_num(arr));

        for (int i : arr) {
            System.out.print(i);
        }
    }
}