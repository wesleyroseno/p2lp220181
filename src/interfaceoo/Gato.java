package interfaceoo;

public class Gato implements AnimalEstimacao{
	private String nome;
	
	public Gato(String nome) {
		this.nome = nome;
	}

	@Override
	public String serAmigavel() {
		return "gato sendo amigavel";
		
	}

	@Override
	public String brincar() {
		return "gato brincando...";
		
	}
}
