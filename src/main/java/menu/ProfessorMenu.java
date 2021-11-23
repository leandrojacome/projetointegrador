package menu;

import dominio.Professor;
import dominio.PessoaFisica;
import form.ProfessorForm;
import infra.Arquivo;

import java.io.IOException;
import java.util.Scanner;

public class ProfessorMenu {

    public static void mostrarMenu() {
        Scanner entrada = new Scanner(System.in);
        String escolha, cont = "s";
        while (cont.equalsIgnoreCase("s")) {
            System.out.println("\t\t Gestão de Professor \n\n");

            System.out.println("1 ===> Listar ");
            System.out.println("2 ===> Incluir ");
            System.out.println("3 ===> Visualizar ");
            System.out.println("4 ===> Alterar ");
            System.out.println("5 ===> Excluir ");

            System.out.print("\n\n");
            System.out.println("Escolha uma opção: ");
            escolha = entrada.nextLine();

            switch (escolha) {
                case "2":
                    Professor professor = ProfessorForm.incluir();
                    Arquivo<PessoaFisica> pessoaFisicaArquivo = new Arquivo<>(professor.getPessoaFisica());
                    Arquivo<Professor> professorArquivo = new Arquivo<>(professor);
                    try {
                        pessoaFisicaArquivo.salvar();
                        professorArquivo.salvar();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
    }
}
