class MyCustomException extends Exception{
MyCustomException(){
super("Ilegal name error");
}

public String getMessage(){
return "Custom error";
}

}
public class Custom{
public static void main(String args[]){
try{
throw new MyCustomException();
}
catch(MyCustomException e){
System.out.println(e.getMessage());
e.printStackTrace();
}
}
}