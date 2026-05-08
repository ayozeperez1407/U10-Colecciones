import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 100; i++) {
            numeros.add(rnd.nextInt(10) + 1);
        }
        System.out.println("Colección original: " + numeros);

        List<Integer> aEliminar = new ArrayList<>();
        aEliminar.add(5);

        // Borra todas las ocurrencias de los elementos contenidos en 'aEliminar'
        numeros.removeAll(aEliminar);

        System.out.println("Resultado tras eliminar los 5: " + numeros);
    }
}