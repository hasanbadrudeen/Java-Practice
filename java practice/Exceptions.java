public class Exceptions{

public static void main(String args[]){
int a = 10 , b = 0 ;
int c = 0 ;
try{
c = a / b ;
System.out.println(c);
}
catch(ArithmeticException e){

e.printStackTrace();
}
}
}