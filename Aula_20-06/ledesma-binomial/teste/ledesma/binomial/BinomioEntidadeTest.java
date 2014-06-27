package Silveira.binomial;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinomioEntidadeTest {

	
	public void testar(int n, int k, int c){
		IBinomioEntidade e = new BinomioEntidadeFake(n,k,c);
		e.setN(n);
		e.setK(k);
		int actual = e.getCoeficiente();
		int expected = c;
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
