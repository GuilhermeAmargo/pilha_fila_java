public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        //Testando fila
        System.out.println("Adicionando: " + fila.adicionar("Abelha"));
        System.out.println("Adicionando: " + fila.adicionar("Bernardo"));
        System.out.println("Adicionando: " + fila.adicionar("Casa"));
        System.out.println("Adicionando: " + fila.adicionar("Dragão"));
        System.out.println("Adicionando: " + fila.adicionar("Enzo"));

        System.out.println("A fila esta vazia? " + fila.isEmpty());

        System.out.println("Primeiro elemento da fila: " + fila.first());

        System.out.println("Tamanho da fila: " + fila.size());

        while (!fila.isEmpty()){
            System.out.println("Removendo da fila: " + fila.remove());
        }

        System.out.println("A fila esta vazia? " + fila.isEmpty());

        //Testando pilha
        Pilha pilha = new Pilha(4);

        System.out.println();

        System.out.println("Adicionando: " + pilha.empilhar("Fábio"));
        System.out.println("Adicionando: " + pilha.empilhar("Geraldo"));
        System.out.println("Adicionando: " + pilha.empilhar("Helicoptero"));
        System.out.println("Adicionando: " + pilha.empilhar("Igor"));

        System.out.println("A pilha esta vazia? " + pilha.isEmpty());

        System.out.println("Primeiro elemento da pilha: " + pilha.top());

        System.out.println("Tamanho da pilha: " + pilha.size());

        while (!pilha.isEmpty()){
            System.out.println("Removendo da pilha: " + pilha.desempilhar());
        }

        System.out.println("A pilha esta vazia? " + pilha.isEmpty());

        System.out.println("Acabou");
    }
}
