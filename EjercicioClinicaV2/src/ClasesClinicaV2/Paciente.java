package ClasesClinicaV2;

public class Paciente extends Persona {
	private String direccion;
	private double telefono;
	
	public Paciente(int id, String nombre, String direccion, double telefono) {
		super(id, nombre); // ← llamada a la clase padre
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public double getTelefono() {
		return telefono;
	}
	
	public void setTelefono(double telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + "]";
	}	
}
