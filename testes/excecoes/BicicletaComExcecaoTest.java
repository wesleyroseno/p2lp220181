package excecoes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class BicicletaComExcecaoTest {

	@Test
	public void testBicicletaComExcecao(){
		
		try{
			new BicicletaComExcecao(10, null);
			fail("Deveria ter ocorrido NullPointerException");
		}catch(NullPointerException e){
			assertEquals("Valor nulo invalido!", e.getMessage());
		}
	}

	
	@Test (expected = NullPointerException.class)
	public void testBicicletaComExcecao2(){		
			new BicicletaComExcecao(10, null);
	}
	
	@Test (expected = NullPointerException.class)
	public void testBicicletaComExcecao3(){		
		new BicicletaComExcecao(10, "");
	}

}
