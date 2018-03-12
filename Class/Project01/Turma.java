//Leonardo Goulart
//UFRN
//Java Programming language


public class Turma {
	private Aluno a1;
	private Aluno a2;
	private Aluno a3;

	Turma ( Aluno aluno1, Aluno aluno2, Aluno aluno3 ) {
		this.a1 = aluno1;
		this.a2 = aluno2;
		this.a3 = aluno3;
	}

	public double calcularMedia() {
		return ((a1.calcularMedia() + a2.calcularMedia() + a3.calcularMedia())/3.0);
	}

}
