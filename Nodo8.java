public class Nodo8 {
    private char caracter;
    private Nodo8 siguiente;
    
    public Nodo8(char caracter) {
        this.caracter = caracter;
        this.siguiente = null;
    }
    
    public static Nodo8 insertarNodo(Nodo8 cabeza, char caracter) {
        if (cabeza == null) {
            return new Nodo8(caracter);
        } else {
            cabeza.siguiente = insertarNodo(cabeza.siguiente, caracter);
            return cabeza;
        }
    }
    
    public static void mostrarLista(Nodo8 cabeza) {
        if (cabeza != null) {
            System.out.print(cabeza.caracter + " ");
            mostrarLista(cabeza.siguiente);
        } else {
            System.out.println();
        }
    }
    
    public static Nodo8 eliminarNodosDuplicados(Nodo8 cabeza) {
        if (cabeza == null) {
            return null;
        } else {
            cabeza.siguiente = eliminarNodosDuplicados(cabeza.siguiente);
            if (cabeza.siguiente != null && cabeza.caracter == cabeza.siguiente.caracter) {
                return cabeza.siguiente;
            } else {
                return cabeza;
            }
        }
    }
}