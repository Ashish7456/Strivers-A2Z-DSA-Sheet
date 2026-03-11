/*
 * alpha_pattern2.java
 *
 * Reads an integer n from the user and prints a decreasing sequence of
 * alphabet characters on each line. The first row contains letters from
 * 'A' through 'A'+(n-1), the next row omits the last character, and
 * so on until only 'A' remains. Example for n=4:
 *
 *   ABCD
 *   ABC
 *   AB
 *   A
 *
 */

package pattern;
import java.util.Scanner;

public class alpha_pattern2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        for (int i = 1; i <= n; i++) {
            for (char j = 'A'; j <= 'A' + (n - i); j++) {
                System.out.print(j);

            }
            System.out.println();
        }
        scr.close();
    }
}