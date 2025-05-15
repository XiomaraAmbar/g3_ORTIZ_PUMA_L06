package actividad2;

import Queue.Cola;
import LinkedList.MensajeException;

public class Test {
    public static void main(String[] args) {
        try {
            // Prueba con Integer
            Cola<Integer> colaEnteros = new Cola<Integer>();
            colaEnteros.enqueue(10);
            colaEnteros.enqueue(20);
            colaEnteros.enqueue(30);
            System.out.println("Contenido de la cola (enteros): ");
            colaEnteros.print(); // Esperado: 10 20 30
            System.out.println("Elemento al frente: ");
            colaEnteros.front(); // Esperado: 10
            System.out.println("Elemento desencolado: ");
            colaEnteros.dequeue();
            System.out.println("Contenido de la cola después de desencolar: ");
            colaEnteros.print(); // Esperado: 20 30

            // Prueba con String
            Cola<String> colaCadenas = new Cola<String>();
            colaCadenas.enqueue("Estructuras");
            colaCadenas.enqueue("Discretas");
            System.out.println("Contenido de la cola (cadenas): ");
            colaCadenas.print();
            System.out.println("Elemento al frente: ");
            colaCadenas.front();
            colaCadenas.dequeue();
            System.out.println("Contenido de la cola después de desencolar: ");
            colaCadenas.print();

            // Prueba con objetos tipo Double
            Cola<Double> colaDobles = new Cola<Double>();
            colaDobles.enqueue(3.14);
            colaDobles.enqueue(2.71);
            colaDobles.enqueue(1.61);
            System.out.println("Contenido de la cola (dobles): ");
            colaDobles.print(); // Esperado: 3.14 2.71 1.61
            System.out.println("Elemento al frente: " + colaDobles.front()); // Esperado: 3.14
            colaDobles.dequeue();
            System.out.println("Contenido de la cola después de desencolar: ");
            colaDobles.print(); // Esperado: 2.71 1.61

            // Prueba de cola vacía
            Cola<Integer> colaVacia = new Cola<Integer>();
            System.out.println("¿Está vacía la cola? " + colaVacia.isEmpty()); // Esperado: true
            // colaVacia.dequeue(); // Esto debería lanzar una excepción

        } catch (MensajeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
