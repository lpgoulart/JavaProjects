import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

class CreateFiles {
 
    public static void main(String[] args) {
          try{
             // create new file
             String content = "Potato";
             String path="~/JavaProjects/JavaIntroduction/FirstSteps/test.txt";
             File file = new File(path);
   
                // if file doesnt exists, then create it
                if (!file.exists()) {
                    file.createNewFile();
                }
   
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                // write in file
                bw.write(content);
                // close connection
                bw.close();
          }catch(Exception e){
              System.out.println(e);
          }
         
    }
}

