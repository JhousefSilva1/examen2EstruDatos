import java.util.Scanner;

// dado un arreglo de valores constantes no repetidos, escriba una funcion recursiva
// que halle la posicion de un valor buscado el cual será ingreaso por el usuario
public class ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valor;
        System.out.println("Ingrese el valor a buscar: ");
        valor = sc.nextInt();
        int posicion = buscarValor(arreglo, valor, 0);
        if (posicion == -1) {
            System.out.println("El valor no se encuentra en el arreglo");
        } else {
            System.out.println("El valor se encuentra en la posicion: " + posicion);
        }
    }

    public static int buscarValor(int[] arreglo, int valor, int posicion) {
        if (posicion == arreglo.length) {
            return -1;
        } else if (arreglo[posicion] == valor) {
            return posicion;
        } else {
            return buscarValor(arreglo, valor, posicion + 1);
        }
    }
}