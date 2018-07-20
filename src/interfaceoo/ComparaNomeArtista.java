package interfaceoo;

import java.io.Serializable;
import java.util.Comparator;

import heranca.PratoPersonalizado;

public class ComparaNomeArtista implements Comparator<PratoPersonalizado>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int compare(PratoPersonalizado arg0, PratoPersonalizado arg1) {
		return arg0.getArtista().compareTo(arg1.getArtista());
	}

}
