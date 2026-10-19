package estructuras_lineales.COLA.mains;

import estructuras_lineales.COLA.ColaEstatica;

public class MainColaEstatica {
    public static void main(String[] args) {
        System.out.println("=== Cola Estática Lineal ===");
        ColaEstatica c = new ColaEstatica(3);

        c.encolar(10);
        c.encolar(20);
        c.encolar(30);
        c.encolar(40);          // Prueba de lleno
        c.mostrar();

        System.out.println("Frente (peek): " + c.peek());

        c.desencolar();
        c.mostrar();
        System.out.println("Frente (peek) tras desencolar: " + c.peek());
    }
}