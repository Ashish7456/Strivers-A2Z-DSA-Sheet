package Arrays;

public class check_sorted {

    static boolean checkarr(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,1};
        System.out.println(checkarr(arr));
    }
}