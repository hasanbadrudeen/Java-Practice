
import java.util.Scanner;
public class UserInput{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Whats your name ?");
String name = scanner.nextLine();

System.out.println("hello" + name);

System.out.println("Whats your age ?");
int age = scanner.nextInt();
System.out.println("your major");
}
}