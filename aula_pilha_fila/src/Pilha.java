public class Pilha {
    private Object[] elements;
    private int size;
    private int capacity;
    private int top;

    public Pilha(int capacity){
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.size = 0;
        this.top = -1;
    }

    public Object empilhar(Object element){
        if(size == capacity){
            throw new IllegalStateException("A pilha está cheia");
        }
        top++;
        elements[top] = element;
        size++;
        return element;
    }

    public Object desempilhar(){
        if(size == 0){
            throw new IllegalStateException("A pilha está vazia.");
        }
        Object removed = elements[top];
        top--;
        size--;

        return removed;
    }

    public Object top() {
        if(size == 0){
            throw new IllegalStateException("A pilha está vazia.");
        }
        return elements[top];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }
}
