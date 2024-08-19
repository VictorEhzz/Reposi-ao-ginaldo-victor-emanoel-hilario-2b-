import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListExemplo{


    public static void main(String[] args){

        List<String> Jogos = new ArrayList();

        Jogos.add("God of War");
        Jogos.add("Just Cause 3");
        Jogos.add("Fifa 23");
        Jogos.add("Mortal Kombat 11");
        Jogos.add("Marvel's Spider-Man: Miles Morales");
        Jogos.add("Assassin's Creed IV: Black Flag");
        Collections.sort(Jogos);

        System.out.println("Essa é sua lista" + Jogos);
        System.out.println("Abaixo estão os elementos pegos na posição");
        System.out.println(Jogos.get(4));
        System.out.println(Jogos.remove(1));
        System.out.println("O tamanho da lista é: " + Jogos.size());
        System.out.println("A lista está assim agora" + Jogos);
    }
}