package heranca;
/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: Polimorfismo com herança.
 * 20/06/2018
 * @author Lívia
 *
 */
public class PratoTriangular extends PratoPersonalizado{
	private double base, altura;
	
	public PratoTriangular(double precoBase, Personalizacao personalizacao, double base, double altura){
		super(precoBase, personalizacao);
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double areaTotal() {
		return (base * altura)/2.0;
	}

}
