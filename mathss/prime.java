package mathss;

import java.util.Scanner;

public class prime {

    public static boolean isprime(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                if (n / i == i) {
                    count++;
                }
            }

        }
        return count ==2;

    };

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

    }

}
