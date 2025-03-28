package ClasesInscripcionEstudiante;

public class Proyecto extends Identificable {
    private String objetivo;

    public Proyecto(Codigo codigo, Nombre nombre, String objetivo) {
        super(codigo, nombre);
        this.objetivo = objetivo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Objetivo: " + objetivo;
    }
}
