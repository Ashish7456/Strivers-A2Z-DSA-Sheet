package pattern;
import java.util.Scanner;
public class alpha_pattern10 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int space =  2 * (n- 1);

        for (int h = 1; h <=n; h++) {

            for (int i = 1; i <= h; i++) {
                System.out.print(i);
            }
                for (int j = 1; j <=space; j++) {
                    System.out.print("_");
                }
                for (int k = h; k >= 1; k--) {
                    System.out.print(k);

                }
                System.out.println();
                space -=2;
            }
        }
    }

