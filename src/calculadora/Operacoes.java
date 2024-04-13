package calculadora;

public class Operacoes {
    private char operador;
    private long valorA;
    private long valorB;
    private long resultado;

    public Operacoes(long valorA, long valorB, char operador) {
        this.valorA = valorA;
        this.valorB = valorB;
        this.operador = operador;
    }

    public char getOperador() {
        return operador;
    }

    public long getValorA() {
        return valorA;
    }

    public long getValorB() {
        return valorB;
    }

    public long getResultado() {
        return resultado;
    }

    public void setResultado(long resultado) {
        this.resultado = resultado;
    }
}