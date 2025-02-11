package TAREA_RECURSIVIDAD;
public class Torres_de_Hanoi {
    public static void moverDiscos(int n, char origen, char auxiliar, char destino) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }
        // se mueve n-1 discos de origen a auxiliar
        moverDiscos(n - 1, origen, destino, auxiliar);
        // se mueve el disco n de origen a destino
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
        // se mueve n-1 discos de auxiliar a destino, usando el origen como apoyo
        moverDiscos(n - 1, auxiliar, origen, destino);
    }

    public static void main(String[] args) {
        int numeroDeDiscos = 3; 
        moverDiscos(numeroDeDiscos, 'A', 'B', 'C');
    }
}

