// class Except {
//     public static void main (String[] args) {
//       int a=50;
//       int b=0;
//         try{
//           System.out.println(a/b);
//         }
//       catch(ArithmeticException e){
//         e.printStackTrace();
//       }
//     }
// }





//program to print the exception information using toString() method

//class Except {
   // public static void main (String[] args) {
    //   int a=5;
    //   int b=0;

    // Taking an empty string
   // String str = null;
    // Getting length of a string
    
       // try{
        //   System.out.println(a/b);

       // System.out.println(str.length());    }
    //  catch(ArithmeticException e){
     //   System.out.println(e.toString());
    //  }

 /*  int n = 18;
    trynumber(n);
    n = 7;
    trynumber(n);
  }

  public static void trynumber(int n) {
    try {
      checkEvenNumber(n);
      System.out.println(n + " is even.");
    } catch (IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void checkEvenNumber(int number) {
    if (number % 2 != 0) {
      throw new IllegalArgumentException(number + " is odd.");
    }
  }
}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_Read {
  public static void main(String[] args) {
    try {
      readFile("test1.txt");
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void readFile(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    Scanner scanner = new Scanner(file);

    // Read and process the contents of the file
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      System.out.println(line);
    }

    scanner.close();
  }
}
//mport java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

 class File_Read {
  public static void main(String[] args) {
    try {
      readFile("test1.txt");
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void readFile(String fileName) throws FileNotFoundException {
 File file = new File(fileName);
    Scanner scanner = new Scanner(file);

    // Read and process the contents of the file
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      System.out.println(line);
    }

    scanner.close();
  }
}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Empty_File_Check {
  public static void main(String[] args) {
    try {
      checkFileNotEmpty("test1.txt");
      System.out.println("File is not empty.");
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (EmptyFileException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void checkFileNotEmpty(String fileName) throws FileNotFoundException, EmptyFileException {
    File file = new File(fileName);
    Scanner scanner = new Scanner(file);

    if (!scanner.hasNextLine()) {
      scanner.close();
      throw new EmptyFileException("File is empty.");
    }

    scanner.close();
  }
}

class EmptyFileException extends Exception {
  public EmptyFileException(String message) {
    super(message);
  }
}
import java.util.*;

public class Duplicate_Number_Check {
  public static void main(String[] args) {
    try {
      List < Integer > numbers = readNumbersFromUser();
      checkDuplicates(numbers);
      System.out.println("No duplicate numbers!");
    } catch (Duplicate_Number_Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static List < Integer > readNumbersFromUser() {
    List < Integer > numbers = new ArrayList < > ();
    Scanner scanner = new Scanner(System.in);

    System.out.print("How many numbers do you want to input? ");
    int count = scanner.nextInt();

    System.out.println("Input the integers:");
    for (int i = 0; i < count; i++) {
      int num = scanner.nextInt();
      numbers.add(num);
    }

    scanner.close();
    return numbers;
  }

  public static void checkDuplicates(List < Integer > numbers) throws Duplicate_Number_Exception {
    Set < Integer > uniqueNumbers = new HashSet < > ();

    for (int num: numbers) {
      if (uniqueNumbers.contains(num)) {
        throw new Duplicate_Number_Exception("Duplicate number found: " + num);
      }
      uniqueNumbers.add(num);
    }
  }
}
class Duplicate_Number_Exception extends Exception {
  public Duplicate_Number_Exception(String message) {
    super(message);
  }
}
 class Vowel_Check {
  public static void main(String[] args) {
    try {
      String text = "Java handling and managing exceptions ";
      // String text = "Typy gyps fly.";
      System.out.println("Original string: " + text);
      checkVowels(text);
      System.out.println("String contains vowels.");
    } catch (NoVowelsException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void checkVowels(String text) throws NoVowelsException {
    boolean containsVowels = false;
    String vowels = "aeiouAEIOU";

    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);
      if (vowels.contains(String.valueOf(ch))) {
        containsVowels = true;
        break;
      }
    }
    if (!containsVowels) {
      throw new NoVowelsException("String does not contain any vowels.");
    }
  }
}
class NoVowelsException extends Exception {
  public NoVowelsException(String message) {
    super(message);
  }
}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_Read {
  public static void main(String[] args) {
    try {
      readFile("test1.txt");
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void readFile(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    Scanner scanner = new Scanner(file);

    // Read and process the contents of the file
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      System.out.println(line);
    }

    scanner.close();
  }
}*//**
 * File_Read
 
 public class File_Read {

  
//import java.io.*;

class GFG {
    public static void main (String[] args) {
      int a=5;
      int b=0;
        try{
          System.out.println(a/b);
        }
      catch(ArithmeticException e){
        e.printStackTrace();
      }
    }
}
 }*/
 import java.io.*;

class GFG1 {
    public static void main (String[] args) {
      int a=5;
      int b=2;
        try{
          System.out.println(a/b);
        }
      catch(ArithmeticException e){
        System.out.println(e.toString());
      }
    }
  }


