package interfaceoo;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	
	private final String VAZIO = "";
	private String nome;
	private double valor;
	private List<Opiniao> opinioes;
	
	public Produto(String nome, double valor) {
		checaNome(nome);
		checaValor(valor);
		this.nome = nome;
		this.valor = valor;		
		opinioes = new ArrayList<Opiniao>();
	}
	
	private void checaNome(String nome){
		if(nome.equals(VAZIO)){
			throw new IllegalArgumentException("nome vazio invalido!");
		}
	}
	
	private void checaValor(double valor){
		if(valor <= 0){
			throw new IllegalArgumentException("valor negativo invalido!");
		}
	}
	
	public void adicionaOpiniao(double nota, String comentario){
		opinioes.add(new Opiniao(nota, comentario));
	}
	
	public String listaOpinioes(){
		String saida = "";
		for(Opiniao o: opinioes){
			saida += o.toString() + "\n";
		}
		return saida;
	}
	
	public String getNome() { 	return nome; 	}
	public void setNome(String nome) { 	checaNome(nome); this.nome = nome; }
	
	public double getValor() { return valor; }
	public void setValor(double valor) { checaValor(valor); this.valor = valor; }
	
	@Override
	public String toString() { return "Nome: " + nome + "| Valor: " + valor; }
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Produto))
			return false;
		Produto outro = (Produto) obj;
		return getNome().equals(outro.getNome()) && getValor() == outro.getValor();
	}
	
	public static void main(String[] args) {
		Produto p = new Produto("Arroz Santa Ajuda", 3);
		p.adicionaOpiniao(5, "Muito mole");
		p.adicionaOpiniao(10, "Delicioso");
		p.adicionaOpiniao(8, "grao quebradico");
		System.out.println(p);
		System.out.println(p.listaOpinioes());
	}

}
