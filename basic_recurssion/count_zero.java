package basic_recurssion;

public class count_zero {
    static int count(int n, int count){
        // Base case: when n becomes 0
        if (n == 0) {
            return count;
        }
        // Check if last digit is 0
        if (n % 10 == 0) {
            count = count + 1;
        }
        // Recursive call with n/10 and updated count
        return count(n / 10, count);

    }
    public static void main(String[] args) {
        int n = 30204;
        int count = 0;
        System.out.println(count(n, count));

    }
}
