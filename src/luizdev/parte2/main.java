package luizdev.parte2;
import java.util.*;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> grupos = new HashMap<>();
        grupos.put("M", new ArrayList<>());
        grupos.put("F", new ArrayList<>());

        System.out.println("Digite os nomes com sexo separados por vírgula e hífen (ex: Luiz-M,Maria-F): ");
        String respostaInicial = scanner.nextLine();

        String[] pessoas = respostaInicial.split(",");

        for (String pessoa : pessoas) {
            String[] dadosPessoa = pessoa.split("-");

            if (dadosPessoa.length == 2) {
                String nome = dadosPessoa[0].trim();
                String sexo = dadosPessoa[1].trim().toUpperCase();

                if (sexo.equals("M") || sexo.equals("F")) {
                    grupos.get(sexo).add(nome);
                } else {
                    System.out.println("Sexo invalido a: " + nome);
                }
            } else {
                System.out.println("Algo esta errado: " + pessoa);
            }
        }

        System.out.println("\nGrupo masculino");
        grupos.get("M").forEach(System.out::println);

        System.out.println("\nGrupo Feminino");
        grupos.get("F").forEach(System.out::println);
    }
}
