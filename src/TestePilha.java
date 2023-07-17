
public class TestePilha {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>(5);
        
        System.out.println("Pilha está vazia? " + pilha.isEmpty()); // true
        
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        
        System.out.println("Tamanho da pilha: " + pilha.size()); // 3
        System.out.println("Elemento no topo da pilha: " + pilha.peek()); // 30
        
        System.out.println("Removendo elementos da pilha:");
        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
        
        System.out.println("Pilha está vazia? " + pilha.isEmpty()); // true
        
        // Teste de exceção quando a pilha está vazia
//        pilha.pop(); // Descomente esta linha para testar a exceção
        
        //  Teste de exceção quando a pilha está cheia 
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);
        pilha.push(60);
        
    }
}