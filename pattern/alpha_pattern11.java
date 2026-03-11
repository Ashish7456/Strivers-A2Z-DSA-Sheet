package pattern;

import java.util.Scanner; 
public class alpha_pattern11 {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);

        int n;
        System.out.println("enter number");
        n = scn.nextInt();

        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*i+1 ; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
        ///////////reversing the pattern/////////////////////
        for (int i = n-1; i >=0; i--) {

        for (int j = 0; j <n-i-1; j++) {
            System.out.print("_");
        }
        for (int k = 1; k <=2*i+1; k++) {
            System.out.print("*");
        }
        System.out.println("");      
    }


    }
}
