// Escriba una funcion recursiva que imprima la suma del contenido de las posiciones
// pares de un arreglo constante de numeros enteros. El arreglo es constante y lo define
// el estudiante, minimo 3 elementos
public class Ejercicio5 {
    
    public static void main(String args[]) {
        
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int suma = sumarPosicionesPares(arreglo, 0);
        System.out.println("La suma de las posiciones pares es: " + suma);
    }
    public static int sumarPosicionesPares(int[] arreglo, int posicion) {
        if (posicion == arreglo.length) {
            return 0;
        } else if (posicion % 2 == 0) {
            return arreglo[posicion] + sumarPosicionesPares(arreglo, posicion + 1);
        } else {
            return sumarPosicionesPares(arreglo, posicion + 1);
        }
    }
}