package Arrays;
// move zeros at the end

public class move_zero {
    static void moveZero(int[] arr) {
        int j = 0;
        int n = arr.length - 1;
        while (j <= n) {
            if (arr[j] == 0) {
                int temp = arr[j];
                for (int i = j + 1; i <= n; i++) {
                    arr[i - 1] = arr[i];
                }
                arr[n] = temp;
                n--;
            } else {
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 0, 1 };
        moveZero(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
