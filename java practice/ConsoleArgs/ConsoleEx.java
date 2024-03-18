import java.io.Console;
public class ConsoleEx{
public static void main(String[] args){
Console console = System.console();
String name = console.readLine();
char[] password = console.readPassword();
String passwordAsString = " ";
for(int i=0;i<password.length;i++){
passwordAsString += password[i];
}
if(name.equals(args[0]) && args[1].equals(passwordAsString)){
System.out.println("Login Success");
}
else{
System.out.println("Login Failed");
}
}
}