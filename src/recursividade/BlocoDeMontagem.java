package recursividade;

public class BlocoDeMontagem {
	private Cor cor;
	private BlocoDeMontagem proxima;

	public BlocoDeMontagem getProxima(){
		return proxima;
	}
	
	public Cor getCor(){
		return cor;
	}
	
	public void empilha2(BlocoDeMontagem blocoDeMontagem) {
		if (this.getProxima() == null) {
      		this.proxima = blocoDeMontagem;
		} else {
      		this.getProxima().empilha2(blocoDeMontagem);
		}
	}
	
	public void empilha(BlocoDeMontagem blocoDeMontagem) {
		
		if (this.getProxima() == null) {
			if(cor == Cor.BRANCO) {
				blocoDeMontagem.setCor(Cor.CINZA);
			}else {
				blocoDeMontagem.setCor(Cor.BRANCO);
			}
      		this.proxima = blocoDeMontagem;
      		return;
		}
		this.getProxima().empilha(blocoDeMontagem);
		
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	public String toString() {
		if(getProxima() == null)
			return getCor().toString();
		return this.getProxima().toString() + " " + getCor();
	}
	public static void main(String[] args) {
		BlocoDeMontagem base = new BlocoDeMontagem();
		base.setCor(Cor.BRANCO);
		base.empilha(new BlocoDeMontagem());
		base.empilha(new BlocoDeMontagem());
		base.empilha(new BlocoDeMontagem());
		base.empilha(new BlocoDeMontagem());
		
		System.out.println(base.toString());
	}
}

