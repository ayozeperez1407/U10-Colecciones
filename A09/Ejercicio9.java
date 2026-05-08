import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 30; i++) lista.add(rnd.nextInt(100) + 1);
        System.out.println("Original: " + lista);

        // HashSet: No garantiza orden (basado en hash)
        Set<Integer> hashSet = new HashSet<>(lista);
        System.out.println("HashSet (Sin orden): " + hashSet);

        // TreeSet: Orden natural (ascendente)
        Set<Integer> treeSet = new TreeSet<>(lista);
        System.out.println("TreeSet (Ordenado): " + treeSet);

        // LinkedHashSet: Orden de inserción
        Set<Integer> linkedSet = new LinkedHashSet<>(lista);
        System.out.println("LinkedHashSet (Orden inserción): " + linkedSet);
    }
}