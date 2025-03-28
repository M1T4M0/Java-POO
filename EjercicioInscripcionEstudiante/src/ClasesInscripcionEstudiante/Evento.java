package ClasesInscripcionEstudiante;

public class Evento extends Identificable {
    private Fecha fecha;

    public Evento(Codigo codigo, Nombre nombre, Fecha fecha) {
        super(codigo, nombre);
        this.fecha = fecha;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fecha del evento: " + fecha;
    }
}
