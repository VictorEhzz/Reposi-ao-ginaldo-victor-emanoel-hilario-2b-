
import java.util.Queue;
import java.util.LinkedList;
public class fila {
public static void main (String[] args) {
  System.out.println("Fila de Pessoas");
Queue<String> Pessoas = new LinkedList<>(); 
Pessoas.add("João");
Pessoas.add("Geraldo");
Pessoas.add("Cezar");

System.out.println("Aqui está sua fila: " + Pessoas);
System.out.println("O primeiro da fila é: " + Pessoas.peek());
System.out.println("Primeiro da fila é retirado: " + Pessoas.poll());
System.out.println(Pessoas.isEmpty()?"A Fila está vazia": "Tem elementos na Fila");
System.out.println("Agora a fila está desse jeito" + Pessoas);
System.out.println("Fila de Pessoas");
 }
}