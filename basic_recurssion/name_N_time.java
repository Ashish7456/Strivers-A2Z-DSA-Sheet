package basic_recurssion;

import java.util.Scanner;

public class name_N_time {
    public static int print_n_time(int n,String name) {
        if (n == 0) {
            return 0;
        }
        System.out.println(name);
        return print_n_time(n - 1,name);
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scr.nextInt();
        System.out.print("Enter name: ");
        String name = scr.next();

        print_n_time(n,name);
    }
}