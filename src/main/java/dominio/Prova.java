package dominio;

import java.time.LocalDate;

public class Prova {

    private Integer id;
    private LocalDate dataHora;
    private Disciplina disciplina;
    private Aluno aluno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDate dataHora) {
        this.dataHora = dataHora;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(id).append(",");
        sb.append(dataHora).append(",");
        sb.append(disciplina.getId()).append(",");
        sb.append(aluno.getId());
        return sb.toString();
    }
}
