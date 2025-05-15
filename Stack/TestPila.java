package Stack;

import Excepciones.MensajeException;

public class TestPila {
    public static void main(String[] args) throws LinkedList.MensajeException {
        // Prueba con Integer
        Pila<Integer> pilaEnteros = new Pila<>();
        System.out.println("--- Prueba con Pila de Integers ---");
        System.out.println("¿Está vacía? " + pilaEnteros.isEmpty()); // Esperado: true

        pilaEnteros.push(10);
        System.out.println("Push(10)");
        pilaEnteros.push(20);
        System.out.println("Push(20)");
        pilaEnteros.push(30);
        System.out.println("Push(30)");

        System.out.print("Contenido de la pila: ");
        pilaEnteros.print(); // Esperado: [30, 20, 10] (o similar dependiendo de la implementación de print en ListaEnlazada)

        System.out.println("Tope: " + pilaEnteros.top()); // Esperado: 30

        System.out.println("Pop: " + pilaEnteros.pop()); // Esperado: 30
        System.out.print("Contenido después de pop: ");
        pilaEnteros.print(); // Esperado: [20, 10]

        System.out.println("Tope después de pop: " + pilaEnteros.top()); // Esperado: 20
        System.out.println("¿Está vacía? " + pilaEnteros.isEmpty()); // Esperado: false

        // Prueba con String
        Pila<String> pilaCadenas = new Pila<>();
        System.out.println("\n--- Prueba con Pila de Strings ---");
        System.out.println("¿Está vacía? " + pilaCadenas.isEmpty()); // Esperado: true

        pilaCadenas.push("Hola");
        System.out.println("Push(\"Hola\")");
        pilaCadenas.push("Mundo");
        System.out.println("Push(\"Mundo\")");

        System.out.print("Contenido de la pila: ");
        pilaCadenas.print(); // Esperado: [Mundo, Hola]

        System.out.println("Tope: " + pilaCadenas.top()); // Esperado: Mundo

        System.out.println("Pop: " + pilaCadenas.pop()); // Esperado: Mundo
        System.out.print("Contenido después de pop: ");
        pilaCadenas.print(); // Esperado: [Hola]

        System.out.println("Tope después de pop: " + pilaCadenas.top()); // Esperado: Hola
        System.out.println("¿Está vacía? " + pilaCadenas.isEmpty()); // Esperado: false

        System.out.println("Pop: " + pilaCadenas.pop()); // Esperado: Hola
        System.out.println("¿Está vacía después de segundo pop? " + pilaCadenas.isEmpty()); // Esperado: true

        // Prueba de pila vacía al hacer pop
        System.out.println("\n--- Prueba de Pop en Pila Vacía ---");
        pilaCadenas.pop(); // Intentar pop en pila vacía

        // Prueba con Double
        Pila<Double> pilaDobles = new Pila<>();
        System.out.println("\n--- Prueba con Pila de Doubles ---");
        pilaDobles.push(3.14);
        System.out.println("Push(3.14)");
        pilaDobles.push(2.71);
        System.out.println("Push(2.71)");
        System.out.println("Tope: " + pilaDobles.top()); // Esperado: 2.71

        System.out.print("Contenido de la pila: ");
        pilaDobles.print(); // Esperado: [2.71, 3.14]

        pilaDobles.destroyStack();
        System.out.println("destroyStack() llamado.");
        System.out.println("¿Está vacía después de destroy? " + pilaDobles.isEmpty()); // Esperado: true

    }
}
