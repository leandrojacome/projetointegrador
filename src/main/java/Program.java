import menu.AlunoMenu;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String escolha, cont = "s";

        while (cont.equalsIgnoreCase("s")) {
            System.out.println("\t\t Sistema de gestão academica \n\n");

            System.out.println("1 ===> Aluno ");
            System.out.println("2 ===> Professor ");
            System.out.println("3 ===> Diciplina ");
            System.out.println("4 ===> Instituição ");
            System.out.println("5 ===> Curso ");
            System.out.println("6 ===> Fornecedor ");
            System.out.println("7 ===> Compas ");

            System.out.print("\n\n");
            System.out.println("Escolha uma opção: ");
            escolha = entrada.nextLine();

            switch (escolha) {
                case "1":
                    AlunoMenu.mostrarMenu();
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
                    cont = entrada.nextLine();
                    break;
            }
        }
    }
}
