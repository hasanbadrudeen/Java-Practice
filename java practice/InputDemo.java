
import java.util.Scanner;

public class InputDemo{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Whats ur name ?");
String name = s.nextLine();
System.out.println("welcome" + name);

System.out.println("Whats ur age ?");
int age = s.nextInt();
System.out.println("ur age is" + age);
}
}
