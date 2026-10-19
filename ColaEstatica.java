package estructuras_lineales.COLA;

public class ColaEstatica {
    private int[] datos;
    private int frente;
    private int fin;
    private int tamaño;

    // Constructor por defecto: capacidad 5
    public ColaEstatica() {
        this(5);
    }

    // Constructor con capacidad personalizada
    public ColaEstatica(int capacidad) {
        this.datos = new int[capacidad];
        this.frente = 0;
        this.fin = -1;
        this.tamaño = 0;
    }

    // Verifica si no hay elementos
    public boolean isEmpty() {
        return tamaño == 0;
    }

    // Verifica si el arreglo llegó a su límite
    public boolean isFull() {
        return tamaño == datos.length;
    }

    // Inserta un elemento al final de la cola
    public void encolar(int x) {
        if (!isFull()) {
            fin++;
            datos[fin] = x;
            tamaño++;
            System.out.println("Encolaste: " + x);
        } else {
            System.out.println("¡Cola llena! No se pudo encolar: " + x);
        }
    }

    // Extrae el elemento del frente controlando subdesbordamiento
    public int desencolar() {
        if (!isEmpty()) {
            int valor = datos[frente];
            frente++;
            tamaño--;
            System.out.println("Desencolaste: " + valor);
            return valor;
        } else {
            System.out.println("¡Cola vacía!");
            return -1;
        }
    }

    // Consulta el elemento del frente sin extraerlo
    public int peek() {
        if (!isEmpty()) {
            return datos[frente];
        } else {
            System.out.println("¡Cola vacía!");
            return -1;
        }
    }

    // Muestra el contenido de la cola del frente al fin
    public void mostrar() {
        if (isEmpty()) {
            System.out.println("Cola vacía.");
            return;
        }
        System.out.println("--- Cola Estática ---");
        System.out.print("Frente -> ");
        for (int i = frente; i <= fin; i++) {
            System.out.print("[" + datos[i] + "] ");
        }
        System.out.println("<- Fin");
    }
}