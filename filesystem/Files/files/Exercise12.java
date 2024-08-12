/*import java.io.File;
import java.util.Date;

public class Example7 {
       public static void main(String[] args) {
       File file = new File("test.txt");
       Date date=new Date(file.lastModified());
	   System.out.println("\nThe file was last modified on: "+date+"\n");	   
     }
}*/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class Exercise12 {
 
    public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try {
             BufferedReader br = new BufferedReader(new FileReader("/home/students/test.txt"));
             while (strLine != null)
             {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
             br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
     }
}
