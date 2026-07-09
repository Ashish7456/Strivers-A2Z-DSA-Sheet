package mathss;
// sieve of Eratosthenes
public class range_prime {
    public static void main(String[] args) {

        int n = 40;
        boolean[] isprime = new boolean[n + 1];
        sieve(n, isprime);
    }

    static void sieve(int n, boolean isprime[]) {

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isprime[i] == false) {
                for (int j = i * 2; j <= n; j = j + i) {
                    isprime[j] = true;
                }
            }
        }

        for (int i = 2; i <=n; i++) {
            if (isprime[i] == false) {
                System.out.println(i+ " ");
            }
        }
    }
}