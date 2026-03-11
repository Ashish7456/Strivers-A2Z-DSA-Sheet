package pattern;
import java.util.Scanner;

public class alpha_pattern5 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        for (int i = 0; i <5; i++) {
            for (char j =(char)('E'-i) ; j <='E'; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}