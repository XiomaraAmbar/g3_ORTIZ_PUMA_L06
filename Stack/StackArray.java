package Stack;

import Excepciones.ExceptionIsEmpty;

public class StackArray<E> implements PilaTDA<E>{
    private E[] array;
    private int tope;
    public StackArray(int n){
        this.array = (E[])new Object[n];
        tope = -1;
    }

    //Verifica si la lista esta vacía
    public boolean isEmpty() {
        return false;
    }

    public boolean isFull (){
        // include here your code
    }

    public void push(E elemento) {

    }

    public E pop() throws ExceptionIsEmpty {
        return null;
    }

    public E top() throws ExceptionIsEmpty {
        return null;
    }

    public void peek() {

    }

    //The elements must be included in the chain from the one at the top
    //to the one at the bottom of the stack.
    public String toString(){
        // include here your code
    }
}
