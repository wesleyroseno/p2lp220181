
package interfaceoo;

import java.io.Serializable;
import java.util.Comparator;

import heranca.PratoPersonalizado;

public class ComparaPrecoBase implements Comparator<PratoPersonalizado>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int compare(PratoPersonalizado arg0, PratoPersonalizado arg1) {
		if(arg0.getPrecoBase() > arg1.getPrecoBase()){
		return 1;
	}else if(arg0.getPrecoBase() < arg1.getPrecoBase()){
		return -1;
	}else{
		return 0;
	}
	}

}
