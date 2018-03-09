import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter; 
import java.util.ArrayList;

class testando {

	public static void main(String[] args) {
		try 
		{
			boolean entry = true;
			String path = "../JavaIntroduction/FirstSteps/test.java";
			File file = new File(path);
				if (!file.exists()) {
				    file.createNewFile();
				}
			Scanner scan = new Scanner(System.in);
			ArrayList<String> lista = new ArrayList<String>();

			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			    BufferedWriter bw = new BufferedWriter(fw);
			
			String line;
			String exit = "exit";

			while (entry) {
				
				line = scan.nextLine();
				
				if (line.equals(exit)) {
					entry = false;
				} else {
					lista.add (line);
				}
				
			}
			
				do 
				{
					bw.write(lista.remove(0) + "\n");
				} while (lista.size() != 0);
				bw.close();

		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}

