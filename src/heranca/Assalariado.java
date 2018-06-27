package heranca;
/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: Reuso de software com heranca/classes abstratas.
 * 15/06/2018
 * @author L�via
 *
 */
public class Assalariado extends Funcionario{
	private int qtdDependentes;
	private double salarioBase;
	public static final double ADICIONAL_POR_DEPENDENTE = 15.0;
	
	public Assalariado(String nome, String cpf, int matricula, double salarioBase){
		super(nome, cpf, matricula);
		this.salarioBase = salarioBase;
		this.qtdDependentes = 0;
	}
	
	public static String lema(){//para exemplificar que nao existe polimorfismo com metodos est�ticos
		return "Trabalho em equipe!";
	}
	
	public int getQtdDependentes() {
		return qtdDependentes;
	}

	public void setQtdDependentes(int qtdDependentes) {
		this.qtdDependentes = qtdDependentes;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public void setNome(String nome) {
		System.out.println("Assalariado.setNome()");//para exemplificar chamada de metodo polimorfico no construtor
		this.nome = nome;
	}
	@Override
	public double calculaPagamento() {
		return salarioBase + (qtdDependentes*ADICIONAL_POR_DEPENDENTE);
	}
	
	@Override
	public String toString() {
		return "ASSALARIADO" + super.toString();
	}
}
