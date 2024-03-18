import java.io.*;

public class BuffRead{

public static void main(String[] args) throws IOException {

InputStreamReader in = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(in);

System.out.println("whats your name ?");
String name = br.readLine();

System.out.println(name + "Badrudeen");
 
System.out.println("Whats ur age");

int age = Integer.parseInt( br.readLine());

System.out.println(" you valid for voting");
}
}N