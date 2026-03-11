package pattern;
import java.util.Scanner;

public class alpha_pattern3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);

            }
            ch++;
            System.out.println();
        }
    }

}
