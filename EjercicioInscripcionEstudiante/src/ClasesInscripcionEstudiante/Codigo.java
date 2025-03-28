package ClasesInscripcionEstudiante;

public class Codigo {
    private int codigo;
    private char letra;

    public Codigo(int codigo, char letra) {
        this.codigo = codigo;
        this.letra = letra;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return codigo + String.valueOf(letra);
    }
}
