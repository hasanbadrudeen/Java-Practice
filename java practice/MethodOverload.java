class MathOperations{

int add(int a , int b){
return a + b ;
}

double add (double a , double b){
return a + b;
}
}



public class MethodOverload {
public static void main(String args[]){
MathOperations math = new MathOperations();
int sum1 = math.add(2 , 3);
double sum2 = math.add(2.5 , 3.7);
System.out.println("Sum1:" + sum1);
System.out.println("Sum2:" + sum2);




}
}