# Calculadora - Case para Engenharia de Software JR

## Descrição

Este é um case para a vaga de Engenharia de Software JR, onde você precisará corrigir problemas em um código existente de uma calculadora e implementar funcionalidades adicionais, conforme especificado abaixo.

## Problemas a serem corrigidos

1. **Aplicação só está processando o primeiro item da fila infinitamente.**
   - A aplicação deve processar todos os itens da fila e não ficar presa apenas no primeiro.

2. **Implemente a funcionalidade de divisão.**
   - Adicione o cálculo de divisão à aplicação para que possa ser realizado corretamente.

3. **Aplicação não está calculando a penúltima operação corretamente.**
   - Certifique-se de que todas as operações na fila são calculadas corretamente, incluindo a penúltima.

## Funcionalidades adicionais a serem implementadas

1. **Implemente uma funcionalidade para imprimir toda a lista de operações a ser processada após cada cálculo realizado.**
   - Após cada cálculo realizado, a lista de operações restantes na fila deve ser impressa no console.

2. **Crie uma nova pilha (Stack) para guardar o resultado de cada cálculo efetuado e imprima a pilha ao final.**
   - Crie uma pilha para armazenar os resultados de cada cálculo realizado e imprima essa pilha ao final de todos os cálculos.

## Saída esperada no console

A saída esperada no console após a execução da aplicação deve ser a seguinte:

```
   14 - 8 = 6
   Operações restantes na fila:
   5 * 6 = 0
   2147483647 + 2 = 0
   18 / 3 = 0

   Resultados dos cálculos realizados:
   6
   30
   2147483649
   6
```
