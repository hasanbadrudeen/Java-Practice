class Box{
    int length;
    int breadth;
    int height;
}

public class ClassObject{
    public static void main(String[] args){

        Box blackbox = new Box();
        blackbox.length = 10 ;
        System.out.println(blackbox.length );

        Box colorbox = new Box();
        colorbox.breadth = 46 ;
        System.out.println(colorbox.height);
    }
}