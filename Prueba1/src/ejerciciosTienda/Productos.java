package ejerciciosTienda;

public class Productos {
    private int codigo;
    private String nombreProducto;
    private Tipo tipo;
    private Fecha fechaVencimiento;

    public Productos(int codigo, String nombreProducto, Tipo tipo, Fecha fechaVencimiento) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.tipo = tipo;
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getCodigo() { return codigo; }
    public String getNombreProducto() { return nombreProducto; }
    public Tipo getTipo() { return tipo; }
    public Fecha getFechaVencimiento() { return fechaVencimiento; }

    @Override
    public String toString() {
        return "🔹 Código: " + codigo + " | Nombre: " + nombreProducto + 
               " | IVA: " + tipo.getIva() + "%" + 
               (fechaVencimiento != null ? " | Vence: " + fechaVencimiento : " | No perecedero");
    }
}
