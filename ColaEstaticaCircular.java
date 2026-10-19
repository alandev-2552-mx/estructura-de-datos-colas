package estructuras_lineales.COLA;

public class ColaEstaticaCircular {
    private int[] datos;
    private int frente;
    private int fin;
    private int tamaño;

    // Constructor por defecto: capacidad 5
    public ColaEstaticaCircular() {
        this(5);
    }

    // Constructor con capacidad personalizada
    public ColaEstaticaCircular(int capacidad) {
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

    // Inserta un elemento al final de la cola (avance circular)
    public void encolar(int x) {
        if (!isFull()) {
            fin = (fin + 1) % datos.length;
            datos[fin] = x;
            tamaño++;
            System.out.println("Encolaste: " + x);
        } else {
            System.out.println("¡Cola llena! No se pudo encolar: " + x);
        }
    }

    // Extrae el elemento del frente (avance circular)
    public int desencolar() {
        if (!isEmpty()) {
            int valor = datos[frente];
            frente = (frente + 1) % datos.length;
            tamaño--;
            System.out.println("Desencolaste: " + valor);
            return valor;
        } else {
            System.out.println("¡Cola vacía!");
            return -1;
        }
    }

    // peek() solicitado en la tarea no modifica apuntadores xd
    public int peek() {
        if (tamaño == 0) {
            System.out.println("Cola vacía!");
            return -1;
        }
        return datos[frente];
    }

    // Muestra el contenido respetando el orden circular
    public void mostrar() {
        if (isEmpty()) {
            System.out.println("Cola vacía.");
            return;
        }
        System.out.println("--- Cola Estática Circular ---");
        System.out.print("Frente -> ");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("[" + datos[(frente + i) % datos.length] + "] ");
        }
        System.out.println("<- Fin");
    }
}