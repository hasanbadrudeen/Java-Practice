import java.io.Console;

public class UserConsole{
public static void main(String[] args){
Console c = System.console();

System.out.println("Enter ur password");
char[] pass = c.readPassword();
String str = String.valueOf(pass);
System.out.println("ur pass " + str);
}

}