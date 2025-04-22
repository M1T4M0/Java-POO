package Clases_Financiera_MuchaPlata;

public abstract class Cuenta implements Imprimible {
	
protected String NumeroProducto;
protected int AnioApertura;
protected Titular Titular;
protected Double Saldo;

public Cuenta(String numeroProducto, int anioApertura, Clases_Financiera_MuchaPlata.Titular titular, Double saldo) {
	NumeroProducto = numeroProducto;
	AnioApertura = anioApertura;
	Titular = titular;
	Saldo = saldo;
}

@Override
public abstract void mostrarContenido();




}
