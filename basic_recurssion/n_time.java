package basic_recurssion;

import java.util.Scanner;

public class n_time{
    public static void printnumber(int current ,int n){
        if (current >n) {
            return;
        }
        System.out.println(current);
        printnumber(current +1,n);
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        printnumber(1,n);
    }
}