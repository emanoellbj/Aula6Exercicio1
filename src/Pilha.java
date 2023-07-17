
public class Pilha<T> {
    private T[] elementos;
    private int topo;

    // Construtor que recebe o tamanho do array elementos como parâmetro
    public Pilha(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        topo = -1;
    }

    // Verifica se a pilha está cheia
    public boolean isFull() {
        return topo == elementos.length - 1;
    }

    // Verifica se a pilha está vazia
    public boolean isEmpty() {
        return topo == -1;
    }

    // Adiciona um elemento ao topo da pilha
    public void push(T elemento) {
        if (isFull()) {
            throw new IllegalStateException("A pilha está cheia.");
        }

        topo++;
        elementos[topo] = elemento;
    }

    // Remove o elemento do topo da pilha e o retorna
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }

        T elemento = elementos[topo];
        elementos[topo] = null;
        topo--;

        return elemento;
    }

    // Retorna o elemento do topo da pilha sem removê-lo
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }

        return elementos[topo];
    }

    // Retorna a quantidade de elementos na pilha
    public int size() {
        return topo + 1;
    }
}
