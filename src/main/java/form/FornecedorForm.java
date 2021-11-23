package form;

import dominio.Fornecedor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FornecedorForm {
    public static Fornecedor incluir() {
        Scanner entrada = new Scanner(System.in);
        Fornecedor fornecedor = new Fornecedor();
        
        System.out.println("Informe os dados do fornecedor: \n\n");
        
        System.out.println("Informe o id do fornecedor: ");
        Integer id = Integer.parseInt(entrada.nextLine());
        fornecedor.getPessoaJuridica().setId(id);
        fornecedor.setId(id);
        
        System.out.println("Informe a razão social do fornecedor: ");
        fornecedor.getPessoaJuridica().setRazaoSocial(entrada.nextLine());
        
        System.out.println("Informe o nome fantasia do fornecedor: ");
        fornecedor.getPessoaJuridica().setNomeFantasia(entrada.nextLine());
        
        System.out.println("Informe o CNPJ do fornecedor: ");
        fornecedor.getPessoaJuridica().setCnpj(entrada.nextLine());
        
        System.out.println("Informe a incrição estadual do fornecedor: ");
        fornecedor.getPessoaJuridica().setInscricaoEstadual(entrada.nextLine());
        
        System.out.println("Informe a incrição estadual do fornecedor: ");
        fornecedor.getPessoaJuridica().setInscricaoMunicipal(entrada.nextLine());
        
        System.out.println("Informe o Data de Fundação do fornecedor: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFundacao = LocalDate.parse(entrada.nextLine(), formatter);
        fornecedor.getPessoaJuridica().setDataFundacao(dataFundacao);
        
        System.out.println("Informe o Endereço do fornecedor: ");
        fornecedor.getPessoaJuridica().setEndereco(entrada.nextLine());
        
        System.out.println("Informe o E-mail do fornecedor: ");
        fornecedor.getPessoaJuridica().setEmail(entrada.nextLine());
        
        System.out.println("Informe o estado de Atividade do fornecedor (Ativo/Inativo): ");
        Boolean bAtividade = entrada.nextLine().equals("Ativo") ? true : false;
        fornecedor.setAtivo(bAtividade);
        
        return fornecedor;
    }
}
