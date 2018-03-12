//Leonardo Goulart
//UFRN
//Java Programming language
import java.util.Scanner;

class uri1006 {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		float num01 = scan.nextFloat();
		float num02 = scan.nextFloat();
		float num03 = scan.nextFloat();
		float media = ((num01 * 2) + (num02 * 3) + (num03 * 5))/10;

		System.out.println("MEDIA = " + String.format("%.1f",media));	
	}
}
