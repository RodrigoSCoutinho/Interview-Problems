package leetcode;

public class FibonacciNumber {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int[] fibo = new int[31];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i <= 31; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        return fibo[n];

    }
}
