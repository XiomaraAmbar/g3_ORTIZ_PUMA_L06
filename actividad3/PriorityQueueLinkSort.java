/*package Queue;

import LinkedList.ListaEnlazada;
import LinkedList.MensajeException;
import LinkedList.Nodo;

public class PriorityQueueLinkSort<E> {
    private ListaEnlazada<NodoPrioridad<E>> colaPrioridad;  // Usamos una lista única para almacenar los nodos con prioridades

    public PriorityQueueLinkSort() {
        colaPrioridad = new ListaEnlazada<>();
    }

    // Verifica si la cola está vacía
    public boolean isEmpty() {
        return colaPrioridad.isEmpty();
    }

    // Agrega el elemento x con prioridad p a la cola
    public void enqueue(E elemento, int prioridad) throws MensajeException {
        NodoPrioridad<E> nuevoNodo = new NodoPrioridad<>(elemento, prioridad);

        if (isEmpty()) {
            // Si la cola está vacía, simplemente insertamos el nuevo nodo
            colaPrioridad.insertLast(nuevoNodo);
        } else {
            Nodo<NodoPrioridad<E>> nodoTemporal = colaPrioridad.getCabecera().getSiguiente();
            boolean nodoInsertado = false;

            // Recorremos la lista buscando el lugar adecuado para insertar el nuevo nodo
            while (nodoTemporal != null) {
                NodoPrioridad<E> nodoActual = nodoTemporal.getValor();

                if (prioridad < nodoActual.getPrioridad()) {
                    // Si encontramos un nodo con mayor prioridad, insertamos el nuevo nodo antes
                    colaPrioridad.insertBefore(nuevoNodo, nodoTemporal);
                    nodoInsertado = true;
                    break;
                } else if (prioridad == nodoActual.getPrioridad()) {
                    // Si la prioridad es la misma, insertamos al final de los nodos con la misma prioridad
                    while (nodoTemporal.getSiguiente() != null &&
                            nodoTemporal.getSiguiente().getValor().getPrioridad() == prioridad) {
                        nodoTemporal = nodoTemporal.getSiguiente();
                    }
                    colaPrioridad.insertAfter(nuevoNodo, nodoTemporal);
                    nodoInsertado = true;
                    break;
                }
                nodoTemporal = nodoTemporal.getSiguiente();
            }

            // Si no se insertó el nodo, significa que la prioridad es la menor, por lo tanto lo insertamos al final
            if (!nodoInsertado) {
                colaPrioridad.insertLast(nuevoNodo);
            }
        }
    }

    // Elimina el elemento de mayor prioridad (el primero en la lista)
    public E dequeue() throws MensajeException {
        if (isEmpty()) {
            throw new MensajeException("La cola de prioridad está vacía.");
        }
        NodoPrioridad<E> nodoEliminado = colaPrioridad.removeFirst();
        return nodoEliminado.getValor();
    }

    // Longitud de la cola de prioridad
    public int length() {
        return colaPrioridad.length();
    }

    // Elimina todos los elementos de la cola
    public void destroyQueue() {
        colaPrioridad.destroyList();
    }

    // Retorna el primer elemento (el de mayor prioridad)
    public E front() throws MensajeException {
        if (isEmpty()) {
            throw new MensajeException("La cola de prioridad está vacía.");
        }
        return colaPrioridad.getCabecera().getSiguiente().getValor().getValor();
    }

    // Retorna el último elemento (el de menor prioridad)
    public E back() throws MensajeException {
        if (isEmpty()) {
            throw new MensajeException("La cola de prioridad está vacía.");
        }
        Nodo<NodoPrioridad<E>> nodoTemporal = colaPrioridad.getCabecera();
        while (nodoTemporal.getSiguiente() != null) {
            nodoTemporal = nodoTemporal.getSiguiente();
        }
        return nodoTemporal.getValor().getValor();
    }

    // Imprime la cola de prioridad
    public void print() throws MensajeException {
        if (isEmpty()) {
            throw new MensajeException("La cola de prioridad está vacía.");
        }
        Nodo<NodoPrioridad<E>> nodoTemporal = colaPrioridad.getCabecera().getSiguiente();
        while (nodoTemporal != null) {
            NodoPrioridad<E> nodo = nodoTemporal.getValor();
            System.out.println("Elemento: " + nodo.getValor() + ", Prioridad: " + nodo.getPrioridad());
            nodoTemporal = nodoTemporal.getSiguiente();
        }
    }
}*/

