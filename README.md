# AED-1026 Estructura de Datos - Unidad 3
# Práctica: Colas (Estáticas, Circular y Dinámicas) en Java

# Alumno: Pale Mendoza Alan Cristopher  
# Docente: Víctor Hugo Vásquez Herrera  
# Instituto Tecnológico Superior de Xalapa 

---

# Descripción

Implementación en Java de tres estructuras de colas (Queue), siguiendo el principio **FIFO (First In, First Out)**:

- **Cola Estática Lineal:** Arreglo de tamaño fijo.
- **Cola Estática Circular:** Arreglo que reutiliza espacios libres usando el operador `%`.
- **Cola Dinámica:** Nodos enlazados que crecen según la necesidad.

---

# Estructura del proyecto

El código está dividido de forma modular, con un `Main` independiente para probar cada cola:

```text
java_quick/
└── estructuras_lineales/
    ├── Nodo.java
    └── COLA/
        ├── ColaEstatica.java
        ├── ColaEstaticaCircular.java
        ├── ColaDinamica.java
        └── mains/
            ├── MainColaEstatica.java
            ├── MainColaCircular.java
            └── MainColaDinamica.java

# Métodos principales

encolar(int x): Inserta un elemento al final.

desencolar(): Saca el elemento del frente.

peek(): Consulta el frente sin sacarlo.

mostrar(): Imprime la cola en consola.

(La Cola Dinámica incluye un método extra: contarElementos())