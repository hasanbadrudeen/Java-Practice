public class ExceptionDemo{

public static void main(String args[]){
int a = 10 , b = 0 ;
int c = 0 ;
try{
int arr[] = null;
System.out.println(arr[1]);
}
catch(ArithmeticException e){

}
catch(NullPointerException e){
e.printStackTrace();
}

finally{

System.out.println("Finally");

}

System.out.println("hi");

}
}