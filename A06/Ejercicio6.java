import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) lista.add(rnd.nextInt(100) + 1);

        System.out.println("Original: " + lista);

        // Volcar a tabla
        Integer[] tabla = lista.toArray(new Integer[0]);

        // Ordenar (Menor a mayor)
        Arrays.sort(tabla);

        // Volcar a nueva colección
        List<Integer> listaOrdenada = new ArrayList<>(Arrays.asList(tabla));
        System.out.println("Ordenada: " + listaOrdenada);

        // ¿Cómo ordenarla de mayor a menor?
        // Opción A: Arrays.sort(tabla, Collections.reverseOrder());
        // Opción B: Collections.sort(listaOrdenada, Collections.reverseOrder());
    }
}