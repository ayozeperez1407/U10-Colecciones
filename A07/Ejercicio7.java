import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        List<Integer> lista2 = new ArrayList<>(Arrays.asList(99, 99));

        lista1.add(0, 5); // Insertar 5 en índice 0
        lista1.addAll(2, lista2); // Insertar lista2 en índice 2

        System.out.println("Elemento en índice 4: " + lista1.get(4));

        int sustituido = lista1.set(lista1.size() - 1, 500);
        System.out.println("Valor sustituido: " + sustituido);

        lista1.remove(1); // Elimina por índice
        lista1.remove(Integer.valueOf(99)); // Elimina la primera ocurrencia del objeto 99

        System.out.println("Estado final: " + lista1);
    }
}