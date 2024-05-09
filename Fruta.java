package main;

public class Fruta {
	private String nome;
	private int id;
	private double preco;
	
	
	public Fruta(String nome, int id, double preco) {
		this.id    = id;
		this.nome  = nome;
		this.preco = preco;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}


	public String insert() {
		return String.format("insert into Frutas values (%d, '%s', %f);", this.id, this.nome, this.preco);
	}	
}
