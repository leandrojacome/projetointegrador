package form;

import dominio.Instituicao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InstituicaoForm {
    public static Instituicao incluir() {
        Scanner entrada = new Scanner(System.in);
        Instituicao instituicao = new Instituicao();
        
        System.out.println("Informe os dados da Instituição: \n\n");
        
        System.out.println("Informe o id da Instituição: ");
        Integer id = Integer.parseInt(entrada.nextLine());
        instituicao.getPessoaJuridica().setId(id);
        instituicao.setId(id);
        
        System.out.println("Informe a razão social da Instituição: ");
        instituicao.getPessoaJuridica().setRazaoSocial(entrada.nextLine());
        
        System.out.println("Informe o nome fantasia da Instituição: ");
        instituicao.getPessoaJuridica().setNomeFantasia(entrada.nextLine());
        
        System.out.println("Informe o CNPJ da Instituição: ");
        instituicao.getPessoaJuridica().setCnpj(entrada.nextLine());
        
        System.out.println("Informe a incrição estadual da Instituição: ");
        instituicao.getPessoaJuridica().setInscricaoEstadual(entrada.nextLine());
        
        System.out.println("Informe a incrição estadual da Instituição: ");
        instituicao.getPessoaJuridica().setInscricaoMunicipal(entrada.nextLine());
        
        System.out.println("Informe o Data de Fundação do Instituto: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFundacao = LocalDate.parse(entrada.nextLine(), formatter);
        instituicao.getPessoaJuridica().setDataFundacao(dataFundacao);
        
        System.out.println("Informe o Endereço da Instituição: ");
        instituicao.getPessoaJuridica().setEndereco(entrada.nextLine());
        
        System.out.println("Informe o código do MEC da Instituição: ");
        instituicao.setCodigoMec(entrada.nextLine());
        
        System.out.println("Informe o E-mail da Instituição: ");
        instituicao.getPessoaJuridica().setEmail(entrada.nextLine());
        
        System.out.println("Informe a sigla da Instituição: ");
        instituicao.setSigla(entrada.nextLine());

        System.out.println("Informe o código MEC da Instituição: ");
        instituicao.setCodigoMec(entrada.nextLine());
        
        return instituicao;
    }
}
