import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Foram usadas a mesa logica e mesmas bibliotecas em todos os codigos

public class ListaSubconjunto {
    public static List<List<Integer>> gerarSubconjuntos(List<Integer> conjunto) { //Passa o conjunto como argumento
        List<List<Integer>> subconjuntos = new ArrayList<>();
        int n = conjunto.size();

        for (int i = 0; i < (1 << n); i++) {
            List<Integer> subconjunto = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subconjunto.add(conjunto.get(j));
                }
            }

            subconjuntos.add(subconjunto);
        }

        return subconjuntos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos no conjunto: ");
        int quantidadeElementos = scanner.nextInt(); //o valor é armazenado nessa variavel

        List<Integer> conjunto = new ArrayList<>();

        System.out.println("Digite os elementos do conjunto:");
        for (int i = 0; i < quantidadeElementos; i++) {
            int elemento = scanner.nextInt();
            conjunto.add(elemento);
        }

        List<List<Integer>> subconjuntos = gerarSubconjuntos(conjunto);

        System.out.println("Subconjuntos gerados:");
        for (List<Integer> subconjunto : subconjuntos) {
            System.out.println(subconjunto);
        }
    }
}

