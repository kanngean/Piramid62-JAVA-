public class meaw22 {
    public static void main(String args[]){
    int meaw=5;
    for(int i=1;i<=meaw;i++){
       System.out.print("*");
       for(int j=1;j<i;j++){
          System.out.print(" ");
          }
          for(int j=i;j<=meaw*2-i;j++){
             System.out.print(i);
             }
             for(int j=i;j>1;j--){
                System.out.print(" ");
                }
                System.out.println("*");
           }
     }
}