package mathss;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class factor_opt {
    // static ArrayList<Integer> factor(int n) {
    static void factor(int n) {
        ArrayList<Integer> fact = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int rev = n / i;
                fact.add(i);
                fact.add(rev);
            }
        }
        // return fact;
        // for (Integer integer : fact) {
        //     System.out.println(integer);
        // }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        int n = 20;
        factor(n);

    }
}
