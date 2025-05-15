package Queue;

import LinkedList.ListaEnlazada;
import LinkedList.MensajeException;
import actividad2.Queue;

public class Cola<E> implements Queue<E> {
    private ListaEnlazada<E> cola;

    public Cola() {
        cola = new ListaEnlazada<>();
    }

    //Verifica si la cola esta vacía
    public boolean isEmpty() {
        return cola.isEmpty();
    }

    //Tamaño de la cola
    public int length() throws MensajeException {
        return cola.length();
    }

    //Agrega el elemento x al final de la cola
    public void enqueue(E elemento) throws MensajeException {
        if (isEmpty()) {
            cola.insertFirst(elemento);
        } else {
            cola.insertLast(elemento);
        }
    }

    //Retorna el elemento que se ubica al inicio de la cola(desencolar)
    public E dequeue() throws MensajeException {
        E primero = front();
        cola.removeNodeK(0);
        return primero;
    }

    //Elimina los elementos de la cola dejándola vacía.
    public void destroyQueue() {
        cola.destroyList();
    }

    //Retorna el elemento inicial de la cola
    public E front() throws MensajeException {
        return cola.searchK(0);
    }

    //Retorna el elemento final de la cola
    public E back() throws MensajeException {
        return cola.searchK(cola.length() - 1);
    }

    //Verifica si la cola está llena o no. Se usa cuando la cola está implementada sobre una
    //    estructura estática.
    public void isFull() {

    }

    //Recorrido de la cola
    public void recorridoCola(){
        cola.recorridoLista();
    }

    //Imprime la pila
    public void print() throws MensajeException {
        cola.print();
    }

    //Buscar elemento en cola, y devolver su posicion
    public int search(E valor) throws MensajeException {
        return search(valor);
    }

    //Busca el k-ésimo elemento por su posición y retorna el nodo (valor)
    public E searchK(int k) throws MensajeException {
        return searchK(k);
    }
}
