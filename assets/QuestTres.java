

import java.util.*;

public class QuestTres {

    public static void main(String[] args) {
        int count = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a palavra: ");
        String palavra = entrada.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            for (int j = 0; j < palavra.length(); j++) {
                for (int k = j + 1; k < palavra.length() - i; k++) {

                    char subStr1[] = palavra.substring(j, j + 1 + i).toCharArray();
                    char subStr2[] = palavra.substring(k, k + i + 1).toCharArray();

                    if (subStr1.length == subStr2.length) {
                        Arrays.sort(subStr1);
                        Arrays.sort(subStr2);

                        if (Arrays.equals(subStr1, subStr2)) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
