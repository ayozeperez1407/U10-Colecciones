import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class GestionStock {

    public static void main(String[] args) {
        // TreeMap mantiene las claves ordenadas alfabéticamente de forma automática
        TreeMap<String, Integer> almacen = new TreeMap<>();
        Scanner leer = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n--- GESTIÓN DE STOCK DE REPUESTOS ---");
            System.out.println("1. Alta producto");
            System.out.println("2. Baja producto");
            System.out.println("3. Actualizar stock");
            System.out.println("4. Listar existencias");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            try {
                opcion = Integer.parseInt(leer.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Introduce el código del producto: ");
                        String nuevoCod = leer.nextLine().toUpperCase();
                        if (almacen.containsKey(nuevoCod)) {
                            System.out.println("¡Aviso! El código ya existe. No se ha realizado el alta.");
                        } else {
                            System.out.print("Introduce el stock inicial: ");
                            int stockIni = Integer.parseInt(leer.nextLine());
                            almacen.put(nuevoCod, stockIni);
                            System.out.println("Producto registrado con éxito.");
                        }
                        break;

                    case 2:
                        System.out.print("Introduce el código a eliminar: ");
                        String codBaja = leer.nextLine().toUpperCase();
                        if (almacen.remove(codBaja) != null) {
                            System.out.println("Producto eliminado.");
                        } else {
                            System.out.println("El código no existe.");
                        }
                        break;

                    case 3:
                        System.out.print("Introduce el código a actualizar: ");
                        String codAct = leer.nextLine().toUpperCase();
                        if (almacen.containsKey(codAct)) {
                            System.out.print("Introduce el nuevo stock: ");
                            int nuevoStock = Integer.parseInt(leer.nextLine());
                            almacen.put(codAct, nuevoStock);
                            System.out.println("Stock actualizado.");
                        } else {
                            System.out.println("El código no existe.");
                        }
                        break;

                    case 4:
                        if (almacen.isEmpty()) {
                            System.out.println("El almacén está vacío.");
                        } else {
                            System.out.println("\n--- LISTADO DE EXISTENCIAS ---");
                            // Al ser TreeMap, el entrySet ya viene ordenado
                            for (Map.Entry<String, Integer> entrada : almacen.entrySet()) {
                                System.out.println("Código: " + entrada.getKey() + " | Unidades: " + entrada.getValue());
                            }
                        }
                        break;

                    case 5:
                        System.out.println("Saliendo del sistema...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor, introduce un número válido.");
            }

        } while (opcion != 5);

        leer.close();
    }
}