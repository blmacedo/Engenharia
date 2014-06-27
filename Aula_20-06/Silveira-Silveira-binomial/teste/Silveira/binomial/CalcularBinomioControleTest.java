package Silveira.binomial;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcularBinomioControleTest {

	
	public void testar(int n, int k, int coef){
		IBinomioEntidade e = new BinomioEntidadeFake(n,k,coef);
		CalcularBinomioControle c;
		c = new CalcularBinomioControle(e);
		int actual = c.calcular(n,k);
		int expected = coef;
		assertEquals(expected , actual);
	}
	
	@Test
	public void testSeisDois() {
		testar(6, 2, 15);
	}
	@Test
	public void testDoisUm() {
		testar(1, 1, 1);
	}
	@Test
	public void testDoisDois() {
		testar(2, 1, 2);
	}
	@Test
	public void testUmUm() {
		testar(2, 2, 1);
	}
	
	
	
	
	

}
