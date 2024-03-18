public class CmdLineArgs{

    public static void main(String[] args){

    //   String name = args[0];
    //   int num = Integer.parseInt(args[1]);
    //   System.out.println("hasan Badrudeen");
    //   System.out.println(3);

    // for(int i = 0 ; i < args.length ; i++){
    //     System.out.println(args[i]);
    // }
    // }


    int age = Integer.parseInt(args[0]);
    System.out.println(age);

    if(age > 18){
        System.out.println("eligible");
    }
    else{
        System.out.println("not eligible");
    }
}
}