public class Fila {
    private Object[] elements;
    private int size;
    private int capacity;
    private int beginning;
    private int end;

    public Fila(int capacity){
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.size = 0;
        this.beginning = 0;
        this.end = -1;
    }

    public Object adicionar(Object element){
        if (size == capacity) {
            throw new IllegalStateException("A fila está cheia");

        }
        end = (end + 1);
        elements[end] = element;
        size++;

        return element;
        }
        public Object remove() {
            if (size == 0) {
                throw new IllegalStateException("A fila está azia.");
            }
            Object removed = elements[beginning];
            beginning = (beginning + 1 );
            size--;
            return removed;
            }

            public Object first() {
        if(size == 0) {
                throw new IllegalStateException("A fila está vazia");
            }
        return elements[beginning];
        }

        public boolean isEmpty() {
        return size == 0;
        }

        public int size() {
            return size;
        }
}

