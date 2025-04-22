package Clases_Financiera_MuchaPlata;

public class Titular {
	
private int Id;
private String Nombre;
private String Correo;

public Titular(int id, String nombre, String correo) {
	super();
	Id = id;
	Nombre = nombre;
	Correo = correo;
}

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}

public String getCorreo() {
	return Correo;
}

public void setCorreo(String correo) {
	Correo = correo;
}



}
