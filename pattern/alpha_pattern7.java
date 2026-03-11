package pattern;
import java.util.Scanner;

public class alpha_pattern7 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the input ");
        int n = scr.nextInt();
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;

        }

        System.out.println(count);
    }
}
