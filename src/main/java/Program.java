import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner strInput = new Scanner(System.in);
        String choice, cont = "s";

        while (cont.equalsIgnoreCase("y")) {
            System.out.println("\t\t Employee Information System\n\n");

            System.out.println("1 ===> Adicionar novo aluno ");
            System.out.println("2 ===> Ver todos alunos ");
            System.out.println("3 ===> Remover aluno ");
            System.out.println("4 ===> Buscar aluno ");
            System.out.println("5 ===> Atualizar aluno ");

            System.out.print("\n\n");
            System.out.println("Escolha uma opção: ");
            choice = strInput.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Escolheu 1");
                    break;
                case "2":
                    System.out.println("Escolheu 2");
                    break;
                case "3":
                    System.out.println("Escolheu 3");
                    break;
                case "4":
                    System.out.println("Escolheu 4");
                    break;
                case "5":
                    System.out.println("Escolheu 5");
                    break;
                default:
                    System.out.println("Você deseja continuar? S/n");
                    cont = strInput.nextLine();
                    break;
            }
        }
    }
}
