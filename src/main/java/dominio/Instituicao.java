package dominio;

import java.util.Objects;

public class Instituicao {

    private Integer id;
    private String sigla;
    private String codigoMec;
    private PessoaJuridica pessoaJuridica;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCodigoMec() {
        return codigoMec;
    }

    public void setCodigoMec(String codigoMec) {
        this.codigoMec = codigoMec;
    }

    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instituicao that = (Instituicao) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(id).append(",");
        sb.append(sigla).append(",");
        sb.append(codigoMec).append(",");
        sb.append(pessoaJuridica.getId());
        return sb.toString();
    }
}
