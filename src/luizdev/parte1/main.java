package luizdev.parte1;
import java.util.*;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome das pessoas separados por ,");
        String[] nomesSemCorrecao = scanner.nextLine().split(",");

        String[] nomes = new String[nomesSemCorrecao.length];
        for (int i = 0; i < nomesSemCorrecao.length; i++) {
            nomes[i] = nomesSemCorrecao[i].trim();
        }
        Arrays.sort(nomes, String.CASE_INSENSITIVE_ORDER);

        for(String nome : nomes) {
            System.out.println("Nome: "+ nome);
        }

        scanner.close();
    }
}
