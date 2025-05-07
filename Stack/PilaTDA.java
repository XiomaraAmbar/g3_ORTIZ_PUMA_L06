package Stack;

import Excepciones.ExceptionIsEmpty;

public interface PilaTDA<E> {
    boolean isEmpty(); //Verifica si la pila esta vacía
    void push(E elemento); //Agrega el elemento x al tope de la pila
    E pop() throws ExceptionIsEmpty; //Elimina el elemento del tope y lo retorna
    E top() throws ExceptionIsEmpty; //Retorna el último elemento sin eliminarlo (tope) -> valor
    void peek(); //Muestra el elemento del tope sin eliminarlo -> muestra el valor del top
}
