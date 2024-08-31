import java.util.Scanner;

public class Q2ChecarLetraA {
    public int checkLetterA(String word) {
        char[] letters = word.toCharArray();
        int count = 0;
        for (char letter : letters) {
            if (letter == 'a') {
                count++;
            }
        }
        return count;
    }

    public void getResults() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra para checar se contém a letra 'a': ");
        String word = scanner.nextLine();
        if (checkLetterA(word) > 0) {
            System.out.println("A palavra " + word + " contém a letra 'a', e aparece " + checkLetterA(word) + " vezes");
        } else {
            System.out.println("A palavra " + word + " não contém a letra 'a'");
        }

    }
}
