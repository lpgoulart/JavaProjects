/**
*	@author Leonardo Goulart
*	@version 1.0
*/


public class Main {
	static public void main ( String[] args ) {
		while ( Banco.running ) {
			Banco.update();
		}
 	}
}