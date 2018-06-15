package heranca;
/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: Reuso de software com heranca.
 * 13/06/2018
 * @author Lívia
 *
 */
public class PessoaJuridica extends Pessoa{
	private String cnpj;
	private String inscricaoEstadual;
	
	public PessoaJuridica(String nome, String cnpj, String inscricaoEstadual){
		super(nome);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	
	public String getCNPJ() {
		return cnpj;
	}

	@Override
	public String toString() {
		return super.toString() + " " + getCNPJ();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof PessoaJuridica)){
			return false;
		}
		PessoaJuridica pf = (PessoaJuridica) obj;
		return getCNPJ().equals(pf.getCNPJ());
	}
}
