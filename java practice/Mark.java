public class Mark{
public static void main(String[] args){
int m1 = 50 , m2 = 25 , m3 = 100 , m4 = 75 , m5 = 35 ;
int total = m1+m2+m3+m4+m5;
System.out.println(total);
float avg = total/5;
System.out.println(avg);
if(avg <50){
System.out.println('F');
else if(avg>50 && avg<=60){
System.out.println('C');
else if(avg>60 && avg<=70){
System.out.println('B');
else if(avg>70 && avg<=80){
System.out.println('B+');
else if(avg>80 && avg<=90){
System.out.println('A');
else{
System.out.println('A+')
}
}
}
}
} 