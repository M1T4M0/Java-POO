package ClasesInscripcionEstudiante;

import java.util.List;

public class Inscripcion {
    private Fecha fecha;
    private Programa programa;
    private List<Proyecto> proyectos;

    public Inscripcion(Fecha fecha, Programa programa, List<Proyecto> proyectos) {
        this.fecha = fecha;
        this.programa = programa;
        this.proyectos = proyectos;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    @Override
    public String toString() {
        return "Inscripción [fecha=" + fecha + ", programa=" + programa + ", proyectos=" + proyectos + "]";
    }
}

