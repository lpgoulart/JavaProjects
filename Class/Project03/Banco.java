/**
*	@author Leonardo Goulart
*	@version 1.0
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {

//------------------------------------------------------------
// Variaveis
	static ArrayList <ContaPoupanca> contasPoupanca  = new ArrayList <ContaPoupanca> ();
	static ArrayList <ContaEspecial> contasEspeciais = new ArrayList <ContaEspecial> ();
	static Scanner scan                              = new Scanner ( System.in );

	static boolean running = true;
	static int opcao = 0;
	static int num_conta;
	static int valor;
	static int continuar;
//------------------------------------------------------------

//------------------------------------------------------------
// Funcao Update
	static void update () {

		System.out.println ( "(1) Abrir uma conta poupanca"      );
		System.out.println ( "(2) Abrir uma conta especial\n"    );
		System.out.println ( "(3) Verificar conta poupanca"      );
		System.out.println ( "(4) Verificar conta especial\n"    );
		System.out.println ( "(5) Depositar em conta poupanca"   );
		System.out.println ( "(6) Depositar em conta especial\n" );
		System.out.println ( "(7) Depositar em conta poupanca"   );
		System.out.println ( "(8) Depositar em conta especial"   );
		System.out.print   ( "Selecione uma opcao: "             );
		opcao = scan.nextInt();

		opcaoSelecionada ( opcao );

		System.out.println ( "\nDigite:\n'1' para continuar\n'0' para sair" );
		continuar = scan.nextInt();

		if ( continuar == 1 ) {
			System.out.print("\033[H\033[2J"); 
		}
		else {
			running = false;
		}
	}
//------------------------------------------------------------

//------------------------------------------------------------
// Funcao opcaoSelecionada
	static void opcaoSelecionada ( int opcao ) {
			ContaPoupanca contaPoupanca;
			ContaEspecial contaEspecial;
		switch ( opcao ) {
			case 1:
				ContaPoupanca novaContaPoupanca = new ContaPoupanca ();
				contasPoupanca.add ( novaContaPoupanca );
			break;
			case 2:
				ContaEspecial novaContaEspecial = new ContaEspecial ();
				contasEspeciais.add ( novaContaEspecial );
			break;
			case 3:
				System.out.println ( "Digite o numero da conta" );
				num_conta = scan.nextInt();
				contasPoupancaVinculadas ( num_conta );
			break;
			case 4:
				System.out.println ( "Digite o numero da conta" );
				num_conta = scan.nextInt();
				contasEspeciaisVinculadas ( num_conta );
			break;
			case 5:
				System.out.println ( "Digite o numero da conta" );
				num_conta = scan.nextInt();
				contaPoupanca = contasPoupanca.get ( num_conta - 1 );
					System.out.println ( "Valor do deposito: " );
				valor = scan.nextInt();
				contaPoupanca.depositar ( valor );
				contasPoupanca.set ( num_conta - 1, contaPoupanca );
			break;
			case 6:
				System.out.println ( "Digite o numero da conta" );
				num_conta = scan.nextInt();
				contaEspecial = contasEspeciais.get ( num_conta - 1 );
					System.out.println ( "Valor do deposito: " );
				valor = scan.nextInt();
				contaEspecial.depositar ( valor );
				contasEspeciais.set ( num_conta - 1, contaEspecial );
			break;
			case 7:
				System.out.println ( "Digite o numero da conta" );
				num_conta = scan.nextInt();
				contaPoupanca = contasPoupanca.get ( num_conta - 1 );
					System.out.println ( "Valor do saque: " );
				valor = scan.nextInt();
				contaPoupanca.sacar ( valor );
				contasPoupanca.set ( num_conta - 1, contaPoupanca );
			break;
			case 8:
				System.out.println ( "Digite o numero da conta" );
				num_conta = scan.nextInt();
				contaEspecial = contasEspeciais.get ( num_conta - 1 );
					System.out.println ( "Valor do saque: " );
				valor = scan.nextInt();
				contaEspecial.sacar ( valor );
				contasEspeciais.set ( num_conta - 1, contaEspecial );
			break;
			default:
				System.out.print("\033[H\033[2J"); 
				System.out.println ( "Selecione uma opcao valida:" );
			break;
		}
	}
//------------------------------------------------------------

//------------------------------------------------------------
// Funcao que lista uma conta poupanca vinculada
	static void contasPoupancaVinculadas ( int numero_da_conta ) {
		ContaPoupanca.toString ( contasPoupanca.get ( numero_da_conta - 1 ) );
	}
//------------------------------------------------------------

//------------------------------------------------------------
// Funcao que lista uma conta especial vinculada
	static void contasEspeciaisVinculadas ( int numero_da_conta ) {
		ContaEspecial.toString ( contasEspeciais.get ( numero_da_conta - 1 ) );
	}
//------------------------------------------------------------

}
