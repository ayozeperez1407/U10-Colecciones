import java.util.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        List<String> listaA = new ArrayList<>(Arrays.asList("Ana", "Luis", "Marta", "Luis"));
        List<String> listaB = new ArrayList<>(Arrays.asList("Ana", "Luis", "Marta", "Luis"));

        System.out.println("¿Son iguales? " + listaA.equals(listaB));
        System.out.println("Primera pos Luis: " + listaB.indexOf("Luis"));
        System.out.println("Última pos Luis: " + listaB.lastIndexOf("Luis"));

        Collections.sort(listaA);
        System.out.println("¿Iguales tras ordenar A? " + listaA.equals(listaB));

        listaB.sort(Collections.reverseOrder());
        System.out.println("Lista B inversa: " + listaB);
    }
}