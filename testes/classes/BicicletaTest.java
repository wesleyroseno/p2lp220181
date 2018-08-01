
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
		Assento a = new Assento(2, "gel"); 
		Bicicleta bicicleta2 = new Bicicleta(10, "caloi", a);
		String s = "Descricao: gel Tamanho: 2";
		assertEquals(s, bicicleta2.getAssento());
	}

	@Test
	public void testBicicletaDoubleStringAssentoException(){
		Assento a = new Assento(2, "gel"); 
		
		try{
			Bicicleta bicicleta2 = new Bicicleta(10, "", a);
			fail("Deveria lancar excecao!");
		}catch(IllegalArgumentException e){
			assertEquals("String vazia invalida!", e.getMessage());
		}
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testBicicletaDoubleStringAssentoException2(){
		Assento a = new Assento(2, "gel");
		Bicicleta bicicleta2 = new Bicicleta(10, "", a);
	}
	
	@Test
	public void testBicicletaDoubleString() {
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
		for (int i = 0; i < 5; i++) {
			bicicleta1.desacelera();
		}
		assertEquals(0, bicicleta1.getVelocidadeAtual(), 0.000001);
		bicicleta1.desacelera();
		assertEquals(0, bicicleta1.getVelocidadeAtual(), 0.000001);
		
	}

	@Test
	public void testPara() {
		for (int i = 0; i < 4; i++) {
			bicicleta1.acelera();
		}
		assertEquals(8, bicicleta1.getVelocidadeAtual(), 0.000001);
		bicicleta1.para();
		assertEquals(0, bicicleta1.getVelocidadeAtual(), 0.000001);
		
	}

	@Test
	public void testToString() {
		assertEquals("Super bike caloi", bicicleta1.toString());
	}

	@Test
	public void testSetAssento() {
		Assento novo = new Assento(22, "espuma");
		assertEquals("", bicicleta1.getAssento());
		bicicleta1.setAssento(novo);
		String saida = "Descricao: espuma Tamanho: 22";
		assertEquals(saida, bicicleta1.getAssento());
	}

	@Test
	public void testTemConforto() {
		//esse teste nao seria necessario aqui em bicicleta, mas somente em Assento
		}
	
	@Test
	public void testIgualdade(){//este seria o testEquals
		Bicicleta bicicleta1 = new Bicicleta(11, "caloi");
		Bicicleta bicicleta2 = new Bicicleta(11, "caloi");
		assertEquals(bicicleta1, bicicleta2);
		assertTrue(bicicleta1.equals(bicicleta1));
		assertTrue(bicicleta1.equals(bicicleta2));
		assertTrue(bicicleta1.igualdade(bicicleta2));
	}

}
