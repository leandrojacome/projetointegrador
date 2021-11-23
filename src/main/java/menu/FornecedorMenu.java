package menu;

import dominio.Fornecedor;
import dominio.PessoaJuridica;
import form.FornecedorForm;
import infra.Arquivo;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public static void mostrarMenu() {
        Scanner entrada = new Scanner(System.in);
        String escolha, cont = "s";
        while (cont.equalsIgnoreCase("s")) {
            System.out.println("\t\t Gestão de Fornecedor \n\n");

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
                	Fornecedor fornecedor = FornecedorForm.incluir();
                    Arquivo<PessoaJuridica> pessoaJuridicaArquivo = new Arquivo<>(fornecedor.getPessoaJuridica());
                    Arquivo<Fornecedor> fornecedorArquivo = new Arquivo<>(fornecedor);
                    try {
                        pessoaJuridicaArquivo.salvar();
                        fornecedorArquivo.salvar();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
    }
}
