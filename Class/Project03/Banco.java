/**
*	@author Leonardo Goulart
*	@version 1.0
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {

	static ArrayList <ContaPoupanca> contasPoupanca  = new ArrayList <ContaPoupanca> ();
	static ArrayList <ContaEspecial> contasEspeciais = new ArrayList <ContaEspecial> ();
	static Scanner scan                              = new Scanner ( System.in );

	static boolean running = true;
	static int opcao = 0;
	static int num_conta;
	static int continuar;


	static void update () {

		System.out.println ( "(1) Abrir uma conta poupanca"   );
		System.out.println ( "(2) Abrir uma conta especial\n" );
		System.out.println ( "(3) Verificar conta poupanca"   );
		System.out.println ( "(4) Verificar conta especial"   );
		System.out.print   ( "Selecione uma opcao: "          );
		opcao = scan.nextInt();

			if ( opcao == 1 ) {
				ContaPoupanca novaContaPoupanca = new ContaPoupanca ();
				contasPoupanca.add ( novaContaPoupanca );
			}
			else if ( opcao == 2 ) {
				ContaEspecial novaContaEspecial = new ContaEspecial ();
				contasEspeciais.add ( novaContaEspecial );
			}
			else if ( opcao == 3 ) {
				System.out.println ( "Digite o numero da conta" );
				num_conta = scan.nextInt();
				contasPoupancaVinculadas ( num_conta );
			}
			else if ( opcao == 4 ) {
				System.out.println ( "Digite o numero da conta" );
				num_conta = scan.nextInt();
				contasEspeciaisVinculadas ( num_conta );
			}
		System.out.println ( "\nDigite:\n'1' para continuar\n'0' para sair" );
		continuar = scan.nextInt();

			if ( continuar == 1 ) {
				System.out.print("\033[H\033[2J"); 
			}
			else {
				running = false;
			}
	}

	static void contasPoupancaVinculadas ( int numero_da_conta ) {
		ContaPoupanca.toString ( contasPoupanca.get ( numero_da_conta - 1 ) );
	}

	static void contasEspeciaisVinculadas ( int numero_da_conta ) {
		ContaEspecial.toString ( contasEspeciais.get ( numero_da_conta - 1 ) );
	}


}