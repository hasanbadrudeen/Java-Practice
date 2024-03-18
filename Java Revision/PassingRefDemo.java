public class PassingRefDemo{

 static void increment(int a){
    a++;
    }

   Box doubleBox(){
        Box temp = new Box(2*length,2*breadth,2*height);
        return temp
    }

    public static void main(String[] args){
        int a = 10 ;
        // increment(a);
        // System.out.println(a);
        int b = a++ ;

        Box b3 = b1.doubleBox();

        System.out.println(a);
    }
}