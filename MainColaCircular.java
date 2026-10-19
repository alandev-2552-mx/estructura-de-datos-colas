package estructuras_lineales.COLA.mains;

import estructuras_lineales.COLA.ColaEstaticaCircular;

public class MainColaCircular {
    public static void main(String[] args) {
        System.out.println("=== Cola Estática Circular ===");
        ColaEstaticaCircular c = new ColaEstaticaCircular(3);

        c.encolar(10);
        c.encolar(20);
        c.encolar(30);
        c.mostrar();
        System.out.println("Frente (peek): " + c.peek());

        // Demostración clave: al desencolar liberamos huecos
        // que la circular SÍ reutiliza
        c.desencolar();
        c.desencolar();
        c.mostrar();

        // Aquí la cola lineal fallaría (fin llegó al tope),
        // la circular sigue funcionando porque reutiliza huecos
        c.encolar(40);
        c.encolar(50);
        c.mostrar();
        System.out.println("Frente (peek): " + c.peek());
        System.out.println("Elementos contados por recorrido circular.");
    }
}