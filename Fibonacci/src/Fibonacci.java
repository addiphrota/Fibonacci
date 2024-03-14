public class Fibonacci {

    // Método fib1 usando recursão
    public static int fib1(int n) {
        if (n <= 1) {
            return n;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

    // Método fib2 usando um laço for
    public static int fib2(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    // Método fib3 usando um laço while
    public static int fib3(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        int i = 2;
        while (i < n) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
            i++;
        }
        return fib;
    }

    public static void main(String[] args) {
        // Imprimir os 20 primeiros números da série de Fibonacci
        for (int i = 0; i < 20; i++) {
            System.out.println("fib1(" + i + "): " + fib1(i));
            System.out.println("fib2(" + i + "): " + fib2(i));
            System.out.println("fib3(" + i + "): " + fib3(i));
            System.out.println();
        }
    }
}
