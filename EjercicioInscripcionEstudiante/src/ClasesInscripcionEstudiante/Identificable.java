package ClasesInscripcionEstudiante;

public class Identificable {
    protected Codigo codigo;
    protected Nombre nombre;

    public Identificable(Codigo codigo, Nombre nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Codigo getCodigo() {
        return codigo;
    }

    public void setCodigo(Codigo codigo) {
        this.codigo = codigo;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre;
    }
}
