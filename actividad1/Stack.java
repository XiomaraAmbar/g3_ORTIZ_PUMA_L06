package actividad1;

import Excepciones.ExceptionIsEmpty;
import Excepciones.MensajeException;

public interface Stack<E>{
    void push(E x) throws MensajeException;
    E pop() throws ExceptionIsEmpty;
    E top() throws ExceptionIsEmpty;
    boolean isEmpty();
}
