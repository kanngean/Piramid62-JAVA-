public class meaw07 {
    public static void main(String args[]){
    int meaw=5;
    for(int i=1;i<=meaw;i++){
        for(int j=1;j<=meaw-i;j++){
           System.out.print(" ");
           }
              for(int j=1;j<=i;j++){
                System.out.print(j);
                }
                System.out.print(i);
                   for(int j=i;j>=1;j--){
                      System.out.print(j);
                      }
                      System.out.println();
              }
       }
}