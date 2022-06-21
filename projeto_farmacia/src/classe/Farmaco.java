package classe;

import java.util.Objects;

public class Farmaco {
	
	String nome;
	String data_validade;
	String data_fabricacao;
	String lote;
	String tipo;
	String classe;
	double valor;
	int quantidade;
	double conteudo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getConteudo() {
		return conteudo;
	}
	public void setConteudo(double conteudo) {
		this.conteudo = conteudo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(classe, conteudo, data_fabricacao, data_validade, lote, nome, quantidade, tipo, valor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Farmaco other = (Farmaco) obj;
		return Objects.equals(classe, other.classe)
				&& Double.doubleToLongBits(conteudo) == Double.doubleToLongBits(other.conteudo)
				&& Objects.equals(data_fabricacao, other.data_fabricacao)
				&& Objects.equals(data_validade, other.data_validade) && Objects.equals(lote, other.lote)
				&& Objects.equals(nome, other.nome) && quantidade == other.quantidade
				&& Objects.equals(tipo, other.tipo)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

	
}
