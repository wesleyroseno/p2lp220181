package recursividade;

/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg 2018.1
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: recursividade OO com arvores
 * @author Lívia
 *
 */
public class No {
	private int valor;
	private No esquerda;
	private No direita;
	
	public No(int valor){
		this.valor = valor;
		esquerda = direita = null;
	}
	
	public void inserir(int valor){
		if(valor < this.getValor()){
			if(this.getEsquerda() != null){
				this.getEsquerda().inserir(valor);
			}else{
				No novo = new No(valor);
				this.setEsquerda(novo);
			}
		}else{
			if(this.getDireita() != null){
				this.getDireita().inserir(valor);
			}else{
				No novo = new No(valor);
				this.setDireita(novo);
			}
		}
			
	}
	
	public void imprimirEmOrdem(){
		if(this.getEsquerda() != null){
			this.getEsquerda().imprimirEmOrdem();
		}
		System.out.println(this.getValor());
		if(this.getDireita() != null){
			this.getDireita().imprimirEmOrdem();
		}
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public No getEsquerda() {
		return esquerda;
	}
	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}
	public No getDireita() {
		return direita;
	}
	public void setDireita(No direita) {
		this.direita = direita;
	}
	
	public boolean contemNo(int valor){
		boolean achou = false;
		if(this.getValor() == valor){
			achou = true;
		}
		if(!achou && this.getEsquerda() != null){
			achou = this.getEsquerda().contemNo(valor);
		}
		if(!achou && this.getDireita() != null){
			achou = this.getDireita().contemNo(valor);
		}
		return achou;
		
	}
	
	public int contar(){
		int cont = 0;
		if(this.getEsquerda() != null){
			cont += this.getEsquerda().contar();
		}
		cont++;
		if(this.getDireita() != null){
			cont += this.getDireita().contar();
		}
		return cont;
	}
	

}
