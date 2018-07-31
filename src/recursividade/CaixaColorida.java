package recursividade;

public class CaixaColorida {
	private Cor cor;
	private CaixaColorida proxima;
	
	public CaixaColorida(Cor cor) {
		this.cor = cor;
		this.proxima = null;
	}

	public CaixaColorida getProxima(){
		return proxima;
	}
	
	public Cor getCor(){
		return cor;
	}
	
	public void empilha(CaixaColorida outraCaixa){
		this.proxima = outraCaixa;
	}
	//versao verdadeiramente recursiva OO
	public int posicao2(Cor cor){
		
		if(this.getCor() == cor) {
			return 0;
		} 
		if(this.getProxima() != null) {
			int pos = this.getProxima().posicao2(cor);
			return pos == -1? -1: pos + 1;
		} 		
		return -1;
	}
	
	public int posicao(Cor cor) {
		return posicao(cor, 0);
	}
	
	public int posicao(Cor cor, int posicao) {
		int pos = posicao;
		if(this.getCor() == cor) {
			return pos;
		} else {
			if(this.getProxima() != null) {
				return this.getProxima().posicao(cor, pos + 1);
			} else {
				return -1;
			}
		}
	}
	@Override
	public String toString() {
		if(getProxima() == null){
			return this.getCor().toString();
		}
		return getProxima().toString() + " " + getCor();
	}
	
	private enum Cor{
		VERMELHO, PRETO, BRANCO, AZUL, VERDE;
	}
	
}

