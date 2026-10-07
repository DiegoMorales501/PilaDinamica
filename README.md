# Pila dinámica en Java 

Aquí hago una **pila dinámica** en Java, o sea, una pila hecha con **nodos enlazados** (nada de arreglos).

## ¿Qué es una pila?

Es como una pila de platos: el último que pones arriba es el primero que quitas. A eso se le llama **LIFO** (*Last In, First Out*).

---

## Archivos del proyecto

```
Estructuras_lineales/
├── Nodo.java            # El "ladrillito": guarda un dato y apunta al de abajo
├── PilaDinamica.java    # La pila (push, pop, mostrar, isEmpty, peek)
└── Main.java            # Para probar que todo funciona
```

---

## Estático vs. dinámico, sin complicarse

**Estático (arreglo):**
- Es como una caja con espacios numerados y de tamaño fijo.
- Los datos están pegaditos uno junto al otro en la memoria (contiguos).
- Si se llenan los espacios, ya no cabe nada más (eso es el *desbordamiento*).

**Dinámico (nodos enlazados):**
- Es como un tren de vagones: cada vagón (**nodo**) lleva un dato y apunta al siguiente.
- Los nodos pueden estar en cualquier parte de la memoria, no tienen que estar juntos.
- Se crean cuando los necesitas, así que la pila crece sola. El único límite es la RAM.
- Por eso aquí **no existe `isFull()`**: no hay un tamaño fijo que se pueda llenar.

| | Estática (arreglo) | Dinámica (nodos) |
|---|---|---|
| Memoria | Pegada, en un solo bloque | Repartida, enlazada |
| Tamaño | Fijo | Crece y se encoge |
| ¿Se puede llenar? | Sí | Solo si se acaba la RAM |
| ¿Cómo sé si está vacía? | `tope == -1` | `cima == null` |

---

## ¿Qué hace cada método?

- `push(int x)`: crea un nodo nuevo y lo pone arriba, en la cima.
- `pop()`: quita el nodo de la cima. Si no hay nada, avisa que está vacía.
- `mostrar()`: imprime los elementos de arriba hacia abajo (cima → fondo).
- `isEmpty()`: dice si la cima no tiene nodos (`cima == null`).
- `peek()`: te dice qué hay en la cima **sin quitarlo**.

---

## Cómo compilarlo y correrlo

Necesitas tener el **JDK de Java** instalado. Para comprobarlo, escribe `java -version` y `javac -version` en la terminal.

### Con la terminal

1. Abre la terminal en la carpeta que **contiene** a `Estructuras_lineales` (en IntelliJ o Eclipse normalmente es `src`).

2. Compila:

```bash
javac Estructuras_lineales/*.java
```

3. Ejecuta:

```bash
java Estructuras_lineales.Main
```

> Ojo: se corre con el nombre del paquete (`Estructuras_lineales.Main`), sin entrar a la carpeta.

### Con un IDE (IntelliJ, Eclipse, NetBeans)

1. Abre el proyecto.
2. Revisa que las clases estén en el paquete `Estructuras_lineales`.
3. Abre `Main` y dale a **Run**.

---

## Ejemplo de ejecución

El `Main` mete 3 números (10, 20 y 30), muestra la pila, checa si está vacía, saca uno y mira qué quedó en la cima.

```text
=== INSERTANDO ELEMENTOS (PUSH) ===
Pila Dinamica (Cima -> Fondo): 30 20 10 
La cima contiene nodos

=== SACANDO UN ELEMENTO (POP) ===
Sacaste de la pila: 30
cima: 20
```

Se ve que el 30 salió primero porque fue el último en entrar. Eso es LIFO. 

---

## Notas rápidas

- No tiene `isFull()` porque su capacidad depende de la RAM.
- Si haces `pop()` o `peek()` con la pila vacía, solo avisa; no se rompe nada.