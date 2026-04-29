import java.util.ArrayList;
import java.util.Random;

public class SinRepetidos {
    public static void main(String[] args) {
        ArrayList<Integer> listaOriginal = new ArrayList<>();
        ArrayList<Integer> listaSinRepetidos = new ArrayList<>();
        Random rand = new Random();

        // Generar 20 números aleatorios entre 1 y 10
        for (int i = 0; i < 20; i++) {
            int num = rand.nextInt(10) + 1; // 1 a 10
            listaOriginal.add(num);
        }

        // Mostrar lista original
        System.out.println("Lista original:");
        System.out.println(listaOriginal);

        // Crear lista sin repetidos
        for (Integer num : listaOriginal) {
            if (!listaSinRepetidos.contains(num)) {
                listaSinRepetidos.add(num);
            }
        }

        // Mostrar lista sin repetidos
        System.out.println("\nLista sin repetidos:");
        System.out.println(listaSinRepetidos);
    }
}