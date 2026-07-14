package basic_recurssion;

public class reverse_number {
    static int rev(int n ){
        int digit = (int)(Math.log10(n))+1;
        return helper(n,digit);

    }
    static int helper(int n , int digit){
        if(n%10 == n){
            return n;
        }
        int rev = n%10;
        return rev *(int)( Math.pow(10, digit -1)) + helper(n/10, digit-1);
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(rev(n));
    }
}