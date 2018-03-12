//Leonardo Goulart
//UFRN
//Java Programming language

import java.util.Scanner;

public class SchoolSystem {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);

		//Aluno 1
			System.out.println("Entre com os dados do primeiro aluno:\n");
			System.out.println("Prova 1: P1 - P2");
			double n1 = scan.nextDouble();;
			double n2 = scan.nextDouble();;
			Prova p1 = new Prova(n1,n2);
			System.out.println("Prova 2: P1 - P2");
			double n3 = scan.nextDouble();;
			double n4 = scan.nextDouble();;
			Prova p2 = new Prova(n3,n4);
			Aluno a1 = new Aluno (p1,p2);
		//Aluno 2
			System.out.println("Entre com os dados do segundo aluno:\n");
			System.out.println("Prova 1: P1 - P2");
			double n5 = scan.nextDouble();;
			double n6 = scan.nextDouble();;
			Prova p3 = new Prova(n5,n6);
			System.out.println("Prova 2: P1 - P2");
			double n7 = scan.nextDouble();;
			double n8 = scan.nextDouble();;
			Prova p4 = new Prova(n7,n8);
			Aluno a2 = new Aluno (p3,p4);
		//Aluno 3
			System.out.println("Entre com os dados do terceiro aluno:\n");
			System.out.println("Prova 1: P1 - P2");
			double n9 = scan.nextDouble();;
			double n10 = scan.nextDouble();;
			Prova p5 = new Prova(n9,n10);
			System.out.println("Prova 2: P1 - P2");
			double n11 = scan.nextDouble();;
			double n12 = scan.nextDouble();;
			Prova p6 = new Prova(n11,n12);
			Aluno a3 = new Aluno (p5,p6);

			Turma t1 = new Turma(a1,a2,a3);

			System.out.println("Nota final da turma:");
			System.out.println (t1.calcularMedia());
	}
}
