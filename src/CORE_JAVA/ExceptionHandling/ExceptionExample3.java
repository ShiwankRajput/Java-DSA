package CORE_JAVA.ExceptionHandling;

/*

    checked exceptions example ->


*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;     //for checked exception we need to import that exception class

public class ExceptionExample3 {

    public static void main(String[] args) throws FileNotFoundException{

        // Checked Exception (checked at compile time) :->  FileReader file1 = new FileReader("a.txt");

        try{
            message2();
            throw new FileNotFoundException("FILE NOT FOUND");
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }

        System.out.println("Hello");

    }

    public static void message2() throws FileNotFoundException{
        message1();
    }

    public static void message1() throws FileNotFoundException {
        FileReader file1 = new FileReader("a.txt");
    }


    // note : for checked exception we need to use both throws and throw but for unchecked we can use throw
    // without using throws keyword in method signature
    public void checked() throws IOException{
        throw new IOException();
    }

    public void unChecked(){
        throw new ArithmeticException();
    }

}
