package Silveira.binomial;



public class BinomioEntidadeFake implements IBinomioEntidade{

	private int n;
	private int k;
	private int coeficiente;
	
	public BinomioEntidadeFake(int n, int k, int c){
		this.coeficiente = c;
		this.k = k;
		this.n = n;
	}
	
	public int calcular(int i, int j) {
		
		return 0;
	}

	public void setN(int n) {
		if(this.n != n)
			throw new IllegalArgumentException();
	}

	public void setK(int k) {
		if(this.k != k)
			throw new IllegalArgumentException();
	}

	public int getCoeficiente() {
		return coeficiente;
	}

	
}
