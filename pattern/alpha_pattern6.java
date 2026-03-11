package pattern;
import java.util.Scanner;

public class alpha_pattern6 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        // 2ns half of pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            
            for (int j = 0; j < (n - i - 1) * 2; j++) {
                System.out.print(" ");
            }
             for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
