package excecoes;

import classes.Assento;

/* 
 * Introduzindo exceções
 * 
 * Por: Lívia Sampaio Campos
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
public class BicicletaComExcecao{
	protected double velocidadeAtual;
	private double velocidadeMaxima;
	private String modelo;
	private Assento assento;

	//marcar que o metodo lanca excecao, nesse caso, eh opcional
	public BicicletaComExcecao(double velocidadeMaxima, String modelo, Assento assento) throws RuntimeException{
		if(modelo == null){
			throw new NullPointerException("Valor nulo invalido!");
		}
		if(modelo.equals("")){
			throw new IllegalArgumentException("String vazia invalida!");
		}
		this.velocidadeMaxima = velocidadeMaxima;
		this.modelo = modelo;
		this.assento = assento;
	}
	
	public BicicletaComExcecao(double velocidadeMaxima, String modelo) throws RuntimeException{
		this(velocidadeMaxima, modelo, null);
	}
	
	public String getAssento(){
		return assento.toString();
	}

	public double getVelocidadeMaxima(){
		return velocidadeMaxima;
	}

	public double getVelocidadeAtual(){
		return velocidadeAtual;
	}

	public String getModelo() {
		return modelo;
	}

	public void setAssento(Assento novo){
		assento = novo;

	}

	public void acelera() {
		velocidadeAtual = (velocidadeAtual + 2 > getVelocidadeMaxima()) ? getVelocidadeMaxima() : velocidadeAtual + 2;
	}
	public void desacelera() {
		velocidadeAtual = (velocidadeAtual - 2 < 0) ? 0 : velocidadeAtual - 2;
	}

	public void para(){
		velocidadeAtual = 0;
	}
	
	@Override
	public String toString() {
		return "Super bike " + getModelo();
	}
	
	@Override
	public boolean equals(Object b2){
		if(!(b2 instanceof BicicletaComExcecao)){
			return false;
		}
		BicicletaComExcecao b3 = (BicicletaComExcecao) b2;
		return this.getModelo().equals(b3.getModelo()) &&
				this.getAssento().equals(b3.getAssento());
	}
	public static void main(String[] args) {
		try{
		
			BicicletaComExcecao b = new BicicletaComExcecao(200, "xx");
		}catch(RuntimeException e){
			System.out.println(e.getMessage());
		}
	}

}
