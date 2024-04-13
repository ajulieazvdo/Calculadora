package calculadora;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Program {

    public static void main(String[] args) {
        Queue<Operacoes> filaOperacoes = new LinkedList<>();
        filaOperacoes.add(new Operacoes(14, 8, '-'));
        filaOperacoes.add(new Operacoes(5, 6, '*'));
        filaOperacoes.add(new Operacoes(2147483647, 2, '+'));
        filaOperacoes.add(new Operacoes(18, 3, '/'));

        Calculadora calculadora = new Calculadora();
        Stack<Long> resultados = new Stack<>();

        while (!filaOperacoes.isEmpty()) {
            Operacoes operacao = filaOperacoes.peek();
            calculadora.calcular(operacao);
            resultados.push(operacao.getResultado());
            System.out.println(operacao.getValorA() + " " +
                    operacao.getOperador() + " " + operacao.getValorB() + " = "
                    + operacao.getResultado());
            filaOperacoes.poll();
            imprimirListaOperacoes(filaOperacoes);
            System.out.println();
        }
        imprimirResultados(resultados);
    }

    public static void imprimirListaOperacoes(Queue<Operacoes> filaOperacoes) {
        System.out.println("Operações restantes na fila:");
        filaOperacoes.forEach(operacao -> System.out.println(
                operacao.getValorA() + " " +
                        operacao.getOperador() + " " +
                        operacao.getValorB() + " = " +
                        operacao.getResultado()
        ));
    }

    public static void imprimirResultados(Stack<Long> resultados) {
        System.out.println("Resultados dos cálculos realizados:");
        resultados.forEach(System.out::println);
    }
}