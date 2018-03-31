/**
*	@author Leonardo Goulart
*	@version 1.0
*/

import java.util.Scanner;

public class ContaPoupanca extends ContaBancaria {
	Scanner scan = new Scanner ( System.in );
	private int dia_de_Rendimento;

//------------------------------------------------------------
	/**
	*	@param Construtor da classe Conta Bancaria
	*/
		ContaPoupanca () {
			super ();
			System.out.println ( "Cadastre o dia para rendimento" );
			this.dia_de_Rendimento = scan.nextInt();
		}

//------------------------------------------------------------
	/**
	*	@param Recebe uma taxa de rendimento e atualiza o saldo
	*/	
		public void calcularNovoSaldo ( int rendimento ) {
			double novoSaldo = getSaldo() * rendimento;
			setSaldo ( novoSaldo );
		}

//------------------------------------------------------------
		/**
		*	@return Retorna o dia de rendimento da conta
		*/
		public int rendimento () {
			return this.dia_de_Rendimento;
		}

//------------------------------------------------------------
	/**
	*	@param Recebe um objeto do tipo conta poupanca
	*	@return Print das informacoes do objeto
	*/	
		static public void toString ( ContaPoupanca conta ) {
			System.out.println ( "Cliente          : " + conta.getNome_Cliente () );
			System.out.println ( "Numero da conta  : " + conta.getNumero_Conta () );
			System.out.println ( "Saldo disponivel : " + conta.getSaldo ()        );
			System.out.println ( "Dia de rendimento: " + conta.rendimento()       );
		}  

}