package exemplo_colections;

public class Minerio implements Comparable<Minerio>{

	private String nome;
	private double preco;
	private String unidade;
	
	public Minerio(String nome, double preco, String unidade) {
		this.nome = nome;
		this.preco = preco;
		this.unidade = unidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	@Override
	public int compareTo(Minerio o) {
		if (this.preco < o.preco){
			return -1;
		}
		else {
			return +1;
		}
	}
	
}
