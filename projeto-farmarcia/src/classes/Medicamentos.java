package classes;

import java.util.Objects;

public class Medicamentos {

	String nome;
	String tipo;
	String data_validade;
	String data_fabricacao;
	String lote;
	int quantidade;
	double preco;
	double conteudo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getData_validade() {
		return data_validade;
	}
	public void setData_validade(String data_validade) {
		this.data_validade = data_validade;
	}
	public String getData_fabricacao() {
		return data_fabricacao;
	}
	public void setData_fabricacao(String data_fabricacao) {
		this.data_fabricacao = data_fabricacao;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getConteudo() {
		return conteudo;
	}
	public void setConteudo(double conteudo) {
		this.conteudo = conteudo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(conteudo, data_fabricacao, data_validade, lote, nome, preco, quantidade, tipo);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medicamentos other = (Medicamentos) obj;
		return Double.doubleToLongBits(conteudo) == Double.doubleToLongBits(other.conteudo)
				&& Objects.equals(data_fabricacao, other.data_fabricacao)
				&& Objects.equals(data_validade, other.data_validade) && Objects.equals(lote, other.lote)
				&& Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco)
				&& quantidade == other.quantidade && Objects.equals(tipo, other.tipo);
	}
	
	
}
