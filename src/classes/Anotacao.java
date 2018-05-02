package classes;

/* Comecando com objetos: nossa primeira classe. Esta sendo usada
 * em DiarioDeBordoOO.java
 * 
 * Por: Lívia Sampaio Campos
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
public class Anotacao {
//atributos
	private String data;
	private String texto;
	private double desempenho;
	
//construtor
	public Anotacao(String texto, String data){
		this.data = data; //atencao para a referencia this
		this.texto = texto;
	}
	
//acoes
	public String getData(){
		return data;
	}

	public String getTexto(){
		return texto;
	}
	
	public double getDesempenho(){
		return desempenho;
	}
	
	public void setTexto(String novo){
		texto = novo;
	}
	
	public void setDesempenho(double novo){//valor de 0 a 10
		desempenho = novo;
	}
/* note que aqui ja é uma ação mais relacionada com o 
dominio de problema */	
	public String situacaoDesempenho(){
		if(desempenho > 0 && desempenho <= 5){
			return "REGULAR";
		}else if(desempenho > 5 && desempenho <= 7){
			return "BOM";
		}else if(desempenho > 7 && desempenho < 9){
			return "MUITO BOM";
		}else if(desempenho >= 9 && desempenho <= 10){
			return "EXCELENTE";
		}else{
			return "ATENCAO!";
		}
	}
	
// vamos ver uma outra forma de representar essa acao em java
	@Override
	public String toString(){
		return this.getData() + "- " + this.getTexto();
	}
}
