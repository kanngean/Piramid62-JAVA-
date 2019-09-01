public class meaw36 {
    public static void main(String args[]){
    int meaw=3;
    for(int i=1;i<=meaw;i++){
        for(int j=i;j<=meaw;j++){
           System.out.print(j);
           }
           for(int j=1;j<=i*2-1;j++){
              System.out.print("*");
              }
              for(int j=meaw;j>=i;j--){
                  System.out.print(j);
                  }
                  System.out.println();
                  }
                  for(int i=meaw-1;i>=1;i--){
                     for(int j=i;j<=meaw;j++){
                         System.out.print(j);
                         }
                         for(int j=1;j<=i*2-1;j++){
                             System.out.print("*");
                             }
                             for(int j=meaw;j>=i;j--){
                                System.out.print(j);
                                }
                                System.out.println();
                    }
         }    
}