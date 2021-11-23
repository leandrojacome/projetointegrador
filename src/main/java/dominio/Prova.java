package dominio;

import java.time.LocalDate;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prova prova = (Prova) o;
        return Objects.equals(id, prova.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(id).append(";");
        sb.append(dataHora).append(";");
        sb.append(disciplina.getId()).append(";");
        sb.append(aluno.getId());
        return sb.toString();
    }
}
