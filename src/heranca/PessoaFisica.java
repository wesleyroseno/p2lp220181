package heranca;

/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: Reuso de software com heranca.
 * 13/06/2018
 * @author Lívia
 *
 */
public class PessoaFisica extends Pessoa{
	private String cpf;
	
	public PessoaFisica(String nome, String cpf){
		super(nome);
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " " + getCpf();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof PessoaFisica)){
			return false;
		}
		PessoaFisica pf = (PessoaFisica) obj;
		return getCpf().equals(pf.getCpf());
	}

}
