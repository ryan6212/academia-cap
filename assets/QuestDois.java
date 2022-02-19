
import java.util.*;

public class QuestDois {

    public static void main(String[] args) {
        System.out.print("Digite sua senha: ");
        Scanner entrada = new Scanner(System.in);
        String senha = entrada.nextLine();

        if (senha.matches("(?=.*[!@#$%^&*()-+])(?=.*[a-zA-Z])(?=.*[0-9]).{6,}")) {
            System.out.println("Senha aceita");
        } else if (senha.length() < 6) {
            System.out.println("Faltam " + (6 - senha.length() + " caracteres") + " senha não aceita ");
        } else {
            System.out.println("Senha não aceita");
        }

    }
}
