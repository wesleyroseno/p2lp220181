package heranca;
/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: Polimorfismo com herança.
 * 20/06/2018
 * @author Lívia
 *
 */
public class PratoCircular extends PratoPersonalizado{
	private double raio;
	
	public PratoCircular(double precoBase, Personalizacao personalizacao, double raio){
		super(precoBase, personalizacao);
		this.raio = raio;
	}
	
	@Override
	public double areaTotal() {
		return Math.PI * Math.pow(2, raio);
	}

}
