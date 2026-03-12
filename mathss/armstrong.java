package mathss;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int armstrong = n;
        int pow = String.valueOf(n).length();
        double sum = 0;
        // int sum = 0;
        while(n>0){
        int extract = n%10;
        sum = sum+Math.pow( extract,pow);
        n = n/10;
       }
       if (sum == armstrong) {
        System.out.print("its a arm strong number");
       }else{
        System.out.print("Its not a armstrong number");
       }
    }
}