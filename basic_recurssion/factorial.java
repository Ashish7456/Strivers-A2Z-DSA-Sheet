package basic_recurssion;

import java.util.Scanner;

public class factorial {
    static int fact(int n) {
        if (n <= 0) {
            return 1;
        }
        int sum = n * fact(n - 1);
        return sum;
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
        sc.close();
    }
}