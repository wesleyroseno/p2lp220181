package interfaceoo;

import java.util.List;

public class AvaliacaoPorMedia implements Avaliacao{

	@Override
	public double notaLegal(List<Opiniao> opinioes) {
		double soma=0;
		for(Opiniao o: opinioes) {
			soma+=o.getNota();
		}
		return soma/opinioes.size();
	}
	

}
