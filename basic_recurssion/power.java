package basic_recurssion;

import java.util.Scanner;

public class power {
    public static int calpower(int x , int n){
        if (x ==0  || n == 0) {
            return 1;
        }
        else{
            return x * calpower(x, n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(calpower(x, n));
    }
}