import java.io.*;

public class ConsoleEx{

public static void main(String[] args){

System.out.println("Whts ur name");
String name = System.console().readLine();


System.out.println("enter password :");
char[] pass = System.console().readPassword();
}

}