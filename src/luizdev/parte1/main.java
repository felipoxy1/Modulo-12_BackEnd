package luizdev.parte1;
import java.util.*;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome das pessoas separados por ,");
        String[] nomes =  scanner.nextLine().split(",");

        for(String nome : nomes) {
            System.out.println("Nome: "+ nome.trim());
        }

        scanner.close();
    }
}
