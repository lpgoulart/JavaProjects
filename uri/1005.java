//Leonardo Goulart
//UFRN
//Java Programming language

import java.util.Scanner;

class uri1005 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		double num01 = scan.nextDouble();
		double num02 = scan.nextDouble();
		double media = ((num01 * 3.5) + (num02 * 7.5))/11;

		System.out.println("MEDIA = " + String.format("%.5f",media));	
	}
}
