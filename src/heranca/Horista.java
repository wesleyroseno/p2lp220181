package heranca;
/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: Reuso de software com heranca/classes abstratas.
 * 15/06/2018
 * @author L�via
 *
 */
public class Horista extends Funcionario{
	private int horasTrabalhadas;
	private double precoPorHora;
	
	public Horista(String nome, String cpf, int matricula){
		super(nome, cpf, matricula);
		horasTrabalhadas = 0;
	}
	
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getPrecoPorHora() {
		return precoPorHora;
	}

	public void setPrecoPorHora(double precoPorHora) {
		this.precoPorHora = precoPorHora;
	}
	
	
	@Override
	public double calculaPagamento() {
		return horasTrabalhadas * precoPorHora;
	}
	
	@Override
	public String toString() {
		return "HORISTA " + super.toString();
	}
}
