package mathss;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int tem = n;
        int rev = 0;

        while (tem > 0) {

            int extract = tem % 10;
            rev = 10 * rev + extract;
            tem = tem / 10;
        }
        if (n == rev) {
            System.out.println("Its a palindrome ");
        } else {
            System.out.println("Its not a palindrome");
        }
    }
}
