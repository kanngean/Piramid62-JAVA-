public class meaw21 {
    public static void main(String args[]){
    int meaw=5;
    for(int i=1;i<=meaw;i++){
       for(int j=0;j<=((meaw*2)-(i+3));j++){
          System.out.print("*");
          }
          System.out.print(i);
           for(int j=i;j>=1;j--){
              System.out.print("*");
              }
              System.out.println((meaw*2)-(i+2));
          }
     }
}