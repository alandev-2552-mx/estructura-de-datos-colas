package estructuras_lineales.COLA.mains;

import estructuras_lineales.COLA.ColaDinamica;

public class MainColaDinamica {
    public static void main(String[] args) {
        System.out.println("=== Cola Dinámica ===");
        ColaDinamica c = new ColaDinamica();

        c.encolar(10);
        c.encolar(20);
        c.encolar(30);
        c.mostrar();

        System.out.println("Frente (peek): " + c.peek());
        System.out.println("Elementos en la cola: " + c.contarElementos());

        c.desencolar();
        c.mostrar();
        System.out.println("Frente (peek) tras desencolar: " + c.peek());
        System.out.println("Elementos en la cola: " + c.contarElementos());

        // La dinámica no tiene límite fijo:
        c.encolar(40);
        c.encolar(50);
        c.encolar(60);
        c.mostrar();
        System.out.println("Elementos totales: " + c.contarElementos());
    }
}