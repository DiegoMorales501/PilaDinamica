package Estructuras_lineales;

public class PilaDinamica {
    // Referencia al nodo de arriba (la cima). null significa pila vacía
    Nodo cima;

    // Constructor: la pila nace vacía
    public PilaDinamica() {

        this.cima = null;
    }

    // Inserta un nodo nuevo en la cima
    void push(int x){
        Nodo nuevo = new Nodo(x);
        nuevo.siguiente = cima;

        cima = nuevo;
    }

    // Extrae el nodo de la cima, controlando el subdesbordamiento
    void pop(){
        if(cima != null){
            System.out.println("Sacaste de la pila: " + cima.dato);
            cima = cima.siguiente;
        }
        else{
            System.out.println("Pila  Dinamca vacia");
        }
    }

    // Recorre e imprime los elementos, de la cima al fondo
    void mostrar(){
        Nodo actual = cima;
        System.out.print("Pila Dinamica (Cima -> Fondo): ");

        while(actual != null){
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    // (A agregar) Verifica si la cima no contiene nodos (cima == null)
    void isEmpty(){
        if(cima != null){
            System.out.println("La cima contine nodos");
        }
        else{
            System.out.println("La cima no contiene nodos");
        }
    }

    // (A agregar) Consulta el valor de la cima sin desvincular el nodo
    void peek(){
        if(cima != null){
            System.out.println("cima: " + cima.dato);
        }
        else{
            System.out.println("Pila Dinammica vacia, no hay cima");
        }
    }
}
