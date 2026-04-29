import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class EliminarCincos {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random rand = new Random();

        // Insertar 100 números aleatorios entre 1 y 10
        for (int i = 0; i < 100; i++) {
            int num = rand.nextInt(10) + 1; // 1 a 10
            numeros.add(num);
        }

        // Mostrar colección original
        System.out.println("Colección original:");
        System.out.println(numeros);

        // Eliminar los elementos que valgan 5 usando Iterator
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            Integer num = it.next();
            if (num == 5) {
                it.remove();
            }
        }

        // Mostrar colección después de eliminar los 5
        System.out.println("\nColección sin el número 5:");
        System.out.println(numeros);
    }
}