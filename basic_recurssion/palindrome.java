package basic_recurssion;

public class palindrome {
    static int rev(int n) {
        int digit = (int) (Math.log10(n)) + 1;
        return helper(n, digit);
    }
    static int helper(int n, int digit) {
        if (n % 10 == n) {
            return n;
        }
        int rev = n % 10;
        return rev * (int) (Math.pow(10, digit - 1)) + helper(n / 10, digit - 1);
    }

    public static void main(String[] args) {
        int n = 12;
        if (rev(n) == n) {
            System.out.println("its a palindrome");
            
        }else{
            System.out.println("not a palindrome");
        }
    }
}