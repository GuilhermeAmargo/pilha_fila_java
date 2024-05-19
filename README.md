# Implementação de Estruturas de Dados Fila e Pilha em Java

Este projeto contém a implementação de duas estruturas de dados fundamentais: Fila e Pilha. A implementação inclui métodos básicos para manipulação e testes das estruturas. O projeto também inclui uma classe Main para demonstrar o uso das estruturas.

## Classe Fila
A classe Fila representa uma fila que segue a ordem FIFO (First In, First Out).

Atributos:
- private Object[] elements: Array que armazena os elementos da fila.
- private int size: Tamanho atual da fila.
- private int capacity: Capacidade máxima da fila.
- private int beginning: Índice do início da fila.
- private int end: Índice do final da fila.
  
Construtor:
- public Fila(int capacity): Inicializa uma nova instância de Fila com a capacidade especificada.

Métodos:
- public Object adicionar(Object element): Adiciona um elemento ao final da fila.
- public Object remove(): Remove e retorna o elemento do início da fila.
- public Object first(): Retorna o primeiro elemento da fila sem removê-lo.
- public boolean isEmpty(): Verifica se a fila está vazia.
- public int size(): Retorna o tamanho atual da fila.

## Classe Pilha
A classe Pilha representa uma pilha que segue a ordem LIFO (Last In, First Out).

Atributos:
- private Object[] elements: Array que armazena os elementos da pilha.
- private int size: Tamanho atual da pilha.
- private int capacity: Capacidade máxima da pilha.
- private int top: Índice do topo da pilha.

Construtor:
- public Pilha(int capacity): Inicializa uma nova instância de Pilha com a capacidade especificada.

Métodos:
- public Object empilhar(Object element): Adiciona um elemento ao topo da pilha.
- public Object desempilhar(): Remove e retorna o elemento do topo da pilha.
- public Object top(): Retorna o elemento do topo da pilha sem removê-lo.
- public boolean isEmpty(): Verifica se a pilha está vazia.
- public int size(): Retorna o tamanho atual da pilha.

## Classe Main
A classe Main contém o método main que demonstra o uso das classes Fila e Pilha com exemplos práticos de adição, remoção e consulta de elementos.
