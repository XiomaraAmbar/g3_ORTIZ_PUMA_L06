package actividad1;

import Excepciones.ExceptionIsEmpty;
import Excepciones.MensajeException;

public class StackArray<E> implements Stack<E>{
    private E[] array;
    private int tope;
    public StackArray(int n){
        this.array = (E[])new Object[n];
        tope = -1;
    }
    public void push(E x) throws MensajeException {
        if (isFull()) {
            throw new MensajeException("Pila llena, no se puede insertar.");
        }
        tope = tope + 1;
        array[tope] = x;
    }

    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Pila vacía, no se puede eliminar.");
        }
        E valor = array[tope];
        tope = tope - 1;
        return valor;
    }

    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Pila vacía, no hay tope.");
        }
        return array[tope];
    }

    public boolean isEmpty() {
        return this.tope == -1;
    }

    public boolean isFull (){
        return tope == array.length - 1;
    }

    public String toString(){
        if (isEmpty()){
            return "Pila vacía.";
        }
        StringBuilder sb = new StringBuilder("Pila: ");
        for (int i = tope; i >= 0; i--) {
            sb.append(array[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
