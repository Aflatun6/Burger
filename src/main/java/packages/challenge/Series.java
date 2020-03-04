package packages.challenge;

public class Series {
    public static int Sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int Factorial(int n) {
        int factorial = 1;
        for (int i = 1; i < n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int Fibonnaci(int n) {
        int fibonacci;
        if (n == 0) {
            fibonacci = 0;
        } else if (n == 1) {
            fibonacci = 1;
        } else {
            fibonacci = Fibonnaci(n - 1) + Fibonnaci(n - 2);
        }
        return fibonacci;
    }
}
