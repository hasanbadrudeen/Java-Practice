import java.io.*;

public class Buff{
public static void main(String[] args)throws IOException {
InputStreamReader in = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(in);

System.out.println("Whats ur name ?");
String str = br.readLine();

System.out.println("Whats ur age");
int age = Integer.parseInt( br.readLine());


}
}