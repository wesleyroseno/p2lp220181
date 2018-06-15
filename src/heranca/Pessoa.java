package heranca;
/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: Reuso de software com heranca.
 * 13/06/2018
 * @author Lívia
 *
 */
public class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return getNome();
	}

}
