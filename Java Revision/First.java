import java.util.Scanner;

public class First{
    public static void main(String args []){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        if(num>0){
            System.out.println(num + "is positive");
        }
        else if(num==0){
            System.out.println(num + "is neutral");
        }
        else{
            System.out.println(num + "is negative");
        }
    }
}