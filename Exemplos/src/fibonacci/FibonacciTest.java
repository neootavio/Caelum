package fibonacci;

public class FibonacciTest {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        for (int i = 1; i <= 50; i++) {
            int resultado = fibonacci.calculaFibonacci(i);
            System.out.print(resultado + " - ");
        }
    }
}
