class Box{
    int length;
    int breadth;
    int height;

   int volume (){
    return
    length*breadth*height;
   }
}

public class Method{



//   void BoxVolume(int length ,int breadth , int height){
//         int vol;
//         vol = length * breadth * height;
//         System.out.println("vol is " + vol);
//     }


//   static void println(){
//         System.out.println("------------");
//     }



    public static void main(String[] args){

        
Box b = new Box();
b.length = 10 ;
b.breadth = 20 ;
b.height = 30 ;
        // println();

        
       System.out.println(b.volume()) ;

    //     Method m = new Method();

    //   m. BoxVolume(2,4,6);
    //   m. BoxVolume(8,9,19);


    }
}