package TAREA_RECURSIVIDAD;

public class RECURSIVIDAD_3_JUNTOS {
    //Torres de Hanoi
    public static void moverDiscos(int n, char origen, char auxiliar, char destino) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }
        moverDiscos(n - 1, origen, destino, auxiliar);
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
        moverDiscos(n - 1, auxiliar, origen, destino);
    }

    //Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //invertir una cadena
    public static String invertirCadena(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return invertirCadena(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
    	
        int numeroDeDiscos = 3;
        System.out.println("Torres de Hanoi con " + numeroDeDiscos + " discos:");
        moverDiscos(numeroDeDiscos, 'A', 'B', 'C');
        
        int numero = 10;
        System.out.println("\nSerie de Fibonacci hasta " + numero + " términos:");
        for (int i = 0; i < numero; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        
        String cadena = "Hola Mundo";
        System.out.println("\nCadena original: " + cadena);
        System.out.println("Cadena invertida: " + invertirCadena(cadena));
    }
}
