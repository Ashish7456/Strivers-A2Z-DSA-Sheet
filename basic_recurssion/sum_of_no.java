package basic_recurssion;

import java.util.Scanner;

public class sum_of_no {
    static int sum_of_natural(int n){
        if (n <=0) {
            return 0 ;
        }else{

            return n + sum_of_natural(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(sum_of_natural(n));

    }
}
