
package classes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BicicletaTest {

	private Bicicleta bicicleta1;
	
	@Before
	public void setUp() {
		bicicleta1 = new Bicicleta(10, "caloi");
	}

	@Test
	public void testBicicletaDoubleStringAssento() {
		//bicicleta2
				Assento a = new Assento(2, "gel"); 
				Bicicleta bicicleta2 = new Bicicleta(10, "caloi", a);
				String s = "Descricao: gel Tamanho: 2";
				assertEquals(s, bicicleta2.getAssento());
	}

	@Test
	public void testBicicletaDoubleString() {
		//bicicleta1
				Bicicleta bicicleta1 = new Bicicleta(11, "caloi");
				assertEquals(11, bicicleta1.getVelocidadeMaxima(), 0.000001);
				assertEquals("caloi", bicicleta1.getModelo());
				assertEquals("", bicicleta1.getAssento());
				assertEquals(0, bicicleta1.getVelocidadeAtual(), 0.000001);
				assertEquals(10, this.bicicleta1.getVelocidadeMaxima(), 0.000001);
	}

	@Test
	public void testAcelera() {
		//acelera
				//Bicicleta bicicleta1 = new Bicicleta(10, "caloi");
				bicicleta1.acelera();
				assertEquals(2, bicicleta1.getVelocidadeAtual(), 0.000001);
				bicicleta1.acelera();
				assertEquals(4, bicicleta1.getVelocidadeAtual(), 0.000001);
				bicicleta1.desacelera();
				assertEquals(2, bicicleta1.getVelocidadeAtual(), 0.000001);
				for (int i = 0; i < 4; i++) {
					bicicleta1.acelera();
				}
				assertEquals(10, bicicleta1.getVelocidadeAtual(), 0.000001);
				bicicleta1.acelera();
				assertEquals(10, bicicleta1.getVelocidadeAtual(), 0.000001);
	}

	@Test
	public void testDesacelera() {
		fail("Not yet implemented");
	}

	@Test
	public void testPara() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAssento() {
		fail("Not yet implemented");
	}

	@Test
	public void testTemConforto() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testIgualdade(){
		Bicicleta bicicleta1 = new Bicicleta(11, "caloi");
		Bicicleta bicicleta2 = new Bicicleta(11, "caloi");
		assertEquals(bicicleta1, bicicleta2);
		assertTrue(bicicleta1.equals("livia"));
		assertTrue(bicicleta1.equals(bicicleta1));
		assertTrue(bicicleta1.igualdade(bicicleta2));
	}

}
