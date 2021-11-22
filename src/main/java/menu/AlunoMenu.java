package menu;

import dominio.Aluno;
import dominio.PessoaFisica;
import form.AlunoForm;
import infra.Arquivo;

import java.io.IOException;
import java.util.Scanner;

public class AlunoMenu {

    public static void mostrarMenu() {
        Scanner entrada = new Scanner(System.in);
        String escolha, cont = "s";
        while (cont.equalsIgnoreCase("s")) {
            System.out.println("\t\t Gestão de Aluno \n\n");

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
                    Aluno aluno = AlunoForm.incluir();
                    Arquivo<PessoaFisica> pessoaFisicaArquivo = new Arquivo<>(aluno.getPessoaFisica());
                    Arquivo<Aluno> alunoArquivo = new Arquivo<>(aluno);
                    try {
                        pessoaFisicaArquivo.salvar();
                        alunoArquivo.salvar();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }

    }
}
