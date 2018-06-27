package heranca;
import java.util.ArrayList;
/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg
 * Usado como prova de conceito, podendo ser melhorado.
 * Assuntos: Polimorfismo com heran�a.
 * 20/06/2018
 * @author L�via
 *
 */

public class EstoquePratos {
	
	private ArrayList<PratoPersonalizado> estoqueDePratos;
	
	public EstoquePratos() {
		
		estoqueDePratos = new ArrayList<PratoPersonalizado>();
		
	}
	
	public PratoPersonalizado criaPratoTriangular(double precoBase, Personalizacao personalizacao, double base, double altura) {
		PratoTriangular prato = new PratoTriangular(precoBase, personalizacao, base, altura);
		return prato;
	}
	
	public PratoPersonalizado criaPratoRetangular(double precoBase, Personalizacao personalizacao, double base, double altura) {
		PratoRetangular prato = new PratoRetangular(precoBase, personalizacao, base, altura);
		return prato;
	}
	
	public PratoPersonalizado criaPratoCircular(double precoBase, Personalizacao personalizacao, double raio) {
		PratoCircular prato = new PratoCircular(precoBase, personalizacao, raio);
		return prato;
	}
	
	public PratoPersonalizado temPratoComPersonalizacao(Personalizacao personalizacao) {
		for (int i = 0; i < estoqueDePratos.size(); i ++) {
			if (estoqueDePratos.get(i).getPersonalizacao() == personalizacao){//chamada polim�rfica
				return estoqueDePratos.get(i);
			}
		}
		return null;
	}
	
	public boolean pegaPratoComPersonalizacao(Personalizacao personalizacao) {
		for (int i = 0; i < estoqueDePratos.size(); i ++) {
			if (estoqueDePratos.get(i).getPersonalizacao() == personalizacao){
				return true;
			}
		}
		return false;
	}

	public boolean adicionaPrato(PratoPersonalizado prato) {
		return estoqueDePratos.add(prato);
	}
	
	public boolean removePrato(PratoPersonalizado prato) {
		return estoqueDePratos.remove(prato);
	}
	
	public double calculaLucroTotal() {
		double lucro = 0;
		for (int i = 0; i < estoqueDePratos.size(); i++) {
			lucro += estoqueDePratos.get(i).calculaPrecoFinal(); //chamada polim�rfica
		}
		return lucro;
	}
	
	public int getQtdPratos() {
		return estoqueDePratos.size();
	}
	
	public String listar(){
		String resultado = "";
		for(PratoPersonalizado p: estoqueDePratos){
			resultado += p.toString() + "\n";
		}
		return resultado;
	}
	
	

}
