package classes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import classes.Bicicleta.Assento;
import classes.Bicicleta.Bicicleta;
/* 
 * Come�ando com Testes de Unidade usando JUnit.
 * Observe que o estilo pode melhorar. Ter modulariza��o dos 
 * testes.
 * 
 * Por: L�via Sampaio Campos
 * Observacao: Esse codigo � uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplifica��es.
 */
public class TestBicicleta {

	/*
	 * criar uma bicicleta1 com velocidadeM�xima de 10 e modelo caloi
	 * testar se a velocidadeM�xima da bicicleta1 � 10
	 * testar se o modelo da bicicleta1 � caloi
	 * testar se o assento da bicicleta1 � null ou vazio
	 * testar se a velocidade atual da bicicleta1 � 0
	 * criar uma bicicleta2 com velocidadeM�xima de 10 e modelo caloi e assento gel 2
	 * testar se o assento da bicicleta2 � gel 2
	 * acelerar bicicleta1 
	 * testar se a velocidade atual da bicicleta1 � 2
	 * acelerar bicicleta1
	 * testar se a velocidade atual da bicicleta1 � 4
	 * desacelerar bicicleta1 
	 * testar se a velocidade atual da bicicleta1 � 2
	 * acelerar bicicleta1 4 vezes
	 * testar se a velocidade atual da bicicleta1 � 10
	 * acelerar bicicleta1
	 * testar se a velocidade atual da bicicleta1 � 10
	 * desacelerar a bicicleta1 5 vezes 
	 * testar se a velocidade atual da bicicleta1 � 0
	 * desacelerar bicicleta1
	 * testar se a velocidade atual da bicicleta1 � 0
	 * acelerar bicicleta1 4 vezes
	 * testar se a velocidade atual da bicicleta1 � 8
	 * parar bibicleta1
	 * testar se a velocidade atual da bicicleta1 � 0
	 * testar se a representa��o textual da bicicleta1 � Super bike caloi
	 */


	@Test
	public void testGeral(){
		//bicicleta1
		Bicicleta bicicleta1 = new Bicicleta(10, "caloi");
		assertEquals(10, bicicleta1.getVelocidadeMaxima(), 0.000001);
		assertEquals("caloi", bicicleta1.getModelo());
		assertEquals("", bicicleta1.getAssento());
		assertEquals(0, bicicleta1.getVelocidadeAtual(), 0.000001);
		
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
		
		//desacelera
		for (int i = 0; i < 5; i++) {
			bicicleta1.desacelera();
		}
		assertEquals(0, bicicleta1.getVelocidadeAtual(), 0.000001);
		bicicleta1.desacelera();
		assertEquals(0, bicicleta1.getVelocidadeAtual(), 0.000001);
		
		//para
		for (int i = 0; i < 4; i++) {
			bicicleta1.acelera();
		}
		assertEquals(8, bicicleta1.getVelocidadeAtual(), 0.000001);
		bicicleta1.para();
		assertEquals(0, bicicleta1.getVelocidadeAtual(), 0.000001);
		
		//toString
		assertEquals("Super bike caloi", bicicleta1.toString());
		
		//bicicleta2
		Assento a = new Assento(2, "gel"); 
		Bicicleta bicicleta2 = new Bicicleta(10, "caloi", a);
		String s = "Descricao: gel Tamanho: 2";
		assertEquals(s, bicicleta2.getAssento());
		
	}

}
