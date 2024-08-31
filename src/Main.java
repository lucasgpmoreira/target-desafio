import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Q1Fibonacci q1 = new Q1Fibonacci();
        Q2ChecarLetraA q2 = new Q2ChecarLetraA();

        while (true) {
            System.out.println("Olá equipe target, digite qual o número referente a questão que deseja executar: ");
            System.out.println("1 - Fibonacci");
            System.out.println("2 - Checar letra 'a'");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    q1.getResults();
                    break;
                case 2:
                    q2.getResults();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

    }
}