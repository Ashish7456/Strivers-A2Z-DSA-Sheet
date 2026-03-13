package basic_recurssion;

import java.util.Scanner;

public class fibonacci {
    public static int  fibo(int n) {
        if (n <= 1) {
            return n;
        }
        int value = fibo(n-2);
        int value2 =  fibo(n-1);
        return value + value2;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        
        System.out.println(fibo(n));
    }
}