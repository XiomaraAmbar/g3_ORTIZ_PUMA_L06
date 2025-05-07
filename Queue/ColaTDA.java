package Queue;

public interface ColaTDA<E> {

    boolean isEmpty(); //Verifica si la cola esta vacía
    void enqueue(E elemento); //Agrega el elemento x al final de la cola
    E dequeue(); //Retorna el elemento que se ubica al inicio de la cola(desencolar)
    E front(); //Retorna el elemento inicial de la cola
    E back(); //Retorna el elemento final de la cola
}
