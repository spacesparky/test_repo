public class Factorial {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(7));
    }
}