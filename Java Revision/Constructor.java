class Box{

    // Box(int l , int b , int h){
    //      length = l;
    //      breadth = b;
    //      height = h ;
    // }

    Box(int l){
        length = breadth = height = l;
    }
}

public class Constructor{
    public static void main(String[] args){

        // Box b1 = new Box(3,6,8);
        // System.out.println(b1.length);

        Box b2 = new Box(12);
        System.out.println(b2.height);


    }
}