package interfaceoo;

import java.util.List;

public class AvaliacaoUltimo implements Avaliacao{

	@Override
	public double notaLegal(List<Opiniao> opinioes) {
		return opinioes.get(opinioes.size()-1).getNota();
	}

}
