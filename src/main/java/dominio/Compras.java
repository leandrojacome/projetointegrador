package dominio;

import java.util.Objects;

public class Compras {

    private Integer id;
    private String nomeProduto;
    private Double valorUnitario;
    private Integer quantidade;
    private Fornecedor fornecedor;
    private Instituicao instituicao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Compras compras = (Compras) o;
        return id.equals(compras.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(id).append(";");
        sb.append(nomeProduto).append(";");
        sb.append(valorUnitario).append(";");
        sb.append(quantidade).append(";");
        sb.append(fornecedor.getId()).append(";");
        sb.append(instituicao.getId());
        return sb.toString();
    }
}
