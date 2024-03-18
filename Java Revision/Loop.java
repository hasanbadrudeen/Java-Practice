import java.util.Scanner;
public class Loop{
    public static void main(String[] args){
        // int i;
        // for (i=1;i<6;i++){
        //     System.out.println(i);
        // }
        // System.out.println(i);
        // int i = 1 ;
        // while(i<=6){
        //     System.out.println(i);
        //     i++;
        // }

        // int i = 1 ;
        // do{
        //     System.out.println(i);
        //     i++;
        // }
        // while(i==7);

        // int i = 1 ;
        // int n ;
         Scanner scanner = new Scanner(System.in);

        // System.out.println("How many stars do you want");
        // n = scanner.nextInt();
        //  while(i<=n){
        //     System.out.print("*");
        //     i++;
        //  }

//         int i;
//         for( int j = 1 ; j<= 10 ; j++){
//  for (i=1;i<6;i++){
//                System.out.println(i);

//         }
//         System.out.println(

//         );


double n , sum = 0.0 ;
System.out.println("enter the number . enter the negative number to stop :");


// while(true){
// n=scanner.nextDouble();
// if(n < 0.0){
//     break;
// }
// sum = sum + n ;
// }
//        System.out.println(sum);
        

        for(int i = 1 ; i<=10 ; i++){
            if(i == 6){
                continue;
            }
            System.out.println(i);
        }
    }
}
