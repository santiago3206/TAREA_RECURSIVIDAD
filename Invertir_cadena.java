package TAREA_RECURSIVIDAD;

public class Invertir_cadena {
    public static String invertirCadena(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return invertirCadena(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String cadena = "Hola Mundo"; 
        String invertida = invertirCadena(cadena);
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + invertida);
    }
}
