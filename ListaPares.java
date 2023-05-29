import java.util.ArrayList;//Usamos para criar a lista seja ela dinamica que pode cresce ou diminuir tamanho
import java.util.Arrays; //Permite trabalhar com array
import java.util.List;// Permite trabalhar com  as listas.
import java.util.Scanner;//Essa biblioteca permite a interacao do usuario com o teclado

//Outra biblioteca que pode ser utilizada é o JUtil.read"TipoDeVariavel", porem para ser utilizada necessita do throws Exception

public class ListaPares{
    public static List<List<Integer>> encontrarParesMenorDiferenca(int[] nums) {
        Arrays.sort(nums); // Ordena o array em ordem crescente
        int menorDiferenca = Integer.MAX_VALUE; // Inicializa a menor diferença com um valor máximo inteiro
        List<List<Integer>> pares = new ArrayList<>(); // Lista que armazena os pares com menor diferença

        // Encontra a menor diferença
        for (int i = 0; i < nums.length - 1; i++) {
            int diferenca = Math.abs(nums[i] - nums[i + 1]);

            if (diferenca < menorDiferenca) {
                menorDiferenca = diferenca;
                pares.clear(); // Limpa a lista anterior de pares
                pares.add(Arrays.asList(nums[i], nums[i + 1]));
            } else if (diferenca == menorDiferenca) {
                pares.add(Arrays.asList(nums[i], nums[i + 1]));
            }
        }

        return pares;
    } //Metodo

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de elementos no array: ");
        int n = scanner.nextInt(); //Lê o número de elementos

        int[] nums = new int[n]; //criando a array num com o tamanho n

        System.out.println("Digite os elementos do array:");

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt(); //Faz a leitura do numeor digitado
        }

        List<List<Integer>> paresMenorDiferenca = encontrarParesMenorDiferenca(nums); //Aqui chama a função, passando o array nums como argumento

        System.out.println("Pares com menor diferença:");
        for (List<Integer> par : paresMenorDiferenca) {
            System.out.println("(" + par.get(0) + ", " + par.get(1) + ")");
        }
    }
}
