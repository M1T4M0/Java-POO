package ClasesLab5Rev;
public class Persona {
    private int id;
    private String nombre;
    private String correo;

    public Persona(int id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + ", correo=" + correo + "]";
    }
}
