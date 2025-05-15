package Queue;

import LinkedList.ListaEnlazada;
import LinkedList.MensajeException;
import LinkedList.Nodo;

public class ColaDePrioridad<E> {
    private ListaEnlazada<ListaEnlazadaPrioridad> colaPrioridad; //Se crea una nueva cola
    //Lo que sirve para almacenar listas enlazadas en cada nodo de la cola

    public ColaDePrioridad(){
        colaPrioridad = new ListaEnlazada<>();
    }

    //Verifica si la cola esta vacía
    public boolean isEmpty(){
        return colaPrioridad.isEmpty();
    }

    //Agrega el elemento x con prioridad p.
    public void enqueue(E elemento, int prioridad) throws MensajeException {
        if (isEmpty()){
            ListaEnlazadaPrioridad<E> sublista = new ListaEnlazadaPrioridad<>();
            sublista.insertLast(elemento, prioridad);
            sublista.setPrioridadCabecera(prioridad);
            colaPrioridad.insertLast(sublista);
        }
        else{
            Nodo<ListaEnlazadaPrioridad> nodoTemporal = colaPrioridad.getCabecera().getSiguiente();
            int posicion = 0;
            boolean nodoinsertado = false;

            while (nodoTemporal != null) {
                ListaEnlazadaPrioridad<E> sublista = nodoTemporal.getValor();

                if (prioridad == sublista.getPrioridadCabecera()) {
                    sublista.insertLast(elemento, prioridad);
                    nodoinsertado = true;
                    break;
                }

                if (prioridad > sublista.getPrioridadCabecera()) {
                    ListaEnlazadaPrioridad<E> nuevaSublista = new ListaEnlazadaPrioridad<>();
                    nuevaSublista.insertLast(elemento, prioridad);
                    nuevaSublista.setPrioridadCabecera(prioridad);

                    colaPrioridad.insertPosicionK(nuevaSublista, posicion);
                    nodoinsertado = true;
                    break;
                }

                nodoTemporal = nodoTemporal.getSiguiente();
                posicion=posicion + 1;
            }

            if (!nodoinsertado) {
                ListaEnlazadaPrioridad<E> sublistaFinal = new ListaEnlazadaPrioridad<>();
                sublistaFinal.insertLast(elemento, prioridad);
                sublistaFinal.setPrioridadCabecera(prioridad);
                colaPrioridad.insertLast(sublistaFinal);
            }
        }
    }

    //Elimina el elemento de mayor prioridad. La cola debe existir y no estar vacía.
    public E dequeue() throws MensajeException {
        E primero = frontSublista();
        colaPrioridad.removeNodeK(0);
        return primero;
    }

    //Longitud de la cola de prioridad
    public int length() {
        return lengthPrincipal() + lengthSublistas();
    }

    //Longitud de la cola de prioridad principal sin sublistas
    public int lengthPrincipal() {
        return colaPrioridad.length();
    }

    //Longitud de las sublistas
    public int lengthSublistas() {
        int contadorFinal = 0;
        Nodo<ListaEnlazadaPrioridad> nodoTemporal = colaPrioridad.getCabecera().getSiguiente(); //Nuevo nodo igual a cabecera de la cola
        while (nodoTemporal != null) {
            ListaEnlazadaPrioridad<E> sublista = nodoTemporal.getValor();
            contadorFinal = contadorFinal + sublista.length();
            nodoTemporal = nodoTemporal.getSiguiente();
        }
        return contadorFinal;
    }

    //Elimina los elementos de la cola dejándola vacía.
    public void destroyQueue(){
        colaPrioridad.destroyList();
    }

    //Retorna el elemento inicial de la cola (como es prioridad retorna la sublista)
    public ListaEnlazadaPrioridad front() throws MensajeException {
        return colaPrioridad.searchK(0);
    }

    //Retorna el elemento inicial de la sublista del primer nodo
    public E frontSublista() throws MensajeException {
        if (colaPrioridad.isEmpty()){
            throw new MensajeException("La cola de prioridad esta vacía.");
        }
        Nodo<ListaEnlazadaPrioridad> nodoTemporal = colaPrioridad.getCabecera().getSiguiente(); //Nuevo nodo igual a cabecera de la cola
        ListaEnlazadaPrioridad<E> sublista = nodoTemporal.getValor();
        if (sublista.isEmpty()){
            throw new MensajeException("Sublista vacía.");
        }
        return sublista.searchK(0);
    }

    //Retorna el elemento final de la cola
    public ListaEnlazadaPrioridad back() throws MensajeException {
        return colaPrioridad.searchK(colaPrioridad.length()-1);
    }

    //Retorna el elemento final de la sublista del primer nodo
    public E backSublista() throws MensajeException {
        if (colaPrioridad.isEmpty()){
            throw new MensajeException("La cola de prioridad esta vacía.");
        }
        Nodo<ListaEnlazadaPrioridad> nodoTemporal = colaPrioridad.getCabecera().getSiguiente(); //Nuevo nodo igual a cabecera de la cola
        ListaEnlazadaPrioridad<E> sublista = nodoTemporal.getValor();
        if (sublista.isEmpty()){
            throw new MensajeException("Sublista vacía.");
        }
        return sublista.searchK(colaPrioridad.length()-1);
    }

    //Verifica si la cola está llena o no. Se usa cuando la cola está implementada sobre una
    //    estructura estática.
    public void isFull(){

    }

    //Imprime la cola
    public void print() throws MensajeException {
        colaPrioridad.print();
    }
}