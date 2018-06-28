package heranca;

/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: Polimorfismo com heranca.
 * 20/06/2018
 * @author Lívia
 *
 */
public abstract class PratoPersonalizado implements Comparable<PratoPersonalizado>{
	
	private double precoBase;
	private Personalizacao personalizacao;
	
	public PratoPersonalizado(double precoBase, Personalizacao personalizacao) {
		mudaPrecoBase(precoBase);
		this.personalizacao = personalizacao;
	}
	
	/*//no controller deveria ter um metodo desse tipo para fazer a conversao do string que vem da interface com o usuario para o enum
	public Personalizacao criaPersonalizacao(String personalizacao) {
		
		switch(personalizacao.toLowerCase()){
		case "estampa":
			return Personalizacao.ESTAMPA;
		case "foto":
			return Personalizacao.FOTO;
		case "pintura":
			return Personalizacao.PINTURA;
		default:
			throw new IllegalArgumentException("Nao criamos pratos com " + personalizacao);
		} 
		
	}*/
	
	public double getPrecoBase() {
		return this.precoBase;
	}
	
	public void setPrecoBase(double preco) throws RuntimeException{
		mudaPrecoBase(preco);
	}
	
	private void mudaPrecoBase(double preco) throws RuntimeException {
		if (preco < 0) {
			throw new IllegalArgumentException ("Preco base nao pode ser negativo.");
		}
		this.precoBase =  preco;
	}
	
	public Personalizacao getPersonalizacao() {
		return this.personalizacao;
	}
	
	public void setPersonalizacao(Personalizacao personalizacao) {
		this.personalizacao = personalizacao;
	}
	
	//public abstract double calculaPrecoFinal();
	
	public double calculaPrecoFinal(){
		return precoBase + (0.01 * areaTotal()); //chamada polimorfica
	}
	
	public abstract double areaTotal();
	
	@Override
	public int compareTo(PratoPersonalizado p){
		
		return getPersonalizacao().compareTo(p.getPersonalizacao());
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((personalizacao == null) ? 0 : personalizacao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PratoPersonalizado other = (PratoPersonalizado) obj;
		if (personalizacao != other.personalizacao)
			return false;
		return true;
	}	
	
	@Override
	public String toString() {
		return "Personalizacao: " + getPersonalizacao() + " preco: " + getPrecoBase();
	}

	
	
}
