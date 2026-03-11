package pattern;
import java.util.Scanner;

public class alpha_pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            int star = i;
            if(i>n)star = 2*n-i;
            for (int j = 1; j <= star; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}