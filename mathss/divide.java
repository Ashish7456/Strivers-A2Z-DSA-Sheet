package mathss;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        List<Integer> divisor = new ArrayList<>();
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisor.add(i);
                if (n / i != i) {
                    divisor.add(n / i);
                }
            }
        }
        divisor.sort(Comparator.naturalOrder());
        for (Integer integer : divisor) {

            System.out.println(integer);
        }
    }
}
