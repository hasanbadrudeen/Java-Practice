public class VarArgsDemo{


    static int minValue(int... vals){

        int min = Integer.MAX_VALUE;
        for(int k:vals){
            if(k<min)
            min = k;
        }
        return min ;
        


        }


    public static void main(String[] args){

      int m = minValue();
      System.out.println(m);
    }


}