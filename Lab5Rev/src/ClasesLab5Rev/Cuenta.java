package ClasesLab5Rev;
public abstract class Cuenta {
 
    protected int anoApertura;
    protected int numero;
    protected long saldo;
    protected Persona titular;
   

    public Cuenta(int numero, Persona titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    @Override
    public String toString() {
        return "Cuenta [Número: " + numero + ", Año de apertura: " + anoApertura + ", Titular: " + titular.getNombre() + ", Saldo: " + saldo + "]";
    }
}