/*
 * pattern.java
 *
 * Simple program that reads an integer n from standard input and
 * prints a triangular pattern of sequential numbers. Each row starts
 * with the next number in sequence and contains as many numbers as
 * the row index (1-based). For example, input 3 produces:
 *
 *   1
 *   2 3
 *   4 5 6
 */

package pattern;
import java.util.Scanner;

public class alpha_pattern9 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int no = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(no + " ");
                no++;

            }
            System.out.println();
        }
    }

}
