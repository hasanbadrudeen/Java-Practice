import java.util.Scanner;

public class SwitchDemo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         int a , b ;

        System.out.println("Enter First Number :");
        a = scanner.nextInt();

        System.out.println("Enter Second Number :");
        b = scanner.nextInt();

        char operator;
        System.out.println("Enter the opertor + , - , * , / or % : " );
        operator = scanner.next().charAt(0);

        switch(operator){
            case '+' :
                System.out.println(a + "+" + b + "=" + (a+b));
                break;

                case '-' :
                System.out.println(a + "-" + b + "=" + (a-b));
                break;

                case'*' :
                System.out.println(a + "*" + b + "=" + (a*b));
                break;

                case'/' :
                System.out.println(a + "/" + b + "=" + (a/b));
                break;

                case'%' :
                System.out.println(a + "%" + b + "=" + (a%b));
                break;

                default:
                    System.out.println("operator not match");
        }




    }
}