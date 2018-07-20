package recursividade;

/* Recursividade OO com listas encadeadas
 * 
 * Por: Lívia Sampaio Campos
 * Iniciado: 20/07/2018
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
public class CongaLine {
	Dancarino primeiroDancarino;
	
	public void adicionaDancarino(String nome){
		if(primeiroDancarino == null){
			primeiroDancarino = new Dancarino(nome);
		}else{
			Dancarino novo = new Dancarino(nome);
			primeiroDancarino.adiciona(novo);
		}
	}
	
	public int contar(){
		if(primeiroDancarino == null){
			return 0;
		}
		return primeiroDancarino.contar();
	}
	
	@Override
	public String toString() {
		return primeiroDancarino.toString();
	}
	
	public static void main(String[] args) {
		CongaLine danca = new CongaLine();
		danca.adicionaDancarino("Huguinho");
		danca.adicionaDancarino("Zezinho");
		danca.adicionaDancarino("Luizinho");
		danca.adicionaDancarino("Margarida");
		danca.adicionaDancarino("Minnie");
		System.out.println(danca);
		System.out.println(danca.contar());
	}

}
