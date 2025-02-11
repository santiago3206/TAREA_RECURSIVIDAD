package TAREA_RECURSIVIDAD;
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int numero = 10; 
        System.out.println("Serie de Fibonacci hasta " + numero + " términos:");
        for (int i = 0; i < numero; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
