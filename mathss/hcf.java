package mathss;

import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number one: ");
        int n1 = scr.nextInt();
        System.out.print("Enter the number two: ");
        int n2 = scr.nextInt();
        int hcf = 1;

        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println(i);
                hcf = i;
            };
        }
        System.out.print("hcf is: " + hcf);
    }
}