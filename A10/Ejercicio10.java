public class Ejercicio10 {
    public static void main(String[] args) {
        // El más rápido para insertar es HashSet (O(1))
        Set<Socio> socios = new HashSet<>();
        
        socios.add(new Socio("123", "Pepe"));
        socios.add(new Socio("456", "Maria"));
        socios.add(new Socio("789", "Juan"));
        socios.add(new Socio("123", "Duplicado")); // No se añade por el DNI

        System.out.println("¿Duplicado? No, tamaño: " + socios.size());

        // Conversión 1: Listado ordenado automático (TreeSet)
        Set<Socio> treeSocios = new TreeSet<>(socios);
        treeSocios.add(new Socio("001", "Presidente"));
        System.out.println("Ordenado por DNI: " + treeSocios);

        // Conversión 2: Lista para extraer el segundo
        List<Socio> listaFinal = new ArrayList<>(treeSocios);
        System.out.println("Segundo socio: " + listaFinal.get(1));
    }
}