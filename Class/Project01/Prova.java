//Leonardo Goulart
//UFRN
//Java Programming language


public class Prova {
	private double notaParte1;
	private double notaParte2;

	Prova (double n1, double n2) {
		this.notaParte1 = n1;
		this.notaParte2 = n2;
	}

	public double calcularNotaTotal() {
		double notaFinal = (this.notaParte1 + this.notaParte2);

		return notaFinal > 10 ? 10 : notaFinal;
	}
}
