package actividad1;

import Excepciones.ExceptionIsEmpty;
import Excepciones.MensajeException;

public class Test {
    public static void main(String[] args) {
        try {
            // Prueba con Integer
            StackArray<Integer> pilaEnteros = new StackArray<>(5);
            pilaEnteros.push(10);
            pilaEnteros.push(20);
            pilaEnteros.push(30);
            System.out.println(pilaEnteros.toString()); // Esperado: 30 20 10
            System.out.println("Tope: " + pilaEnteros.top()); // Esperado: 30
            System.out.println("Elemento eliminado: " + pilaEnteros.pop()); // Esperado: 30
            System.out.println(pilaEnteros.toString()); // Esperado: 20 10

            // Prueba con String
            StackArray<String> pilaCadenas = new StackArray<>(6);
            pilaCadenas.push("Algoritmos");
            pilaCadenas.push("Y");
            pilaCadenas.push("Estructura");
            pilaCadenas.push("De");
            pilaCadenas.push("Datos");
            System.out.println(pilaCadenas.toString());
            System.out.println("Tope: " + pilaCadenas.top());
            pilaCadenas.pop();
            pilaCadenas.pop();
            System.out.println("¿Está vacía?: " + pilaCadenas.isEmpty()); // Esperado: true

            // Prueba de pila llena
            StackArray<Character> pilaCaracteres = new StackArray<>(2);
            pilaCaracteres.push('A');
            pilaCaracteres.push('B');
            System.out.println("¿Está llena?: " + pilaCaracteres.isFull()); // Esperado: true
            pilaCaracteres.push('C');

        } catch (MensajeException | ExceptionIsEmpty e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
