package estructuras_lineales;

public class Nodo {
    public int dato;
    public Nodo siguiente; // Enlace al nodo de abajo

    // Constructor que inicializa el dato
    public Nodo(int x) {
        this.dato = x;
        this.siguiente = null;
    }
}