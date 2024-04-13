package calculadora;

public class Calculadora {

    public Operacoes calcular(Operacoes operacao) {
        switch (operacao.getOperador()) {
            case '+':
                operacao.setResultado(soma(operacao));
                break;
            case '-':
                operacao.setResultado(subtracao(operacao));
                break;
            case '*':
                operacao.setResultado(multiplicacao(operacao));
                break;
            case '/':
                operacao.setResultado(divisao(operacao));
                break;
            default:
                operacao.setResultado(0);
                break;
        }
        return operacao;
    }

    public long soma(Operacoes operacao) {
        return operacao.getValorA() + operacao.getValorB();
    }

    public long subtracao(Operacoes operacao) {
        return operacao.getValorA() - operacao.getValorB();
    }

    public long multiplicacao(Operacoes operacao) {
        return operacao.getValorA() * operacao.getValorB();
    }

    public long divisao(Operacoes operacao) {
        return operacao.getValorA() / operacao.getValorB();
    }
}