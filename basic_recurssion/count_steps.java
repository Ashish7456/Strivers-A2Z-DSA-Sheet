package basic_recurssion;

public class count_steps {
    static int Countsteps(int n, int steps) {
        if (n == 0) {
            return steps;
        }
        if (n % 2 == 0) {
            return Countsteps(n / 2, steps + 1);
        }
        return Countsteps(n - 1, steps + 1);
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(Countsteps(n, 0));
    }
}
