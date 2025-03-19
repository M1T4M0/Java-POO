package ejerciciosTienda;

public class Fecha {
    private int año;
    private int mesVencimiento;
    private int diaVencimiento;

    public Fecha(int año, int mesVencimiento, int diaVencimiento) {
        this.año = año;
        this.mesVencimiento = mesVencimiento;
        this.diaVencimiento = diaVencimiento;
    }

    public int getAño() { return año; }
    public int getMesVencimiento() { return mesVencimiento; }
    public int getDiaVencimiento() { return diaVencimiento; }

    @Override
    public String toString() {
        return diaVencimiento + "-" + mesVencimiento + "-" + año;
    }
}
