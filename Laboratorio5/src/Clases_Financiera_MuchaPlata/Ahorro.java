package Clases_Financiera_MuchaPlata;

public class Ahorro extends Cuenta {
	
private String FechaUltimoRetiro;
private Double ValorRetiro;

public Ahorro(String numeroProducto, int anioApertura, Clases_Financiera_MuchaPlata.Titular titular, Double saldo,
		String fechaUltimoRetiro, Double valorRetiro) {
	super(numeroProducto, anioApertura, titular, saldo);
	FechaUltimoRetiro = fechaUltimoRetiro;
	ValorRetiro = valorRetiro;
}

public String getFechaUltimoRetiro() {
	return FechaUltimoRetiro;
}

public void setFechaUltimoRetiro(String fechaUltimoRetiro) {
	FechaUltimoRetiro = fechaUltimoRetiro;
}

public Double getValorRetiro() {
	return ValorRetiro;
}

public void setValorRetiro(Double valorRetiro) {
	ValorRetiro = valorRetiro;
}

@Override
public void mostrarContenido() {
	// TODO Auto-generated method stud
	System.out.println();
	System.out.println("---------------------------🤑🤑🤑 Financiera Mucha Plata 🤑🤑🤑---------------------------------------------------------------");
	System.out.println("​​👋​ Bienvenido ​​👋​");
	System.out.println("Titular: " + Titular.getNombre() + " - " + Titular.getCorreo());
	System.out.println("Cuenta de Ahorro Registrada:       " + "|" + NumeroProducto + "|" +  " |Año: " + AnioApertura + "|" + " |Saldo Actual de: $" + Saldo + "|");
	System.out.println("Ultimo Retiro Registrado de valor: " + "|" + ValorRetiro  + "|" + " " + "|" + "Fecla: " + FechaUltimoRetiro + "|");
	System.out.println("​​​​​​​🕚​ Cargando........");
	System.out.println("--------------------------------- 💰​ Cuenta de Ahorro 💰​---------------------------------------------------------------");
}



}
