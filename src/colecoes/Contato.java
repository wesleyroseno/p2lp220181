package colecoes;

public class Contato{
	private String nome, telefone;
	private int codigo;
	
	public Contato(String nome, String telefone, int codigo){
		this.nome = nome;
		this.telefone = telefone;
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}
	
	public int getCodigo(){
		return codigo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Contato))
			return false;
		Contato outro = (Contato) obj;
		return getCodigo() == outro.getCodigo();
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " fone: " + getTelefone() + " codigo: " + getCodigo();
	}
	
}
