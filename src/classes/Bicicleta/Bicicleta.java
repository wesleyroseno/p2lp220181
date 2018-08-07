package classes.Bicicleta;

/* 
 * Mais objetos
 * 
 * Por: Lívia Sampaio Campos
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
public class Bicicleta{
	private double velocidadeAtual;
	private double velocidadeMaxima;
	private String modelo;
	private Assento meuAssento;
	
	public Bicicleta(double velocidadeMaxima, String modelo, Assento assento){
		if(modelo == null){
			throw new NullPointerException("Valor nulo invalido!");
		}
		if(modelo.equals("")){
			throw new IllegalArgumentException("String vazia invalida!");
		}
		this.velocidadeMaxima = velocidadeMaxima;
		this.modelo = modelo;
		meuAssento = assento;
	}
	public Bicicleta(double velocidadeMaxima, String modelo) {
		this(velocidadeMaxima, modelo, null);
	}
	
	public String getAssento(){
		if(meuAssento != null){
			return meuAssento.toString();
		}else{
			return "";
		}
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

	public void setAssento(Assento novoAssento) {
		meuAssento = novoAssento;
	}
	
	public boolean temConforto(double larguraQuadril){
		return meuAssento.temConforto(larguraQuadril);
	}
	
	@Override
	public boolean equals(Object outra) {
		if(outra instanceof Bicicleta){
			Bicicleta b2 = (Bicicleta)outra;
			System.out.println("equals de bicicleta");
			return getVelocidadeMaxima() == b2.getVelocidadeMaxima();
		}
		return false;
		
	}
	//queremos usar o método de igualdade padrão de java = equals!
	public boolean igualdade(Bicicleta outra){
		return getVelocidadeMaxima() == outra.getVelocidadeMaxima();
	}

}
