import java.util.ArrayList; //Usamos para criar a lista seja ela dinamica que pode cresce ou diminuir tamanho
import java.util.List; // Permite trabalhar com  as listas.
import java.util.Scanner; //Essa biblioteca permite a interacao do usuario com o teclado

//Outra biblioteca que pode ser utilizada é o JUtil.read"TipoDeVariavel", porem para ser utilizada necessita do throws Exception
public class ListaAsterisco { //Declarando a classe
    public static List<String> criarListaAsteriscos(int n) {
        List<String> lista = new ArrayList<>(); //Cria uma nova lista vazia

        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder(); // o StringBuilder eh para construir a string de asteriscos

            for (int j = 0; j < i; j++) {
                sb.append("*"); //Coloca os asteriscos de acordo com a quantidade "i"
            }

            lista.add(sb.toString()); //converte p/ adicionar a lista
        }

        return lista; //Retorna a lista que foi criada
    } //Finalizacao do metodo

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Cria o objeto, para que possa haver a interacao com o usuario

        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt(); //Leitura do numero que o usuario colocou

        List<String> listaAsteriscos = criarListaAsteriscos(n); // Aqui esta chamando a funcao para criar a lista

        System.out.println("Aqui a lista de asteriscos: ");

        for (String asteriscos : listaAsteriscos) {
            System.out.println(asteriscos); //"Printa" a lista de asteriscos
        }
    }
}
