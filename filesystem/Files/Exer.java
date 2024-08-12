import java.io.File;

public class Exer {
     public static void main(String [] args)
     {
        File file = new File("/home/students/");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}