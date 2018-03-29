/**
*	@author Leonardo Goulart
*	@version 1.0
*/


import java.util.Scanner;

public class ContaBancaria {

	Scanner scan = new Scanner ( System.in );

	private String nome_Cliente;
	private int numero_Conta;
	private double saldo;

//------------------------------------------------------------
	/**
	*	@param Construtor da classe Conta Bancaria
	*/
		ContaBancaria () {
			System.out.println ( "Nome do cliente: " );
			this.nome_Cliente = scan.nextLine();
			System.out.println ( "Digite o numero da conta: " );
			this.numero_Conta = scan.nextInt();
			System.out.println ( "Saldo da conta: " );
			this.saldo = scan.nextDouble();
		}

//------------------------------------------------------------
	/**
	*	@param Valor inteiro que sera redizido da variavel saldo
	*	@return Novo valor de variavel saldo
	*/	
		public double sacar ( int valor_Sacado ) {
			return this.saldo - valor_Sacado;
		}

//------------------------------------------------------------
	/**
	*	@param Valor inteiro que sera adicionado da variavel saldo
	*	@return Novo valor de variavel saldo
	*/	
		public double depositar ( int valor_Depositado ) {;
			return this.saldo + valor_Depositado;
		}

//------------------------------------------------------------
	/**
	*	@param Recebe um novo valor para variavel saldo
	*/
		public void setSaldo( double novoValor ) {
			this.saldo = novoValor;
		}

	/**
	*	@return Retorna o valor da variavel saldo
	*/
		public double getSaldo () {
			return this.saldo;
		}

//------------------------------------------------------------
	/**
	*	@return Retorna o valor da variavel nome do cliente
	*/
		public String getNome_Cliente () {
			return this.nome_Cliente;
		}

//------------------------------------------------------------
	/**
	*	@return Retorna o valor da variavel numero da conta
	*/
		public int getNumero_Conta () {
			return this.numero_Conta;
		}




}