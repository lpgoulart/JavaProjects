/**
*	@author Leonardo Goulart
*	@version 1.0
*/

public class ContaPoupanca extends ContaBancaria {

	private int dia_de_Rendimento;

//------------------------------------------------------------
	/**
	*	@param Construtor da classe Conta Bancaria
	*/
		ContaPoupanca () {
			super ();
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
	*	@param Recebe um objeto do tipo conta poupanca
	*	@return Print das informacoes do objeto
	*/	
		static public void toString ( ContaPoupanca conta ) {
			System.out.println ( "Cliente: " + conta.getNome_Cliente () );
			System.out.println ( "Numero da conta: " + conta.getNumero_Conta () );
			System.out.println ( "Saldo disponivel: " + conta.getSaldo () );
		}  


}