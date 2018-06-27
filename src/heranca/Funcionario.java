package heranca;
/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: Reuso de software com heranca/classes abstratas.
 * 15/06/2018
 * @author Lívia
 *
 */
public abstract class Funcionario {
	private String cpf;
	private int matricula;
	protected String nome;
	
	public Funcionario(String nome, String cpf, int matricula){
		mudaNome(nome);
		this.cpf = cpf;
		this.matricula = matricula;
	}
	
	private void mudaNome(String novoNome){
		this.nome = novoNome;//fazer tratamento de erros com exceções, por exemplo
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		System.out.println("Funcionario.setNome()");
		mudaNome(nome);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getMatricula() {
		return matricula;
	}
	
	public abstract double calculaPagamento();
	
	@Override
	public String toString() {
		return getNome() + " " + getCpf();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}
	
	/*@Override
	public boolean equals(Object arg0) {
		if(!(arg0 instanceof Funcionario)){
			return false;
		}
		Funcionario f = (Funcionario) arg0;
		return getCpf().equals(f.getCpf());
	}*/
	
	
}
