import java.util.Scanner;

public class Inputdemo{
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name ?");
        String name = scanner.nextLine();

        System.out.println(" what is your age ?");
        int age = scanner.nextInt();
        scanner.nextLine();

         System.out.println(" what is your email ?");
        String email = scanner.nextLine();


        System.out.println(" Hello " + name);
        System.out.println(" Your age is  " + age);
        System.out.println(" Your email is  " + email);

    }
}