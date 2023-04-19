import java.util.Scanner;

// Dada una lista enlaza de N caracteres ingresadas por el usuario, eliminar los nodos 
// duplicados de la lista.
// Mostrar la lista antes y despues de eliminar los nodos duplicados de la lista
// Solicitar N al usuario   

public class ejercicio8 {
    
    public static void main(String args []) {
       //inicar el objeto Nodo8
        
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de nodos: ");
        n = sc.nextInt();
        Nodo8 cabeza = null;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el caracter: ");
            char caracter = sc.next().charAt(0);
            cabeza = Nodo8.insertarNodo(cabeza, caracter);
        }
        System.out.println("Lista original: ");
        Nodo8.mostrarLista(cabeza);
        cabeza = Nodo8.eliminarNodosDuplicados(cabeza);
        System.out.println("Lista sin nodos duplicados: ");
        Nodo8.mostrarLista(cabeza);
        
    }
}