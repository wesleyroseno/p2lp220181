package recursividade;

public class DancarinoSemRecursao {
	private String nome;
	private DancarinoSemRecursao proximo;
	
	public DancarinoSemRecursao(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public DancarinoSemRecursao getProximo() {
		return proximo;
	}
	
	public void setProximo(DancarinoSemRecursao novo) {
		proximo = novo;
	}
	
	@Override
	public String toString() {
		return "Nome dancarino: " + getNome();
	}
	
	

}
