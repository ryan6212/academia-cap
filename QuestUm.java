
import java.util.*;

public class QuestUm {

    public static void main(String[] args) {
        List array = new ArrayList();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de degraus: ");

        int degraus = entrada.nextInt();

        for (int i = 1; i <= degraus; i++) {
            int espaco = degraus - 1;
            array.add(" ".repeat(espaco) + "*".repeat((i)));

        }

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));

        }

    }
}
