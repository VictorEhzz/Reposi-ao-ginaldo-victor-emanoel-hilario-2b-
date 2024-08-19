import java.util.Stack;
import java.util.LinkedList;
public class pilha {
    public static void main (String[] args) {
        System.out.println("Pilha de carros");
        Stack<String> carros = new Stack<>();
        carros.push("Mustang");
        carros.push("Camaro");
        carros.push("Fiat uno");
        System.out.println("Aqui está o carro que estava no topo da pilha: " + carros.pop());
        System.out.println("Foi colocado um novo elemento no topo: "  + carros.peek());
        System.out.println("Agora a pilha está desse jeito: " + carros);
          }
    }