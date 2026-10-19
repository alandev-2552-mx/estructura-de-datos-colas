package estructuras_lineales.COLA;

import estructuras_lineales.Nodo;

public class ColaDinamica {
    private Nodo frente;
    private Nodo fin;

    public ColaDinamica() {
        this.frente = null;
        this.fin = null;
    }

    // Verifica si la cola no tiene nodos
    public boolean estaVacia() {
        return frente == null;
    }

    // Inserta un nuevo nodo al final
    public void encolar(int x) {
        Nodo nuevo = new Nodo(x);
        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
        System.out.println("Encolaste: " + x);
    }

    // Extrae el nodo del frente
    public int desencolar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return -1;
        }
        int valor = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        System.out.println("Desencolaste: " + valor);
        return valor;
    }

    // EXTENSION 1: consultar el frente sin extraerlo
    public int peek() {
        if (estaVacia()) {
            System.out.println("¡Cola vacía!");
            return -1;
        }
        return frente.dato;
    }

    // EXTENSION 2: contar cuantos elementos hay
    public int contarElementos() {
        int contador = 0;
        Nodo actual = frente;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    // Recorre y muestra los nodos del frente al fin
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía");
            return;
        }
        System.out.println("--- Cola Dinámica ---");
        Nodo actual = frente;
        System.out.print("Frente -> ");
        while (actual != null) {
            System.out.print("[" + actual.dato + "] ");
            actual = actual.siguiente;
        }
        System.out.println("<- Fin");
    }
}