import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EjercicioColeccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        int num;

        // Pedir números hasta introducir -1
        System.out.println("Introduce números enteros no negativos (-1 para terminar):");
        do {
            num = sc.nextInt();
            if (num != -1 && num >= 0) {
                numeros.add(num);
            }
        } while (num != -1);

        // Mostrar la colección completa
        System.out.println("\nColección completa:");
        System.out.println(numeros);

        // Mostrar valores pares
        System.out.println("\nValores pares:");
        for (Integer n : numeros) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }

        // Eliminar múltiplos de 3 usando iterador
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            Integer n = it.next();
            if (n % 3 == 0) {
                it.remove();
            }
        }

        // Mostrar colección resultante
        System.out.println("\n\nColección sin múltiplos de 3:");
        System.out.println(numeros);

        sc.close();
    }
}