package actividad2;

package Queue;

public class QueueArray<E> implements Queue<E> {
    private Object[] elementos;
    private int frente;
    private int fin;
    private int tamaño;
    private int capacidad;

    public QueueArray() {
        capacidad = 10; // capacidad inicial
        elementos = new Object[capacidad];
        frente = 0;
        fin = -1;
        tamaño = 0;
    }

    public boolean isEmpty() {
        return tamaño == 0;
    }

    public int length() {
        return tamaño;
    }

    private void expandirCapacidad() {
        int nuevaCapacidad = capacidad * 2;
        Object[] nuevoArreglo = new Object[nuevaCapacidad];
        for (int i = 0; i < tamaño; i++) {
            nuevoArreglo[i] = elementos[(frente + i) % capacidad];
        }
        elementos = nuevoArreglo;
        frente = 0;
        fin = tamaño - 1;
        capacidad = nuevaCapacidad;
    }

    public void enqueue(E elemento) {
        if (tamaño == capacidad) {
            expandirCapacidad();
        }
        fin = (fin + 1) % capacidad;
        elementos[fin] = elemento;
        tamaño++;
    }

    public E dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cola vacía");
        }
        @SuppressWarnings("unchecked")
        E elemento = (E) elementos[frente];
        frente = (frente + 1) % capacidad;
        tamaño--;
        return elemento;
    }

    public void destroyQueue() {
        elementos = new Object[capacidad];
        frente = 0;
        fin = -1;
        tamaño = 0;
    }

    public E front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cola vacía");
        }
        @SuppressWarnings("unchecked")
        E elemento = (E) elementos[frente];
        return elemento;
    }

    public E back() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cola vacía");
        }
        @SuppressWarnings("unchecked")
        E elemento = (E) elementos[fin];
        return elemento;
    }

    public void isFull() {
        // No aplica directamente ya que expandimos la capacidad
    }

    public void recorridoCola() {
        System.out.print("Cola: ");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(elementos[(frente + i) % capacidad] + " ");
        }
        System.out.println();
    }

    public void print() {
        recorridoCola();
    }

    public int search(E valor) {
        for (int i = 0; i < tamaño; i++) {
            @SuppressWarnings("unchecked")
            E elemento = (E) elementos[(frente + i) % capacidad];
            if (elemento.equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    public E searchK(int k) throws Exception {
        if (k < 0 || k >= tamaño) {
            throw new Exception("Índice fuera de rango");
        }
        @SuppressWarnings("unchecked")
        E elemento = (E) elementos[(frente + k) % capacidad];
        return elemento;
    }
}

