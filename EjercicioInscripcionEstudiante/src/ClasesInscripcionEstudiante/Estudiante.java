package ClasesInscripcionEstudiante;

public class Estudiante extends Identificable {
    private int identificacion;
    private Fecha fecha;

    public Estudiante(Codigo codigo, Nombre nombre, int identificacion, Fecha fecha) {
        super(codigo, nombre);
        this.identificacion = identificacion;
        this.fecha = fecha;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return super.toString() + ", Identificación: " + identificacion + ", Fecha nacimiento: " + fecha;
    }
}
