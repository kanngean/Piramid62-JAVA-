public class meaw06 {
    public static void main(String args[]) {
    int meaw=7;
       for(int i=meaw;i>=1;i--) { 
          for(int j=meaw;j>i;j--) {
             System.out.print(" ");
             }
            	for(int j=1;j<=i*2-1;j++) {
                   System.out.print((j%2));
            	   }
                   System.out.println();
       	 	}
     }
}