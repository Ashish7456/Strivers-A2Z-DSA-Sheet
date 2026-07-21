package Recursion;

public class pattern {
    static void print_pattern(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            print_pattern(r, c + 1);
        } else {
            System.out.println();
            print_pattern(r - 1, 0);
        }
    }
    public static void main(String[] args) {
        int num = 4;
        print_pattern(num, 0);
    }
}
