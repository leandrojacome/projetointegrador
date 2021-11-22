package form;

import dominio.Aluno;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AlunoForm {
    public static Aluno incluir() {
        Scanner entrada = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Informe os dados do aluno: \n\n");
        System.out.println("Informe o id do aluno: ");
        Integer id = Integer.parseInt(entrada.nextLine());
        aluno.getPessoaFisica().setId(id);
        aluno.setId(id);
        System.out.println("Informe o nome do aluno: ");
        aluno.getPessoaFisica().setNome(entrada.nextLine());
        System.out.println("Informe o CPF do aluno: ");
        aluno.getPessoaFisica().setCpf(entrada.nextLine());
        System.out.println("Informe o Data de Nascimento do aluno: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNacimento = LocalDate.parse(entrada.nextLine(), formatter);
        aluno.getPessoaFisica().setDataNascimento(dataNacimento);
        System.out.println("Informe o Matricula do aluno: ");
        aluno.setMatricula(entrada.nextLine());
        System.out.println("Informe o Telefone do aluno: ");
        aluno.getPessoaFisica().setTelefone(entrada.nextLine());
        System.out.println("Informe o Celular do aluno: ");
        aluno.getPessoaFisica().setCelular(entrada.nextLine());
        System.out.println("Informe o E-mail do aluno: ");
        aluno.getPessoaFisica().setEmail(entrada.nextLine());
        System.out.println("Informe o Endereço do aluno: ");
        aluno.getPessoaFisica().setEndereco(entrada.nextLine());
        System.out.println("Informe o Endereço do aluno: ");
        return aluno;
    }
}
