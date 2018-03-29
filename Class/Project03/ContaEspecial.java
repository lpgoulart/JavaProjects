/**
*	@author Leonardo Goulart
*	@version 1.0
*/

public class ContaEspecial extends ContaBancaria {

	private double limite;

//------------------------------------------------------------
	/**
	*	@param Construtor da classe Conta Bancaria
	*/
		ContaEspecial () {
			super ();
		}

//------------------------------------------------------------
	/**
	*	@param Valor inteiro que sera redizido da variavel saldo
	*	@return Novo valor de variavel saldo
	*/	
		public double sacar ( int valor_Sacado ) {
			double saldo = getSaldo();
			if ( saldo - valor_Sacado < this.limite ) {
				System.out.println ("Voce nao pode sacar esse valor");
				return 0.0;
			}
			else {
				return saldo - valor_Sacado;
			}
		}

//------------------------------------------------------------
	/**
	*	@param Recebe um objeto do tipo conta especial
	*	@return Print das informacoes do objeto
	*/	
		static public void toString ( ContaEspecial conta ) {
			System.out.println ( "Cliente: " + conta.getNome_Cliente () );
			System.out.println ( "Numero da conta: " + conta.getNumero_Conta () );
			System.out.println ( "Saldo disponivel: " + conta.getSaldo () );
		}  

}