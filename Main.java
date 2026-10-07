package Estructuras_lineales;

public class Main {
    static void main(String[] args) {

        // Se crea la pila dinámica (empieza vacía)
        PilaDinamica miPila = new PilaDinamica();

        System.out.println("=== INSERTANDO ELEMENTOS (PUSH) ===");

        // Se insertan 3 nodos; el último en entrar (30) queda en la cima
        miPila.push(10);
        miPila.push(20);
        miPila.push(30);

        miPila.mostrar();// Recorre de la cima al fondo: 30 20 10
        miPila.isEmpty();// Hay nodos, así que la cima no es null

        System.out.println("\n=== SACANDO UN ELEMENTO (POP) ===");
        miPila.pop(); // Saca el 30
        miPila.peek();// Consulta la nueva cima (20) sin sacarla
    }
}
