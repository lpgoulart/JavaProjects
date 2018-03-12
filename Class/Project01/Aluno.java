//Leonardo Goulart
//UFRN
//Java Programming language


public class Aluno {
	private Prova prova1;
	private Prova prova2;

	Aluno (Prova p1, Prova p2) {
		this.prova1 = p1;
		this.prova2 = p2;
	}

	public double calcularMedia() {
		return ((this.prova1.calcularNotaTotal() + this.prova2.calcularNotaTotal())/2.0);
	}

}
