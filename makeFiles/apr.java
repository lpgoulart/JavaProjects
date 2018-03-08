import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter; 
import java.util.ArrayList;

class testando {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		ArrayList<String> lista = new ArrayList<String>();

		System.out.println(line);

		lista.add(line);
		lista.add("frase");
		int size = lista.size();
		System.out.println(size);
		int index = 0; 
		
		do {
			System.out.println("removendo item " + (index + 1));
			System.out.println(lista.remove(0));
			index++;
			size = lista.size();
		} while (size != 0);
	}
}