package menu;

import dominio.Instituicao;
import dominio.PessoaJuridica;
import form.InstituicaoForm;
import infra.Arquivo;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public static void mostrarMenu() {
        Scanner entrada = new Scanner(System.in);
        String escolha, cont = "s";
        while (cont.equalsIgnoreCase("s")) {
            System.out.println("\t\t Gestão de Instituição \n\n");

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
                	Instituicao instituicao = InstituicaoForm.incluir();
                    Arquivo<PessoaJuridica> pessoaJuridicaArquivo = new Arquivo<>(instituicao.getPessoaFisica());
                    Arquivo<Instituicao> instituicaoArquivo = new Arquivo<>(instituicao);
                    try {
                        pessoaJuridicaArquivo.salvar();
                        instituicaoArquivo.salvar();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
    }
}
