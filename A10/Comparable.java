class Socio implements Comparable<Socio> {
    String dni;
    String nombre;

    public Socio(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Socio o) {
        return this.dni.compareTo(o.dni);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Socio socio)) return false;
        return Objects.equals(dni, socio.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return dni + " - " + nombre;
    }
}