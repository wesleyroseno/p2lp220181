package interfaceoo;

import java.util.Comparator;

import heranca.PratoPersonalizado;

public class ComparaNomeArtista implements Comparator<PratoPersonalizado>{

	@Override
	public int compare(PratoPersonalizado arg0, PratoPersonalizado arg1) {
		return arg0.getArtista().compareTo(arg1.getArtista());
	}

}
