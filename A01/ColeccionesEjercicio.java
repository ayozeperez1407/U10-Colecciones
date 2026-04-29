import java.util.Arrays;

public class ColeccionesEjercicio {

    // Método genérico estático
    public static <T> T[] guardar(T elemento, T[] array) {
        // Crear nuevo array con una posición más
        T[] nuevoArray = Arrays.copyOf(array, array.length + 1);
        
        // Insertar el elemento al final
        nuevoArray[array.length] = elemento;
        
        return nuevoArray;
    }

    public static void main(String[] args) {
        // Array de Strings
        String[] palabras = {};
        palabras = guardar("Hola", palabras);
        palabras = guardar("Mundo", palabras);

        // Array de Integers
        Integer[] numeros = {};
        numeros = guardar(10, numeros);
        numeros = guardar(20, numeros);

        // Mostrar resultados
        System.out.println("Array de Strings:");
        System.out.println(Arrays.toString(palabras));

        System.out.println("Array de Integers:");
        System.out.println(Arrays.toString(numeros));
    }
}
