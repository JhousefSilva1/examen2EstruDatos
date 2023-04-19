import java.util.Scanner;

// Escriba una funcion recursiva que reciva una cadena y verifica si es palindrioma
// "Se lee igual al derecho que al revez"

public class ejercicio7 {
    public static void main(String args []) {
        String cadena= "";
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa una palabra ");
        cadena = sc.nextLine();
        
        boolean palindromo = verificarPalindromo(cadena, 0, cadena.length() - 1);
        if (palindromo) {
            System.out.println("La cadena es palindromo");
        } else {
            System.out.println("La cadena no es palindromo");
        }   
    }
    public static boolean verificarPalindromo(String cadena, int inicio, int fin) {
        if (inicio == fin) {
            return true;
        } else if (cadena.charAt(inicio) != cadena.charAt(fin)) {
            return false;
        } else {
            return verificarPalindromo(cadena, inicio + 1, fin - 1);
        }
    }
}