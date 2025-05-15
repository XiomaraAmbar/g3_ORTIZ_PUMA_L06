package actividad2;

import Excepciones.ExceptionIsEmpty;
import LinkedList.MensajeException;

public interface Queue<E> {
    void enqueue(E x) throws MensajeException;
    E dequeue() throws ExceptionIsEmpty, MensajeException;
    E front() throws ExceptionIsEmpty, MensajeException;
    E back() throws ExceptionIsEmpty, MensajeException;
    boolean isEmpty();
}
