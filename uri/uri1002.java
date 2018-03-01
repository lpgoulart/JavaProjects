// Leonardo Goulart
// Java Programming language

import java.util.Scanner;

class uri1002 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		double R = scan.nextDouble();
		double pi = 3.14159;
		R = R*R*pi;
		System.out.printf( "A=" +  String.format("%.4f",R) + "\n");
	}
}
