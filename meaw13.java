public class meaw13{
    public static void main(String args[]){
    int meaw=5;
    for(int i=1;i<=meaw;i++){
       for(int j=1;j<i*2-1;j++){
          System.out.print(" ");
          }
            for(int j=meaw*2-(i*2-1);j>=1;j--){
                System.out.print(j);
                }
                System.out.println();
           }
     }
}