package ClasesInscripcionEstudiante;

public class Programa extends Identificable {
    private String facultad;

    public Programa(Codigo codigo, Nombre nombre, String facultad) {
        super(codigo, nombre);
        this.facultad = facultad;
    }

    public String getFacultad() { return facultad; }
    public void setFacultad(String facultad) { this.facultad = facultad; }

    @Override
    public String toString() {
        return super.toString() + ", Facultad: " + facultad;
    }
}
