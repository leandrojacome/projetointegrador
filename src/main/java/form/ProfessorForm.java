package form;

import dominio.Professor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProfessorForm {
    public static Professor incluir() {
        Scanner entrada = new Scanner(System.in);
        Professor professor = new Professor();
        
        System.out.println("Informe os dados do professor: \n\n");
        System.out.println("Informe o id do professor: ");
        Integer id = Integer.parseInt(entrada.nextLine());
        professor.getPessoaFisica().setId(id);
        professor.setId(id);
        
        System.out.println("Informe o nome do professor: ");
        professor.getPessoaFisica().setNome(entrada.nextLine());
        
        System.out.println("Informe o CPF do professor: ");
        professor.getPessoaFisica().setCpf(entrada.nextLine());
        
        System.out.println("Informe a Data de Nascimento do professor: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNacimento = LocalDate.parse(entrada.nextLine(), formatter);
        professor.getPessoaFisica().setDataNascimento(dataNacimento);
        
        System.out.println("Informe a Matricula do professor: ");
        professor.setMatricula(entrada.nextLine());
        
        System.out.println("Informe o Telefone do professor: ");
        professor.getPessoaFisica().setTelefone(entrada.nextLine());
        
        System.out.println("Informe o Celular do professor: ");
        professor.getPessoaFisica().setCelular(entrada.nextLine());
        
        System.out.println("Informe o E-mail do professor: ");
        professor.getPessoaFisica().setEmail(entrada.nextLine());
        
        System.out.println("Informe o Endereço do professor: ");
        professor.getPessoaFisica().setEndereco(entrada.nextLine());
        
        return professor;
    }
}
