public class meaw25 {
    public static void main(String args[]) {
    int  meaw=5;
    for(int i=1;i<= meaw;i++){
       for(int j=i;j< meaw;j++){
          System.out.print("*");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print( meaw-i+1);
                }
                for(int j=i;j<= meaw;j++){
                   System.out.print("*");
                   }
                   System.out.println();
             }
      }    
}