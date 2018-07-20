package recursividade;

/* Recursividade OO com listas encadeadas
 * 
 * Por: Lívia Sampaio Campos
 * Iniciado: 20/07/2018
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
public class Dancarino {
	private String nome;
	private Dancarino proximo;
	
	public Dancarino(String nome){
		this.nome = nome;
		proximo = null;
	}
	
	public void adiciona(Dancarino novo){
		if(this.proximo == null){
			proximo = novo;
			return;
		}
		this.getProximo().adiciona(novo);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Dancarino getProximo() {
		return proximo;
	}
	
	public void setProximo(Dancarino proximo) {
		this.proximo = proximo;
	}
	
	public int contar(){
		if(getProximo() == null){
			return 1;
		}
		return 1 + getProximo().contar();
	}
	
	@Override
	public String toString() {
		if(getProximo() == null){
			return this.getNome();
		}
		return this.getNome() + " " + getProximo().toString();
	}
}
